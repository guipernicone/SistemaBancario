package contateste;

public class ContaSimples extends Conta{
    public ContaSimples(String nome, int numero, double saldo, double limiteDeCredito)
	{
            super(nome,numero,saldo,limiteDeCredito);
            System.out.println("Simples\n");
	}
	public void Sacar(double saque)
	{
            double saldo;
            saldo = super.getSaldo();
            if((saldo - saque) >= 0)
            {
                    super.Sacar(saque);
                    System.out.println("Saque\n");
            }
            else
            {
                    System.out.println("Saque recusado");
            }
	}
}

