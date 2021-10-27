class Coche{
  //sección de atributos
  private String color;
  private String marca;
  private int numPuertas;
  private int anioc;
  private int potencia;
  private boolean automatico;
  
  //sección de constructor
  public Coche(){
  }
  
 public Coche(String marca, int anioc, String color, int numPuertas, boolean automatico, int potencia){
    this.marca = marca;
    this.anioc = anioc;
    this.color = color;
    this.numPuertas = numPuertas;
    this.automatico = automatico;
    this.potencia = potencia;
  }
  

 //getter y setters

    public String getColor(){
    return color;
  }
  public void setColor(String color){
    this.color=color;
  }
  public String getMarca(){
    return marca;
  }
  public void setMarca(String marca){
    this.marca=marca;
  }
  public int getNumPuertas(){
    return numPuertas;
  }
  public void setNumPuertas(int numPuertas){
    this.numPuertas=numPuertas;
  }
  public int getAnioc(){
    return anioc;
  }
  public void setAnioc(int anioc){
    this.anioc=anioc;
  }
  public int getPotencia(){
    return potencia;
  }
  public void setPotencia(int potencia){
    this.potencia=potencia;
  }  
  public boolean getAutomatico(){
    return automatico;
  }
  public void setAutomatico(boolean automatico){
    this.automatico=automatico;
  }

  //sección de metodos
  public void encender(){
    System.out.println("Soy el coche de la marca "+marca+" de color "+color+" y estoy encendiendo");
  }
  public void avanzar(boolean avanza){
    //avanza == true
    //true== true->true 
    if(avanza){
    System.out.println("Estoy avanzando a 10km/h");
    }else{
      System.out.println("Voy a 0km/h");
    }
  }

  public void apagar(){
    System.out.println("Soy el coche de la marca "+marca+" y estoy apagandome");
  }

  public void frenar(boolean frena){
    if(frena){
      System.out.println("Estoy frenando");
    }else{
      System.out.println("No estoy frenando");
    }
  }
  public void abrirPuertas(int numPuertasAAbrir){
    if(numPuertasAAbrir>numPuertas){
      System.out.println("El numero de puertas a abrir es mayor al numero de puertas");
    }else{
      System.out.println("Abriendo "+numPuertasAAbrir+" puertas");
    }   
  }  
    public void chofer(Persona cho){
    System.out.println("Soy la "+cho+" y soy el chofer del coche");
  }
    public void copiloto(Persona co){
    System.out.println("Soy la "+co+" y soy el copiloto del coche");
  }
      public void per1(Persona per1){
    System.out.println("Soy la "+per1+" y estoy en el primer asiento trasero del coche");
  }
    public void per2(Persona per2){
    System.out.println("Soy la "+per2+" y estoy en el segundo asiento trasero del coche");
  }

  @Override
  public String toString(){
    return "Coche{"+"marca="+marca+" año="+anioc+" color="+color+ " numPuertas="+numPuertas+" automatico="+automatico+" potencia="+potencia+"}";
  }
}