package paranagua.eic.oo;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //declaracao do objeto
        ContaBancaria conta1=null;
        
        //instanciar o objeto
        conta1 = new ContaBancaria();

        //inicializar
        conta1.agencia = 345;
        conta1.numero = 1123913;
        conta1.saldo = 10.0;
        conta1.cliente = "Chico";

        System.out.println("#######Estado do Objeto####");
        System.out.println(conta1.toString());

        //estado do objeto


        conta1.sacar(10.5);
        System.out.println("#######Estado do Objeto####");
        System.out.println(conta1.toString());

        conta1.depositar(100);
        System.out.println("#######Estado do Objeto####");
        System.out.println(conta1.toString());
    }
}
