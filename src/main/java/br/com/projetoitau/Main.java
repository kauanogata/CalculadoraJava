package br.com.projetoitau;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Operacoes> filaOperacoes = new LinkedList<>();
        filaOperacoes.add(new Operacoes(2, 3, '+'));
        filaOperacoes.add(new Operacoes(14, 8, '-'));
        filaOperacoes.add(new Operacoes(5, 6, '*'));
        filaOperacoes.add(new Operacoes(2147483647, 2, '+'));
        filaOperacoes.add(new Operacoes(18, 3, '/'));

        Calculadora calculadora = new Calculadora();
        Impressora impressora = new Impressora();
        Stack<Long> pilhaResultados = new Stack<>();
        Stack<Operacoes> pilhaOperacoes = new Stack<>();
        TrataPilha trataPilha = new TrataPilha();

        //Imprime a fila das operações
        System.out.println("Operações a serem realizadas:");
        for (Operacoes op : filaOperacoes) {
            System.out.printf("%d %c %d%n", op.valorA, op.operador, op.valorB);
            pilhaOperacoes.push(op);
        }
        System.out.println();

        // Inverter a pilha antes de processar
        pilhaOperacoes = trataPilha.inverterPilha(pilhaOperacoes);


        while (!pilhaOperacoes.isEmpty()) {
            Operacoes operacao = pilhaOperacoes.pop();
            System.out.println("Realizando operação...");
            calculadora.calcular(operacao);
            pilhaResultados.push(operacao.resultado);
            if(!pilhaOperacoes.isEmpty()){
                impressora.imprimirOperacoesRestantes(pilhaOperacoes);
            }else{
                System.out.println("Não há operações restantes.\n");
            }


        }


        impressora.imprimirResultado(pilhaResultados);

    }
}
