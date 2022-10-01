package testepolimorfismo;

public abstract class OperacaoMatematica {

    protected double valor;

    public abstract double calcular(double n1, double n2);

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
