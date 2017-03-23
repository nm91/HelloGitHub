package test;

public class Hallo {


		  // Das ist das Hauptprogramm, das gestartet wird:
		  public static void main(String[] args) {
		    new Hallo(); // Es ruft unser Programm auf.
		  }

		  Hallo() {
		    h(4);
		  }

		  void h(int n) {
		    if (n > 0) {
		      System.out.println("Hallo");
		      h(n-1);
		    }
		    return;
		  }
		}

