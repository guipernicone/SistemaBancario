package contateste;

public class ContaPoupanca extends Conta {
	private double juros;
	
	public ContaPoupanca(String nome, int numero, double saldo, double limiteDeCredito, double juros)
	{
		super(nome,numero,saldo,limiteDeCredito);
		this.juros = juros;
	}
	public void Sacar(double saque)
	{
		double saldo;
		saldo = super.getSaldo();
		if((saldo - saque) >= 0)
		{
			super.Sacar(saque);
		}
		else
		{
			System.out.println("Saque recusado");
		}
	}
        public void Rendimento()
        {
            double saldo;
            saldo = super.getSaldo();
            super.Depositar(saldo *(1 + (juros / 100)));
            super.Sacar(saldo);
        }
}
