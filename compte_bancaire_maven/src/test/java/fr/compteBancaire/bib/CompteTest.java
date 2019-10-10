package fr.compteBancaire.bib;
import org.junit.*;
import static org.junit.Assert.*;

public class CompteTest {
	
	@Test
	public void testDeCredit() {
		Compte c = new Compte("xx",240,90);
		System.out.println("--------testcredit------------------");
		c.crediter(10);
		
		assertEquals(250, c.getConsultation()); //verification
		
		System.out.println("La valeur testDeCredit = " + c.getConsultation());
		System.out.println("--------testcredit------------------\n");
	}
	
	
	
	@Test
	public void testDeRetrait() {
		Compte b = new Compte("yy",1500,500);
		System.out.println("--------testretrait-----------------");
		b.retrait(45);
		
		assertEquals(1455, b.getConsultation());
		
		System.out.println("La valeur testDeRetrait = " + b.getConsultation());
		System.out.println("--------testretrait-----------------\n");
	}
	
	@Test
	public void testGetConsultation(){
		Compte d = new Compte("hh",456,45);
		System.out.println("--------testconsultation------------");
	    System.out.println("La valeur testGetConsultation = " + d.getConsultation() );
	    System.out.println("--------testconsultation------------\n");
	}
	@Test
	public void testVirement() {
		Compte x = new Compte("JESUISX",400,45);
		Compte y = new Compte("JESUISY",100,45);
		System.out.println("--------testvirement----------------");
		x.virement(99, y);
		System.out.println("Compte "+ x.getNomTitulaire() + " après virement : "+x.getConsultation());
		System.out.println("Compte "+ y.getNomTitulaire() +" après versement : "+y.getConsultation());
		System.out.println("--------testvirement----------------\n");
	}
}

