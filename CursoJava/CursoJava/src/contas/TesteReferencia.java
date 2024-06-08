package contas;

public class TesteReferencia {
   public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 300;

    System.out.println("O saldo da primeira conta é:" + primeiraConta.saldo);

    //Conta segundaConta = primeiraConta;
    Conta segundaConta = new Conta();
    System.out.println("O saldo da segunda conta é:" + segundaConta.saldo);
    segundaConta.saldo +=200;
    System.out.println("O saldo da segunda conta é:" + segundaConta.saldo);
    
    System.out.println("O saldo da primeira conta é:" + primeiraConta.saldo);


}
}
