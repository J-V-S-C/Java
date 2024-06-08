package login;
import java.util.Scanner;



public class Appbanco {
    public static void main(String[] args) {
        
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        Informacoes newinformation = new Informacoes();


        System.out.println("\n==========Bem vindo ao nosso sistema bancário, por favor realize o login ou se inscreva antes de começar!==========\n");
        
        System.out.println("Seu ID é:");
        System.out.println("\nEscreva seu nome:");
        newinformation.nome = scan.next().toString();
        
        System.out.println("\nEscreva sua idade:");
        newinformation.idade = scan.nextInt();
    
        if(newinformation.idade>=18 && newinformation.idade <=130 ){

             System.out.println("\nOlá " + newinformation.nome + ",obrigado por escolher nosso banco");

             System.out.println("\nSe sinta livre para realizar saques ou depositos senhor " + newinformation.nome);
             int escolha; 
             int i=0;
             do{
                  
                   System.out.println("\n=======Digite 1 para saques, 2 para depositos, 3 para o histórico de transações e qualquer outra tecla para sair=======");
                   escolha = scan.nextInt();
        
     
                      switch (escolha) 
                      {
            
                          case 1:
                               
                              System.out.println("\nDigite o valor que deseja retirar:");
                              int valordosaque = scan.nextInt();

                            if( valordosaque > 0){            
                                newinformation.balance -= valordosaque;
                                System.out.println("\nSaque realizado! O seu saldo atual é de:" + newinformation.balance);
                                newinformation.previousTransictions[i] = newinformation.balance;
                                newinformation.previousDepósitos[i] = valordosaque;
                            }

                            else{
                                System.out.println("\nValor inválido!");
                            }                

                                break;
                        
                            case 2:

                                
                                System.out.println("\nDigite o valor que deseja depositar:");
                                int valordeposito = scan.nextInt();

                                if(valordeposito>0)
                                    {
                                    newinformation.balance += valordeposito;
                                    System.out.println("\nSeu saldo atual é de:" + newinformation.balance);
                                    newinformation.previousTransictions[i] = newinformation.balance;
                                    newinformation.previousDepósitos[i] = valordeposito;
                                }

                                else{
                                    System.out.println("\nValor inválido!");
                                }    
                                break;

                            case 3:
                                System.out.println("\n==================================================Extrato Bancário:=================================================");                          for (i=0; i<3; i++){

                                                             
                                if(newinformation.previousTransictions[i] != 0 ){
                                    if(newinformation.previousSaques[i] != 0)
                                     {
                                       System.out.println("\nValor do Saque:" + newinformation.previousSaques[i]);
                                       }
                                       else{System.out.println("\nValor do saque:Nenhum Valor");}

                                    if(newinformation.previousDepósitos[i] != 0)
                                     {
                                        System.out.println("\nValor do depósito:" + newinformation.previousDepósitos[i]);
                                       }
                                       else{System.out.println("\nValor do depósito:Nenhum Valor");}

                                    System.out.println("\nSaldo:" + newinformation.previousTransictions[i]);
                                }
                                else
                                System.out.println("\n--- Nenhum Valor ---");
                            }
                            break;
                                
                            default:
                                System.out.println("\nAguardamos seu retorno, tenha um bom dia :)");
                        }
                   i++;
                   if(i==3){
                    i=0;
                   }
                }

        while( escolha == 1 ||  escolha == 2 || escolha == 3 );
        
        
            
        
        }
        else{
            System.out.println("\nDesculpe senhor " + newinformation.nome + ",mas você não tem a idade mínima para poder usar nossos serviços ou a idade não é válida.");
        }
    }
    
}
