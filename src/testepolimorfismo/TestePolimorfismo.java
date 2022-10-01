package testepolimorfismo;

/**
 * @author taris / Created 30-09-2022
 */

public class TestePolimorfismo {
    public static void main(String[] args) {

        // OperacaoMatematica om = new OperacaoMatematica();
        Soma soma = new Soma();
        Subtracao sub = new Subtracao();

        // System.out.println("Operação Matemática: " + om.calcular(10, 2));

        System.out.println("Soma: " + soma.calcular(10, 2));

        System.out.println("Subtração: " + sub.calcular(10, 2));

    }

}
