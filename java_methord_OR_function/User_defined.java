public class User_defined {
    public static void Name(){
        System.out.println("Aditi");
    }
    public static void main(String[] args) {  //Main fucntion would always run first.
    Nitu();
    System.out.println("Vinita");
    Name();
    System.out.println("Tarun");    
    }

    public static void tarun(){
        System.out.println("Shiva");
        Vinita();
    }

    public static void Vinita(){
        System.out.println("Vipin");
    }
    
    public static void Nitu(){
        tarun();
        System.out.println("Pankaj");
    }
}  
// OUTPUT:-
//     Shiva
//     Vipin
//     Pankaj
//     Vinita
//     Aditi
//     Tarun
