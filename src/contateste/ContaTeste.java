package contateste;
import java.util.Scanner;

public class ContaTeste {

    public static void main(String[] args) {
	int escolha , numero, i = 0, numeroConta, j, validaConta = 0;
	String nome;
	double saldo, limite, saque = 0, deposito = 0,juros, limiteNegativo;
	Conta conta[] = new Conta[15];
	i = 0;
	Scanner input = new Scanner(System.in);
	do{
            System.out.println("0) Criar uma conta Simples.");
            System.out.println("1) Criar uma conta Especial.");
            System.out.println("2) Criar uma conta Poupança.");
            System.out.println("3) Debitar conta.");
            System.out.println("4) Sacar conta");
            System.out.println("5) Incrementar rendimento conta poupanca");
            System.out.println("6) Imprimir saldo");
            System.out.println("7) Sair.");
            escolha = input.nextInt();
            switch(escolha){
		case 0:
                    System.out.println("Digite o nome do correntista:");
                    input.nextLine();
                    nome = input.nextLine();
                    do
                    {
                        System.out.println("Digite o numero da conta:");
                        numero = input.nextInt();
                        for(j = 0; j < i; j++)
                        {
                            validaConta = conta[j].validaConta(numero);
                            if(validaConta == 1)
                                break;
                        }
                    }while(validaConta == 1);
                    System.out.println("Digite o saldo da conta:");
                    saldo = input.nextDouble();
                    conta[i] = new ContaSimples(nome,numero,saldo,0);
                    i++;
                    break;
		case 1:
                    System.out.println("Digite o nome do correntista:");
                    input.nextLine();
                    nome = input.nextLine(); 
                    do
                    {
                        System.out.println("Digite o numero da conta:");
                        numero = input.nextInt();
                        for(j = 0; j < i; j++)
                        {
                            validaConta = conta[j].validaConta(numero);
                            if(validaConta == 1)
                                break;
                        }
                    }while(validaConta == 1);
                    System.out.println("Digite o saldo da conta:");
                    saldo = input.nextDouble();
                    System.out.println("Digite o limite da conta:");
                    limite = input.nextDouble();
                    conta[i] = new ContaEspecial(nome,numero,saldo,limite);
                    i++;
                    break;
		case 2:
                    System.out.println("Digite o nome do correntista:");
                    input.nextLine();
                    nome = input.nextLine(); 
                    do
                    {
                        System.out.println("Digite o numero da conta:");
                        numero = input.nextInt();
                        for(j = 0; j < i; j++)
                        {
                            validaConta = conta[j].validaConta(numero);
                            if(validaConta == 1)
                                break;
                        }
                    }while(validaConta == 1);
                    System.out.println("Digite o saldo da conta:");
                    saldo = input.nextDouble();
                    System.out.println("Digite o limite da conta:");
                    limite = input.nextDouble();
                    System.out.println("Digite o a % de juros da conta:");
                    juros = input.nextDouble();
                    conta[i] = new ContaPoupanca(nome,numero,saldo,limite,juros);
                    i++;
                    break;
                case 3:
                    System.out.println("Digite o numero da conta a consultar");
                    numeroConta = input.nextInt();
                    for( j = 0; j < i; j++)
                    {
                        if(numeroConta == conta[j].getNumero()) 
                        {
                           if(conta[j] instanceof ContaSimples){
                               System.out.print("Digite o valor a Depositar: ");
                                deposito = input.nextDouble();
                                conta[j].Depositar(deposito);                               
                            }
                            else if(conta[j] instanceof ContaEspecial){
                                System.out.print("Digite o valor a Depositar: ");
                                deposito = input.nextDouble();
                                conta[j].Depositar(deposito);                             
                            }
                            else if(conta[j] instanceof ContaPoupanca){
                                System.out.print("Digite o valor a Depositar: ");
                                deposito = input.nextDouble();
                                conta[j].Depositar(deposito);                              
                            }
                            else{
                                System.out.println("Conta Inativa!");                                
                            }
                            break;
                        }                       
                    }
                    if(j >= i)
                        System.out.println("Conta Inexistente!");
                    break;                    
                case 4:
                    System.out.println("Digite o numero da conta a consultar");
                    numeroConta = input.nextInt();
                    for( j = 0; j < i; j++)
                    {
                        if(numeroConta == conta[j].getNumero()) 
                        {
                           if(conta[j] instanceof ContaSimples){
                               System.out.print("Digite o valor a sacar: ");
                                saque = input.nextDouble();
                                conta[j].Sacar(saque);                               
                            }
                            else if(conta[j] instanceof ContaEspecial){
                                System.out.print("Digite o valor a sacar: ");
                                saque = input.nextDouble();
                                conta[j].Sacar(saque);                             
                            }
                            else if(conta[j] instanceof ContaPoupanca){
                                System.out.print("Digite o valor a sacar: ");
                                saque = input.nextDouble();
                                conta[j].Sacar(saque);                              
                            }
                            else{
                                System.out.println("Conta Inativa!");                                
                            }
                            break;
                        }  
                    }
                    if(j >= i)
                        System.out.println("Conta Inexistente!");
                    break;
                case 5:
                    for( j = 0; j < i; j++)
                    {
                           if(conta[j] instanceof ContaPoupanca){
                               ContaPoupanca cp = (ContaPoupanca) conta[j];
                               cp.Rendimento();
                           } 
                    }  
                    System.out.println("Rendimento aplicado!");
                    break; 
                case 6:
                    System.out.println("Digite o numero da conta a consultar");
                    numeroConta = input.nextInt();
                    for( j = 0; j < i; j++)
                    {
                        if(numeroConta == conta[j].getNumero()) 
                        {
                            System.out.println("Saldo: R$ " + conta[j].getSaldo());
                            break;
                        }
                    }
                    
            }
	}while(escolha != 7);
    }
}
