package contas;
public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraconta = new Conta();
        primeiraconta.saldo = 3;
        primeiraconta.saldo += 200;
        System.out.println("O saldo da primeira conta eh " + primeiraconta.saldo + " reais!");

        Conta segundaconta = new Conta();
        segundaconta.saldo = 50;
        System.out.println("\n Segunda conta eh:" + segundaconta.saldo);

    }
}
