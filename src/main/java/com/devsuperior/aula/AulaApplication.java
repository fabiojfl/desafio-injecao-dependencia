package com.devsuperior.aula;

import com.devsuperior.aula.entities.Order;
import com.devsuperior.aula.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		int code;
		double basic, valDiscount;

		Scanner input = new Scanner(System.in);

		System.out.println("Escreva o codigo do pedido (apenas numeros): ");
		code = input.nextInt();
		System.out.println("Escreva o valor do pedido: ");
		basic = input.nextDouble();
		System.out.println("Valor do Desconto ");
		valDiscount = input.nextDouble();

		Order codeProduct = new Order(code, basic, valDiscount);
		Order order = new Order(code, basic, valDiscount);

		System.out.println("Código do Pedido: "+orderService.code(codeProduct));
		System.out.println("Total: "+orderService.total(order));
	}
}
