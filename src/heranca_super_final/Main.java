package heranca_super_final;

import entities.Circle;

public class Main {

		public static void main(String args[]) {
			Circle cicle1,cicle2;
			cicle1 = new Circle(4.5,72,29);
			cicle2 = new Circle(10,5,5);
			
			cicle1 = null;
			cicle2 = null;
			
			System.gc();//aqui ele termina o programa 
					
		}
}
