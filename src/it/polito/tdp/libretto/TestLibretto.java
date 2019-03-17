package it.polito.tdp.libretto;

import java.time.LocalDate;
import java.util.*;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libr = new Libretto();
		libr.add(new Voto(30,"Analisi I",LocalDate.of(2017, 1, 31)));
		libr.add(new Voto(21,"Geometria",LocalDate.of(2017, 1, 31)));
		libr.add(new Voto(25,"Fisica II",LocalDate.of(2018, 1, 31)));
		libr.add(new Voto(28,"Fisica I",LocalDate.of(2017, 1, 31)));
		libr.add(new Voto(20,"Statistica",LocalDate.of(2017, 1, 31)));
		libr.add(new Voto(24,"Economia",LocalDate.of(2017, 1, 31)));
		libr.add(new Voto(21,"Diritto",LocalDate.of(2017, 1, 31)));
		libr.add(new Voto(27,"Programmazione a Oggetti",LocalDate.of(2017, 1, 31)));
		
		List<Voto> venticinque= libr.cercaVoti(25);
		System.out.println(venticinque);
		
		Voto a1= libr.cercaVotiEsame("Analisi I");

		Voto a3= libr.cercaVotiEsame("Analisi III");
		
		System.out.println(a1);

		System.out.println(a3);
		
		Voto giusto = new Voto(21,"Geometria",LocalDate.now());
		Voto sbagliato =new Voto(29,"Geometria",LocalDate.now());
		System.out.format("Il voto %s � %s\n", giusto.toString(),libr.esisteGiaVoto(giusto));
		System.out.format("Il voto %s � %s\n", sbagliato.toString(),libr.esisteGiaVoto(sbagliato));
		
		
		System.out.format("Il voto %s � in congflitto %s\n", giusto.toString(),libr.votoConflitto(giusto));
		System.out.format("Il voto %s � in conflitto %s\n", sbagliato.toString(),libr.votoConflitto(sbagliato));
		
		
		System.out.println(libr.add(giusto));

		System.out.println(libr.add(sbagliato));
		
		System.out.print(libr.toString());
		
	}

}
