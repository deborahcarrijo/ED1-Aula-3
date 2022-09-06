/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula3;
import javax.swing.JOptionPane;
/**
 *
 * @author deborah
 */
public class Aula3 {

    public static void main(String[] args) {
        //Algoritmo 11
        System.out.println("Aprendendo Algoritmo!!!\n");
        
        //Algoritmo 12
        System.out.println("Aprendendo Algoritmo!!!");
        System.out.println("Com Anita e Guto\n");
        
        //Algoritmo 16
        int x;
        x = 10;
        System.out.println(x + "\n");
        
        //Algoritmo 18
        int y;
        y = 10;
        System.out.println("Valor de y = " + (y + 1) + "\n");
        
        //Algoritmo 23
        String valor;
        int a,d;
        
        valor = JOptionPane.showInputDialog("Digite um número de tres casas: ");
           
        a = Integer.parseInt(valor);
        d = a / 10 % 10;
            
        System.out.println("\nalgarismo da casa das dezenas: " + d);
        System.out.println("\n");
        
        //Algoritmo 25
        String numero;
        int data,dia,mes,ano;
        
        numero = JOptionPane.showInputDialog("\nDigite data no formato ddmmaa: ");
        
        data = Integer.parseInt(numero);
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        System.out.println( "\nDIA: " + dia);
        System.out.println("\nMES: " + mes);
        System.out.println("\nANO: " + ano);
        System.out.println("\n");
        
        //Algoritmo 26
        int ndata;
        
        numero = JOptionPane.showInputDialog("\nDigite data no formato ddmmaa: ");
        
        data = Integer.parseInt(numero);
        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;
        ndata = mes * 10000 + dia * 100 + ano;
        System.out.println( "\nDIA: " + dia);
        System.out.println("\nMES: " + mes);
        System.out.println("\nANO: " + ano);
        System.out.println("\nDATA NO FORMATO MMDDAA: " + ndata);
        System.out.println("\n");
        
        //Algoritmo 27
        int i,j;
        i = 2;
        j = 5;
        
        System.out.println("\ni = " + i);
        i++;
        
        System.out.println("\nj = " + j);
        j--;
        
        System.out.println("\nnovo valor de i = " + i);
        System.out.println("\nnovo valor de j = " + j);
        System.out.println("\n");
        
        //Algoritmo 31
        double ma;
        ma = (8 + 9 + 7) / 3;
        
        System.out.println("\nA media aritmetica e: " + ma);
        System.out.println("\n");
        
        //Algoritmo 40
        String dividendo;
        String divisor;
        int quoc, resto, val1, val2;
        
        dividendo = JOptionPane.showInputDialog("\nEntre com o dividendo: ");
        val1 = Integer.parseInt(dividendo);
        
        divisor = JOptionPane.showInputDialog("\nEntre com o divisor: ");
        val2 = Integer.parseInt(divisor);
        
        quoc = val1 / val2;
        resto = val1 % val2;
        
        System.out.println("\nDividendo: " + val1);
        System.out.println("\nDivisor: " + val2);
        System.out.println("\nQuociente: " + quoc);
        System.out.println("\nResto: " + resto);
        System.out.println("\n");
        
        //Algoritmo 41
        String numero1, numero2, numero3, numero4;
        double p, q, r, s, mp;
        
        numero1 = JOptionPane.showInputDialog("\nEntre com 1 numero: ");
        p = Double.parseDouble(numero1);
        
        numero2 = JOptionPane.showInputDialog("\nEntre com 2 numero: ");
        q = Double.parseDouble(numero2);
        
        numero3 = JOptionPane.showInputDialog("\nEntre com 3 numero: ");
        r = Double.parseDouble(numero3);
        
        numero4 = JOptionPane.showInputDialog("\nEntre com 4 numero: ");
        s = Double.parseDouble(numero4);
        
        mp = (p*1 + q*2 + r*3 + s*4) / 10;
        System.out.println("\nMedia ponderada: " + mp);
        System.out.println("\n");
        
        //Algoritmo 42
        String angulo;
        double ang, rang;
        
        angulo = JOptionPane.showInputDialog("\nDigite um angulo em graus: ");
        ang = Double.parseDouble(angulo);
        rang = ang*Math.PI / 180;
        
        System.out.println("\nSeno: " + Math.sin(rang));
        System.out.println("\nCosseno: " + Math.cos(rang));
        System.out.println("\nTangente: " + Math.tan(rang));
        System.out.println("\nCossecante: " + 1 / Math.cos(rang));
        System.out.println("\nSecante: " + 1 / Math.sin(rang));
        System.out.println("\nCotangente: " + 1 / Math.tan(rang));
        System.out.println("\n");
        
        //Algoritmo 43
        String numero5;
        double num, logaritmo;
        
        numero5 = JOptionPane.showInputDialog("\nEntre com o logaritmando: ");
        num = Double.parseDouble(numero5);
        logaritmo = Math.log(num) / Math.log(10);
        
        System.out.println("\nLogaritmo: " + logaritmo);
        System.out.println("\n");
        
        //Algoritmo 44
        String numero6, base;
        double num6, base1, logaritmo1;
        
        numero6 = JOptionPane.showInputDialog("\nEntre com o logaritmando: ");
        num6 = Double.parseDouble(numero6);
        
        base = JOptionPane.showInputDialog("\nEntre com a base: ");
        base1 = Double.parseDouble(base);
        logaritmo1 = Math.log(num6) / Math.log(base1);
        
        System.out.println("\nO logaritmo de " + num6 + " na base " + base1 + " e: " + logaritmo1);
        System.out.println("\n");
        
        //Algoritmo 46
        String saldo1;
        double saldo, nsaldo;
        
        saldo1 = JOptionPane.showInputDialog("\nDigite saldo: ");
        saldo = Double.parseDouble(saldo1);
        nsaldo = saldo * 1.01;
        
        System.out.println("\nNovo saldo: " + nsaldo);
        System.out.println("\n");
        
        //Algoritmo 48
        String salario, qtd;
        double sm, qtdade, preco, vp, vd;
        
        salario = JOptionPane.showInputDialog("\nEntre com o salário mínimo: ");
        sm = Double.parseDouble(salario);
        
        qtd = JOptionPane.showInputDialog("\nEntre com a quantidade em quilowatt: ");
        qtdade = Double.parseDouble(qtd);
        
        preco = sm / 700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        
        System.out.println("\nPreço do quilowatt: " + preco + "\nValor a ser pago: " + vp + "\nValor com desconto: " + vd);
        System.out.println("\n");
    }
}
