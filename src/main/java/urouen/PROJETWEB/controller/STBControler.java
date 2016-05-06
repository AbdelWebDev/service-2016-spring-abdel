package urouen.PROJETWEB.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Client;
import model.Equipe;
import model.ExigenceFonct;
import model.Fonctionalite;
import model.STB;
import model.STBE;
import model.STBList;

/**
 * @author katia & amri abdelouhab
 *
 */

@Controller

public class STBControler {
	STBList stbe;
	Map<Integer, STB> m;
	List<Client> client = new LinkedList<Client>();
	List<Equipe> equipe = new LinkedList<Equipe>();
	List<Fonctionalite> fonctionalite = new LinkedList<Fonctionalite>();
	List<ExigenceFonct> exigfonc = new LinkedList<ExigenceFonct>();

	public STBControler() {
		stbe = new STBList();

		m = new HashMap<Integer, STB>();
		Client client1 = new Client("univ rouen", "AMRI Abdelouhab","76000");
		Client client2 = new Client("univ rouen", "AMRI1 Abdelouhab1","76000");
		Equipe eq1 = new Equipe("abd", "abd");
		ExigenceFonct ef = new ExigenceFonct("1", "desc e f", "1");
		Fonctionalite fc = new Fonctionalite("description de fonc", "1", exigfonc);
		client.add(client1);
		client.add(client2);
		equipe.add(eq1);
		exigfonc.add(ef);
		fonctionalite.add(fc);

		STB stb = new STB("Amri Abdelouhab", "2.0", "satestb", "commentairestb", "descriptionstb", client, equipe,
				fonctionalite, exigfonc);

		STB stb2 = new STB("Belarbi Katia", "2.0", "satestb", "commentairestb", "descriptionstb", client, equipe,
				fonctionalite, exigfonc);
	
		m.put(STBList.nextid, stb);
		stbe.ajouter(new STBE(STBList.nextid, stb.getTitre(), stb.getVersion()));
		//
		m.put(STBList.nextid, stb2);
		stbe.ajouter(new STBE(STBList.nextid, stb2.getTitre(), stb2.getVersion()));

	}

	@RequestMapping(value = "/resume/{id}", method = RequestMethod.GET)
	public @ResponseBody STB getSTBInXML(@PathVariable Integer id) {

		STB stb = m.get(id);
		return stb;
	}

	@RequestMapping(value="/resume",method = RequestMethod.GET)
	public @ResponseBody STBList getSTBListInXML() {
		return stbe;
	}

	@RequestMapping(value="/depot",method = RequestMethod.POST)
	public @ResponseBody STB form(@RequestBody STB stb) {
		m.put(STBList.nextid, stb);
		STBE st = new STBE(STBList.nextid, stb.getTitre(), stb.getVersion());
		stbe.ajouter(st);
		System.out.println("Ajout éfféctue");
		return stb;
	}
}
