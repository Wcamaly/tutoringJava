package ejercicioTemp;

public class Main {
  public static void main(String[] args){
    Register register = new Register();

    register.addRegister("Argentina",(short) -1, (short) 10);
    register.addRegister("China",(short) 10, (short) 25);
    register.addRegister("Tokio",(short) -10, (short) 30);
    register.addRegister("Chile",(short) -9, (short) 42);
    register.addRegister("Italia",(short) 12, (short) 30);
    register.addRegister("Brazil",(short) 21, (short) 50);
    register.addRegister("EEUU",(short) -7, (short) 32);
    register.addRegister("Costarica",(short) 20, (short) 20);
    

    Temperature minTemp = register.getMinRegiter();
    System.out.println("El pais con la minima temperatura es :" +  minTemp.getCountry() + " - " + minTemp.getMinTemp()+"°");

    Temperature maxTemp = register.getMaxRegiter();
    System.out.println("El pais con la maxima temperatura es :" +  maxTemp.getCountry() + " - " + maxTemp.getMaxTemp()+"°");


  }
}