import java.util.Scanner;

// PARAMETRO PARA RECONHECER O THROW.
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
    super(mensagem);
    }
}

public class contador {
    
    public static void main(String[] args) {
    // SCRIPT QUE RECONHECE A ESTRADA DE NUMEROS.
        try (Scanner terminal = new Scanner(System.in)){
            System.out.println("Dgigite o primeiro parâmetro:");
             int parametroUm = terminal.nextInt();
             System.out.println("Digite o segundo parâmetro: ");
             int parametroDois = terminal.nextInt();

    // SCRIPT QUE ANALISA SE OS NUMERO SÃO VALIDOS.
    // TRY CHAMA O FOR CASO SEJA NUMEROS VÁLIDOS.
    // CATCH CAMA O THROW CASO OS NUMEROS NÃO SEJAM VÁLIDOS.
             try {
                contar(parametroUm, parametroDois);
             } 
             catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
             }
        }
    }
    // PARAMETRO DE MENSAGEM DE ERRO CASO O PRIMEIRO NUMERO SEJA MENOR QUE O SEGUNDO.
    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

    // LAÇO DE REPETIÇÃO QUE SÓ PARA NO NUMERO FINAL DA SUBTRAÇÃO.
        int contagem = parametroDois - parametroUm;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
