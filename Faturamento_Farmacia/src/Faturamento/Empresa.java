package Faturamento;

import java.util.Locale;
import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double vendasJaqueline = 28369.89;
		double vendasTiago = 25546.12;
		double vendasRenato	= 22865.98;
		double vendasFlavio = 27384.11;
		double vendasLucio = 18963.12;
		double vendasMaria = 21378.29;
		double vendasPedro = 20115.95;
		double vendasJanaina = 23324.14;
		
		double salarioGerente = 4076.26;
		double salarioVendedores = 1738.84;
		double salarioCaixa = 19715.13;
		double salarioMotoboy = 1856.48;
		double salarioAdministrativo = 2174.19;
		double salarioFuncionarioLimpeza = 1646.76;
		double comissãoVendedores = 1.5;
		double valorTotalVendas;
		int ticket = 100;
		double salarioJaqueline, comissãoJaqueline; 
		double salarioTiago, comissãoTiago;
		double salarioRenato, comissãoRenato;
		double salarioFlavio, comissãoFlavio;
		double salarioLucio, comissãoLucio;
		double salarioMaria, comissãoMaria;
		double salarioPedro, comissãoPedro;
		double salarioJanaina, comissãoJanaina;
		double gastoTotalSalarios, gastoTotalComissões;
		double fgts, gastoPlanoSaude,gastoPlanoOdontologico ;
		double aluguel = 10.000;
		double impostoEstadual;
		double impostoFederal;
		double lucro, lucroLiquido;
	
		
		valorTotalVendas = vendasJaqueline + vendasTiago + vendasRenato + vendasFlavio + vendasLucio + vendasMaria +vendasPedro + vendasJanaina;
		System.out.printf("Valor total de vendas da empresa R$:%.2f%n", valorTotalVendas);
		
		System.out.println();
		
		comissãoJaqueline = vendasJaqueline * 1.5 / 100;
		System.out.printf("Comissão da Jaqueline R$ = %.2f%n" ,comissãoJaqueline);
		salarioJaqueline = comissãoJaqueline + salarioVendedores + ticket;
		System.out.printf("Salario da líquido da Jaqueline R$ = %.2f%n" ,salarioJaqueline);
		
		System.out.println();
		
		comissãoTiago = vendasTiago * 1.5 / 100;
		System.out.printf("Comissão do Tiago R$ = %.2f%n" ,comissãoTiago);
		salarioTiago = comissãoTiago + salarioVendedores + ticket;
		System.out.printf("Salario da líquido do Tiago R$ = %.2f%n" ,salarioTiago);
		
		System.out.println();
		
		comissãoRenato = vendasRenato * 1.5 / 100;
		System.out.printf("Comissão do Renato R$ = %.2f%n" ,comissãoRenato);
		salarioRenato = comissãoRenato + salarioVendedores + ticket;
		System.out.printf("Salario da líquido do Renato R$ = %.2f%n" ,salarioRenato);
		
		System.out.println();
		
		comissãoFlavio = vendasFlavio * 1.5 / 100;
		System.out.printf("Comissão do Flavio R$ = %.2f%n" ,comissãoFlavio);
		salarioFlavio = comissãoFlavio + salarioVendedores + ticket;
		System.out.printf("Salario da líquido do Flavio R$ = %.2f%n" ,salarioFlavio);
		
		System.out.println();
		
		comissãoLucio = vendasLucio * 1.5 / 100;
		System.out.printf("Comissão do Lucio R$ = %.2f%n" ,comissãoLucio);
		salarioLucio = comissãoLucio + salarioVendedores + ticket;
		System.out.printf("Salario da líquido do Lucio R$ = %.2f%n" ,salarioLucio);
		
		System.out.println();
		
		comissãoMaria = vendasMaria* 1.5 / 100;
		System.out.printf("Comissão da Maria R$ = %.2f%n" ,comissãoMaria);
		salarioMaria = comissãoMaria + salarioVendedores + ticket;
		System.out.printf("Salario da líquido da Maria R$ = %.2f%n" ,salarioMaria);
		
		System.out.println();
		
		comissãoPedro= vendasPedro * 1.5 / 100;
		System.out.printf("Comissão do Pedro R$ = %.2f%n" ,comissãoPedro);
		salarioPedro= comissãoPedro+ salarioVendedores + ticket;
		System.out.printf("Salario da líquido do Pedro R$ = %.2f%n" ,salarioPedro);
		
        System.out.println();
		
		comissãoJanaina = vendasJanaina * 1.5 / 100;
		System.out.printf("Comissão da Janaina R$ = %.2f%n" ,comissãoJanaina);
		salarioJanaina = comissãoJanaina + salarioVendedores + ticket;
		System.out.printf("Salario da líquido da Janaina R$ = %.2f%n" ,salarioJanaina);
		
		System.out.println();
		
		System.out.println("Gastos da Empresa:");
		gastoTotalSalarios = salarioGerente + salarioVendedores * 8 + salarioCaixa * 2 + salarioMotoboy * 2 + salarioAdministrativo * 2 + salarioFuncionarioLimpeza;
		System.out.printf("Gasto Total com salarios: R$%.2f%n" ,gastoTotalSalarios);
		
		System.out.println();
		
		gastoTotalComissões = comissãoJaqueline = comissãoTiago + comissãoRenato + comissãoFlavio + comissãoLucio + comissãoMaria + comissãoPedro + comissãoJanaina;
		System.out.printf("Gasto Total com comissões: R$%.2f%n" ,gastoTotalComissões);
		
		System.out.println();
		
		fgts = (salarioGerente * 8 / 100)+((salarioVendedores * 8) * 8 /100)+((salarioCaixa * 2) * 8 / 100)+((salarioMotoboy * 2)* 8 / 100)+((salarioAdministrativo * 2) * 8 / 100)+(salarioFuncionarioLimpeza * 2) * 8 / 100;
		System.out.printf("Gasto Total com Fgts: R$%.2f%n" ,fgts);
		
		System.out.println();
		
		gastoPlanoSaude = 16 * 67.78;
		System.out.printf("Gasto Total com Plano de saúde: R$%.2f%n" ,gastoPlanoSaude);
		
		System.out.println();
		
		gastoPlanoOdontologico = 16 * 31.15;
		System.out.printf("Gasto Total com Plano Odontologico: R$%.2f%n" ,gastoPlanoOdontologico);
		
		System.out.println();
		
		lucro = valorTotalVendas - gastoTotalSalarios - gastoTotalComissões - fgts - gastoPlanoSaude - gastoPlanoOdontologico - aluguel;
		System.out.printf("Total de Lucro : R$%.2f%n" ,lucro);
		
		System.out.println();
		
		impostoEstadual = lucro * 5 / 100;
		System.out.printf("Imposto Estadual: R$%.2f%n" ,impostoEstadual);
		
		System.out.println();
		
		impostoFederal = lucro * 8 / 100;
		System.out.printf("Imposto Estadual: R$%.2f%n" ,impostoFederal);
		
		System.out.println();
		
		lucroLiquido = lucro - impostoEstadual - impostoFederal;
		System.out.printf("Total Lucro da Empresa: R$%.2f%n" ,lucroLiquido);
		
		
      sc.close();
	}

}
