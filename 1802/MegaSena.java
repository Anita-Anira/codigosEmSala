//importação das classes para entrada dos dados
//do teclado e geração de números aleatórios
import java.util.Scanner;
import java.util.Random;

public class MegaSena{


    public static void main(String[] args){

        //declaração e alocação dos vetores
        int[] apostas = new int[6];
        int[] sorteio = new int[6];

        //variáveis
        int acertos =0;
        int num;
        boolean flag;

        //criação do objeto de leitura de dados do teclado
        Scanner scan = new Scanner(System.in);

        //criação do objeto para gerar números aleatórios
        Random rand = new Random();

        //rotina para leitura das apostas do usuário
        for(int i=0;i<6;i++){
            System.out.println("Digite um numero entre 1 e 60:");
            //leitura de um número inteiro
            num = scan.nextInt();

            //verificação de o número está no intervalo correto
            if(num>=1 && num<=60){
                //verificação se o número não está repetido
                flag=false;
                for(int j=0;j<6;j++){
                    if(apostas[j] == num){
                        System.out.println("Número repetido...Digite outro!!");
                        i=i-1;
                        flag=true;
                    }
                }

                //caso o número não for repetido, armazenamos no vetor
                if(!flag){
                    apostas[i]=num;
                }
                

            }else{
                System.out.println("Número inválido...Digite outro!!");
                i=i-1;
            }
        }

        //rotina para gerar os números sorteados
        for(int i=0;i<6;i++){

            num = rand.nextInt(60)+1;

            //verificamos se os números sorteados não são repetidos
            flag=false;
            for(int j=0;j<6;j++){
                if(sorteio[j] == num){
                    i=i-1;
                    flag=true;
                }
            }
            if(!flag){
                sorteio[i]=num;
            }
        }


        //rotina para verificar os acertos
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                if(apostas[i]==sorteio[j]){
                    acertos++;
                    //se encontrou, não precisa mais procurar
                    break;
                }
            }
        }
        
        //verificamos os acertos e geramos uma resposta
        switch(acertos){
            case 4:
                System.out.println("Acertou a quadra...!!!");
            break;
            case 5:
                System.out.println("Acertou a quina...!!!");
            break;
            case 6:
                System.out.println("Ficou milhonário...!!!");
            break;
            default:
                System.out.println("Vai ter que continuar estudando...");
            break;
        }

    }





}
