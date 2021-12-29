package com.ayyappa.apt.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PalaceTester {

	public static void main(String[] args) {
		PalaceDto palace = new PalaceDto("MysorePalce", "mysore", false, true, 20);
		PalaceDto palace2 = new PalaceDto("BanglorePalace", "banglore", true, false, 60);
		PalaceDto palace3 = new PalaceDto("cityPalace", "udaipur", false, true, 70);
		PalaceDto palace4 = new PalaceDto("vegapalace", "mumbai", false, true, 90);
		PalaceDto palace5 = new PalaceDto("lakshmivilas", "maharashtra", false, true, 110);
		PalaceDto palace6 = new PalaceDto("jalmahal", "jaipur", false, true, 900);
		PalaceDto palace7 = new PalaceDto("ujjyanta", "agartala", false, true, 101);
		PalaceDto palace8 = new PalaceDto("alhambra", "sothern", false, true, 201);
		PalaceDto palace9 = new PalaceDto("lakepalace", "delhi", false, true, 255);

		List<PalaceDto> list = new ArrayList<PalaceDto>();

		list.add(palace);
		list.add(palace9);
		list.add(palace8);
		list.add(palace7);
		list.add(palace6);
		list.add(palace5);
		list.add(palace4);
		list.add(palace3);
		list.add(palace2);

		System.out.println(list.size());
		list.remove(palace9);
		System.out.println(list.size());
		System.out.println(list.contains(palace8));

		Iterator<PalaceDto> itr = list.iterator();
		while (itr.hasNext()) {
			PalaceDto element = itr.next();
			System.out.println(element);

		}

	}

}
