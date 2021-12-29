package com.ayyappa.apt.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StateTester {

	public static void main(String[] args) {
		StateDTO stateDto1 = new StateDTO("kA", 28, 340, 1500465.50f, true);
		StateDTO stateDto2 = new StateDTO("AP", 24, 340, 1500465.50f, true);
		StateDTO stateDto3 = new StateDTO("", 28, 340, 1500465.50f, true);
		StateDTO stateDto4 = new StateDTO("kerala", 28, 340, 1500465.50f, true);
		StateDTO stateDto5 = new StateDTO("maharastra", 28, 340, 1500465.50f, true);
		StateDTO stateDto6 = new StateDTO("punjab", 28, 340, 1500465.50f, true);
		StateDTO stateDto7 = new StateDTO("up", 28, 340, 1500465.50f, true);
		StateDTO stateDto8 = new StateDTO("bihar", 28, 340, 1500465.50f, true);
		StateDTO stateDto9 = new StateDTO("rajastan", 28, 340, 1500465.50f, true);
		StateDTO stateDto10 = new StateDTO("gujrat", 28, 340, 1500465.50f, true);

		List<StateDTO> list = new ArrayList<StateDTO>();
		list.add(stateDto1);
		list.add(stateDto2);
		list.add(stateDto3);
		list.add(stateDto4);
		list.add(stateDto5);
		list.add(stateDto6);
		list.add(stateDto7);
		list.add(stateDto8);
		list.add(stateDto9);
		list.add(stateDto10);

		boolean remove = list.remove(stateDto10);
		System.out.println(remove);

		boolean contain = list.contains(stateDto9);
		System.out.println(contain);

		int size = list.size();
		System.out.println(size);

		Iterator<StateDTO> it = list.iterator();
		while (it.hasNext()) {
			StateDTO stateDto = it.next();
			System.out.println(stateDto);
		}

	}

}
