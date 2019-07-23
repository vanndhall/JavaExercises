package com.jetbrains.Strumienie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Strumienie {
	public static void main(String[] args) {
		List<Mieszkanie> mList = Arrays.asList(
				new Mieszkanie("Wrocław","Psie Pole","Drukarska",
						3, 67.0f, true, 356000),
				new Mieszkanie("Warszawa","Mokotów","Kolejowa",
						2, 45.0f, false, 236000),
				new Mieszkanie("Poznań","Grunwald","Modra",
						5, 120.0f, false, 556000),
				new Mieszkanie("Gdańsk","Centrum","Centralna ",
						4, 88.0f, false, 456000)
		);

		// ANTYWZORZEC - NIE STOSOWAĆ TEGO W ŻĄDNYM PRZYPADKU.. LEPIEJ ZASTOSOWAĆ STRUMIEŃ!
//		for(Mieszkanie m: mList){
//			if(m.getMiasto().equals("Wrocław")){
//				if (m.getPokoje()>2){
//					if(m.getCena()<500000){
//						System.out.println(m.getMiasto()+ " "+m.getCena()+ " "+ m.getPokoje());
//					}
//				}
//			}
//		}
		mList.stream()
				.filter(mieszkanie -> mieszkanie.getMiasto().equals("Wrocław"))
				.filter(mieszkanie -> mieszkanie.getPokoje() > 1)
				.filter(mieszkanie -> mieszkanie.getCena() < 500000)
				.map(mieszkanie -> mieszkanie.getMiasto()+ " "+ mieszkanie.getDzielnica()+ " "+
						mieszkanie.getUlica()+ " "+ mieszkanie.getPokoje()+ " "+ mieszkanie.getCena()+".")
				.forEach(System.out:: println);


		Predicate<Mieszkanie> mNazwa = m-> m.isPiwnica() == false;

		List<Mieszkanie> lista;

		lista = mList.stream()
				.filter(mNazwa)
				.collect(Collectors.toList()); //zbiera nase wyniki do listy

		for (Mieszkanie m :lista) {
			System.out.println(m);
		}


	}
}
