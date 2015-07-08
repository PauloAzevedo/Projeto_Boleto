/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pagueme.boletoweb;

import java.util.Scanner;

/**
 *
 * @author ATENDIMENTOSACORTUS
 */
public class TestePi {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
        // List<Double> cadaIteracao = new LinkedList<>();
 
 
        double termos = 1000.0;
        boolean eNumero = false;
        while (!eNumero) {
            System.out.println("Informe o numero de termos: ");
            String valorDigitado = entrada.nextLine();
            if (verificarSeENumero(valorDigitado)) {
                termos = Double.parseDouble(valorDigitado);
                //System.out.println(termos);
                eNumero = true;
            }
        }
        System.out.println("Executando com: " + String.valueOf(termos) + " termos.");
 
        calcularOPI(termos);
 
 
 
 
 
        System.out.println("Deseja exibir o resultado de todas as iteraушes? (sim/nao)");
        String resposta = entrada.next();
 
        if (resposta.equalsIgnoreCase("sim")) {
            double inicio = System.currentTimeMillis();
            double pi;
            double soma = 1.0;
            boolean sinal = false;
            for (double i = 3.0; i < termos; i++) {
                if (i % 2 != 0) {
                    if (sinal) {
                        soma += 1.0 / i;
                        sinal = false;
                    } else {
                        soma -= 1.0 / i;
                        sinal = true;
                    }
                    System.out.println(4.0 * soma);
                }
            }
            //System.out.println(soma);
            pi = 4.0 * soma;
            double fim = System.currentTimeMillis();
            double tempo = (fim - inicio) / 1000;
            System.out.println("Termos: " + termos);
            System.out.println("Constante PI do JAVA: " + Math.PI);
            System.out.println("Usando fзrmula PI   : " + pi);
            System.out.println("Tempo: " + tempo + " segundos.");
            if (tempo > 60) {
                System.out.println("Tempo: " + tempo / 60 + " minutos.");
            }
 
        }
    }
 
    private static boolean verificarSeENumero(String valorDigitado) {
        try {
            double valor = Double.parseDouble(valorDigitado);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
 
    private static void calcularOPI(double termos) {
        double pi;
        double soma = 1.0;
        boolean sinal = false;
        double inicio = System.currentTimeMillis();
        for (double i = 3.0; i < termos; i++) {
            if (i % 2 != 0) {
                if (sinal) {
                    soma += 1.0 / i;
                    sinal = false;
                } else {
                    soma -= 1.0 / i;
                    sinal = true;
                }
                System.out.println(4.0 * soma);
            }
        }
        pi = 4.0 * soma;
        double fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000;
        System.out.println("Termos: " + termos);
        System.out.println("Constante PI do JAVA: " + Math.PI);
        System.out.println("Usando fзrmula PI   : " + pi);
        System.out.println("Tempo: " + tempo + " segundos.");
        if (tempo > 60) {
            System.out.println("Tempo: " + tempo / 60 + " minutos.");
        }
    }
}