package com.company;

public class Main {

    public static void main(String[] args) {
	Point D = new Point(3,9);
    Point L = new Point(5);
    Point S = new Point();
        PointA A = new PointA(8,6);
        PointA B = new PointA(7);
        PointA C = new PointA();

        System.out.println(" -- les coordonnees des points D,L,S de la clesse de base (classe Point) -- ");
        System.out.println("Les coordonees du point D :("+D.getX()+","+D.getY()+")");
        System.out.println("Les coordonees du point L :("+L.getX()+","+L.getY()+")");
        System.out.println("Les coordonees du point S :("+S.getX()+","+S.getY()+")");

        System.out.println("-- les cordonnees des points A,B,C de la classe derivee (clesse PointA) --");
        A.afficheCord();
        B.afficheCord();
        C.afficheCord();




    }
}
