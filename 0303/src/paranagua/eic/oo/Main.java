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

        //estado do objeto
        System.out.println("Número:"+conta1.numero);
        System.out.println("Agência:"+conta1.agencia);
        System.out.println("Cliente:"+conta1.cliente);
        System.out.println("Saldo:"+conta1.saldo);




    }
}
