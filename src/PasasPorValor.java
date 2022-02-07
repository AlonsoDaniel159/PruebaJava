public class PasasPorValor {
    public static void main(String[] args) {

        Integer i = 10;
        System.out.println("Iniciamos el método main con i = "+ i);
        Test(i);
        System.out.println("Finaliza el método main con el valor de i = "+ i);
    }

    public static void Test (int  i){
        System.out.println("Iniciamos el método test con i = "+ i);
        i = 35;
        System.out.println("Finaliza el método test con i = "+ i);
    }
}
