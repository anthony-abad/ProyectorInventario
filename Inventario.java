

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Inventario {
	
	
	public static void mostar(ArrayList<Libro> l) {
		System.out.println("LIBROS DISPONIBLES EN EL INVENTARIO");
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
	
	
	public static void buscarcodigo(ArrayList<Libro> l) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("INGRESE EL CODIGO DEL LIBRO QUE DESEA BUSCAR: ");
		int codigoingresado = entrada.nextInt();
		for (int i=0;i<l.size();i++) {
			if (codigoingresado == l.get(i).getCodigo()) {
				System.out.println(l.get(i));	
			}
			
		}
	}
	

	
	public static void comprarLibro (ArrayList<Libro> l) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("INSERTE EL CODIGO DEL LIBRO QUE DESEA COMPRAR");
		int codigoingresado = entrada.nextInt();
		int cantidad;
		for (int i=0;i<l.size();i++) {
			if (codigoingresado == l.get(i).getCodigo()) {
				cantidad = l.get(i).getCantidadexistente();
				if(cantidad > 1) {
					cantidad -= 1;
					System.out.println("GRACIAS POR SU COMPRA");
					l.get(i).setCantidadexistente(cantidad);
					actualizar(l);
				}else {
					cantidad = 0;
					System.out.println("GRACIAS POR SU COMPRA");
					System.out.println("EL LIBRO SE HA AGOTADO");
					l.get(i).setCantidadexistente(cantidad);
					actualizar(l);
				}
			}
		}
	}
		
	
	public static void actualizar(ArrayList<Libro> l) {
		System.out.println("ACTUALIZANDO INVENTARIO");
		for (int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}
		
	
	
	public static void main(String[] args) {
		
		ArrayList<Libro> libros = new ArrayList<Libro>();

		
		Libro lb1 = new Libro(1512, 2, " FRANKENSTEIN              ", " MARY W. SHELLEY   ", 25.50);
		Libro lb2 = new Libro(2706, 6, " YO ANTES DE TI            ", " MARY W. SHELLEY   ", 27.06);
		Libro lb3 = new Libro(1718, 3, " HARRY POTTER              ", " J.K. ROWLING      ", 21.30);
		Libro lb4 = new Libro(1619, 5, " EL SEÑOR DE LOS ANILLOS   ", " J.R.R. TOLIENS    ", 24.55);
		Libro lb5 = new Libro(1548, 4, " EL ALQUIMISTA             ", " PAULO COELHO      ", 20.25);
		Libro lb6 = new Libro(1054, 1, " EL CODIGO DA VINCI        ", " DAN BROWN         ", 35.27);
		Libro lb7 = new Libro(1906, 9, " CREPUSCULO                ", " STEPHENIE MEYER   ", 28.65);
		Libro lb8 = new Libro(1821, 8, " LO QUE EL VIENTO SE LLEVO ", " MARGARET MITCHELL ", 19.75);
		Libro lb9 = new Libro(1622, 15, "PIENSE Y HAGASE RICO      ", " NAPOLEON          ", 15.95);
		Libro lb10 = new Libro(2132, 10, "EL DIARIO DE ANA FRANK    ", " ANNA FRANK        ", 17.45);
		
		
		libros.add(lb1);
		libros.add(lb2);
		libros.add(lb3);
		libros.add(lb4);
		libros.add(lb5);
		libros.add(lb6);
		libros.add(lb7);
		libros.add(lb8);
		libros.add(lb9);
		libros.add(lb10);
		mostar(libros);
		buscarcodigo(libros);
		comprarLibro(libros);
		
	}
}

