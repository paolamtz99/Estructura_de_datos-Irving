class Algorithm {

  public static void main(String[] args) {
    Algorithm.menu();
    //System.out.printl(menu());
  }

  public static void menu(){
    int option = 0;
    Scanner s = new Scanner(System.in);

    do{
      System.out.prinln("\n1.Even/Odd.\n2. Euclides Algorithm.\n" +
      "3. Order recursively.\n4. Exit.\n\tOption: ");
      option = s.nextInt();

      switch(option){
        case 1:
        //Aqui va tu codigo Pao
                        Scanner insertar = new Scanner(System.in);
              int numero;
              
               System.out.println("Inserte Número: ");
               numero= insertar.nextInt();
              
               if(numero % 2 ==0){ // Define si es numero par o impar sacando el residuo
               System.out.println(numero + "Es un número Par");
               }else{
               System.out.println(numero+ "NO es número Par");
               } 
               
               System.out.println("\n");
          break;
        case 2:
        //Su codigo senor Richard
          break;
        case 3:
          //El mio
          break;
        default:
          System.out.prinln("\nInvalid key, please try again\n");
          break;
      }
    }while(option!=4);
  }

}
