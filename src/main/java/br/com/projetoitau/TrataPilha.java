package br.com.projetoitau;

import java.util.Stack;
public class TrataPilha {


    //Inverte a pilha de operações.
    public Stack<Operacoes> inverterPilha(Stack<Operacoes> pilhaOperacoes) {
        Stack<Operacoes> pilhaTrat = new Stack<>();
        while (!pilhaOperacoes.isEmpty()) {
            pilhaTrat.push(pilhaOperacoes.pop());
        }
        return pilhaTrat;
    }
}
