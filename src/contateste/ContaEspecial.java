package contateste;
public class ContaEspecial extends Conta {
	
	
	public ContaEspecial(String nome, int numero, double saldo, double limiteDeCredito)
	{
		super(nome,numero,saldo,limiteDeCredito);
	}
	public void Sacar(double saque)
	{
		double saldo;
		saldo = super.getSaldo();
                double limite;
                limite = super.getLimiteDeCredito();
		if((saldo - saque) >= (limite)*(-1))
		{
			super.Sacar(saque);
		}
		else
		{
			System.out.println("Saque recusado");
		}
	}
}
