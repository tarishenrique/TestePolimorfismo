package testepolimorfismo;

public class Subtracao extends OperacaoMatematica {

    @Override
    public double calcular(double n1, double n2) {
        return n1 - n2;
    }

}
