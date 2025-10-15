public class AppBanco {
    public static void depositaValor(float valor, Conta conta){
        if (conta.depositar(valor)){
            System.out.println("Depósito bem sucedido");
        } else {
            System.out.println("Depósito falhou, favor adicionar uma quantidade positiva!");
        }
    }

    public static void sacaValor(float valor, Conta conta){
        if (conta.sacar(valor)){
            System.out.println("Valor foi sacado");
        } else {
            System.out.println("Saldo insuficiente para saque, tente novamente com outro valor!");
        }
    }

    public static void imprimeSaldo(Conta conta){
        System.out.println("Seu saldo é: " + conta.getSaldo());
    }
}
