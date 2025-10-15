public class Principal {
        public static void main(String [] args){
                ContaCorrente conta_cor = new ContaCorrente(100, 0.01f);
                AppBanco.depositaValor(200, conta_cor);
                AppBanco.imprimeSaldo(conta_cor);

                AppBanco.sacaValor(97, conta_cor);
                AppBanco.imprimeSaldo(conta_cor);

                AppBanco.sacaValor(200, conta_cor);
                AppBanco.imprimeSaldo(conta_cor);

                System.out.println();                

                ContaPoupanca poup = new ContaPoupanca(100);
                AppBanco.depositaValor(200, poup);
                AppBanco.imprimeSaldo(poup);

                AppBanco.sacaValor(100, poup);
                AppBanco.imprimeSaldo(poup);

                AppBanco.sacaValor(300, poup);
                AppBanco.imprimeSaldo(poup);
        }
}
