package com.ayyappa.apt.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ActorTester {

	public static void main(String[] args) {
		ActorDTO actorDto = new ActorDTO("salman", 54, 400, true, "mumbai");
		ActorDTO actorDto1 = new ActorDTO("srk", 56, 500, true, "mumbai");
		ActorDTO actorDto2 = new ActorDTO("sudeep", 54, 150, true, "bangalore");
		ActorDTO actorDto3 = new ActorDTO("amitab bachan", 54, 500, true, "mumbai");
		ActorDTO actorDto4 = new ActorDTO("puneet", 45, 250, false, "bangalore");
		ActorDTO actorDto5 = new ActorDTO("govinda", 54, 500, true, "maharastra");
		ActorDTO actorDto6 = new ActorDTO("sohail", 54, 500, true, "mumbai");
		ActorDTO actorDto7 = new ActorDTO("ranbeer kapoor", 54, 500, true, "mumbai");
		ActorDTO actorDto8 = new ActorDTO("ranveer singh", 54, 500, true, "delhi");
		ActorDTO actorDto9 = new ActorDTO("rajnikanth", 54, 500, true, "tamilnadu");
		ActorDTO actorDto10 = new ActorDTO("surya", 54, 500, true, "kerala");

		List<ActorDTO> list = new ArrayList<ActorDTO>();
		list.add(actorDto);
		list.add(actorDto1);
		list.add(actorDto2);
		list.add(actorDto3);
		list.add(actorDto4);
		list.add(actorDto5);
		list.add(actorDto6);
		list.add(actorDto7);
		list.add(actorDto8);
		list.add(actorDto9);
		list.add(actorDto10);

		boolean remove = list.remove(actorDto1);
		System.out.println(remove);

		boolean contain = list.contains(actorDto10);
		System.out.println(contain);

		int size = list.size();
		System.out.println(size);

		Iterator<ActorDTO> it = list.iterator();
		while (it.hasNext()) {
			ActorDTO actor = it.next();
			System.out.println(actor);
		}
		// list.clear();

	}

}
