package br.com.projetoitau;

import java.util.Stack;

public class Impressora {
    public void imprimirOperacoesRestantes(Stack<Operacoes> pilhaOperacoes) {
        //Copia da pilha original
        Stack<Operacoes> pilhaTemp = (Stack<Operacoes>) pilhaOperacoes.clone();

        // Inverte a cópia da pilha para imprimir as operações na ordem correta
        Stack<Operacoes> pilhaInvertida = new Stack<>();
        while (!pilhaTemp.isEmpty()) {
            pilhaInvertida.push(pilhaTemp.pop());
        }

        // Imprimir as operações restantes
        System.out.println("Operações restantes na fila:");
        for (Operacoes op : pilhaInvertida) {
            System.out.printf("%d %c %d%n", op.valorA, op.operador, op.valorB);
        }
        System.out.println();
    }

    public void imprimirResultado(Stack<Long> pilhaResultados) {

        // Inverte a pilha de resultados para imprimir
        Stack<Long> pilhaInvertidaResult = new Stack<>();
        while (!pilhaResultados.isEmpty()) {
            pilhaInvertidaResult.push(pilhaResultados.pop());
        }

        System.out.println("Resultados dos cálculos:");
        while (!pilhaInvertidaResult.isEmpty()) {
            System.out.println(pilhaInvertidaResult.pop());
        }
    }
}
