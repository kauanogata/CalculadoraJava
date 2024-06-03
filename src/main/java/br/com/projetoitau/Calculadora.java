package br.com.projetoitau;

public class Calculadora {

    public Operacoes calcular(Operacoes operacao) {
        switch (operacao.operador) {
            case '+' -> operacao.resultado = soma(operacao);
            case '-' -> operacao.resultado = subtracao(operacao);
            case '*' -> operacao.resultado = multiplicacao(operacao);
            case '/' -> operacao.resultado = divisao(operacao);
            default -> operacao.resultado = 0;
        }
        return operacao;
    }

    public long soma(Operacoes operacao) {
        return operacao.valorA + operacao.valorB;
    }

    public long subtracao(Operacoes operacao) {
        return operacao.valorA - operacao.valorB;
    }

    public long multiplicacao(Operacoes operacao) {
        return operacao.valorA * operacao.valorB;
    }

    public long divisao(Operacoes operacao) {
        if (operacao.valorB != 0) {
            return operacao.valorA / operacao.valorB;
        } else {
            throw new ArithmeticException("Divisão por zero");
        }
    }

}
