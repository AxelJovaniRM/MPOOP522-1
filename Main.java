public class Main {
  public static void main(String[] args) {
    Circulo cir=new Circulo();
    System.out.println(cir);
    cir.setRadio(5.6f); //primer solucion
    System.out.println(cir);
    cir.setRadio((float)7.33); //segunda solucion
    System.out.println(cir);
    float var= -8.66f;
    cir.setRadio(var);
    System.out.println(cir);
    System.out.println("################");
    Persona persona1= new Persona();
    System.out.println(persona1);
    persona1.setNombre("Susana");
    persona1.setApellido("Vazquez");
    Fecha fecha= new Fecha(2,1,2021);
    persona1.setfNacimiento(fecha);
    System.out.println(persona1);
    System.out.println(persona1.getFNacimiento().getAnio());

    System.out.println("##########Composicion2##############");
    Persona persona2=new Persona("Rafael","Zavala",8,4,1998);
    System.out.println(persona2);
    
    System.out.println("############Composicion3##############");
    Persona chofer= new Persona("Axel","Ruiz",18,01,2002);
    Persona copiloto= new Persona("Gustavo","Hurtado",11,8,2003);
    Persona persona3= new Persona("Dana","Linares",13,2,2002);
    Persona persona4= new Persona("Dani", "Vasquez", 3,4,2002);
    Coche coche1=new Coche("Ferrari",2021,"rojo",4,true,100);
    System.out.println(coche1);
    coche1.chofer(chofer);
    coche1.copiloto(copiloto);
    coche1.per1(persona3);
    coche1.per2(persona4);
  }
}