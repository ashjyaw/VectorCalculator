package vectorCalculator;

import java.util.Scanner;

public class vectorMenu{
	
		static int Aihat = 0, Ajhat = 0, Bihat = 0, Bjhat = 0;
		
		static void banner() {
			for(int i = 0; i < 19; i++) {
				System.out.print("~");
			}
			
			System.out.println("\n VECTOR CALCULATOR");
			for(int i = 0; i<19; i++) {
				System.out.print("~");
			}
		}
		static void ValueInput() {
			Scanner in = new Scanner(System.in);
			System.out.println("\nVector A ihat value:");
			Aihat = in.nextInt();
			System.out.println("Vector A jhat value:");
			Ajhat = in.nextInt();
			System.out.println("Vector B ihat value:");
			Bihat = in.nextInt();
			System.out.println("Vector B jhat value:");
			Bjhat = in.nextInt();
			in.close();
		}
		static void Vcalcs() {
			vectorMath VM = new vectorMath();
			
			double Amag = VM.magnitude(Aihat, Ajhat);
			double Bmag = VM.magnitude(Bihat, Bjhat);
			double AB = VM.AtimesB(Aihat, Ajhat, Bihat, Bjhat);
			double ABmag = VM.AmagXBMag(Amag, Bmag);
			double theta = VM.AngleBetween(AB, ABmag);
			System.out.println("Vector A magnitude: " + Amag);
			System.out.println("Vector B magnitude: " + Bmag);
			System.out.println("Scalar/Dot product of both vectors: " + AB);
			System.out.println("Magnitude of ->A and ->B combined: " + ABmag);
			System.out.println("Angle between the two Vectors: " + theta);
			
		}
}
