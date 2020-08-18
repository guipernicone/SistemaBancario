package contateste;

public abstract class Conta {
    private String  nomeDoCorrentista;
	private int numero;
	private double saldo;
	private double limiteDeCredito;
	public String getNomeDoCorrentista() {
		return nomeDoCorrentista;
	}
	public void setNomeDoCorrentista(String nomeDoCorrentista) {
		this.nomeDoCorrentista = nomeDoCorrentista;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}
	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}
	
	public  Conta(String nomeDoCorrentista,int numero, double saldo, double limiteDeCredito)
	{
		this.nomeDoCorrentista = nomeDoCorrentista;
		this.numero = numero;
		this.saldo = saldo;
		this.limiteDeCredito = limiteDeCredito;
	}
	public  Conta()
	{
		this.nomeDoCorrentista = "Conta Inativa";
		this.numero = 0;
		this.saldo = 0;
		this.limiteDeCredito = 0;
	}
	public void Sacar(double saque)
	{
		this.saldo = this.saldo - saque;
		/*if((saldo - saque) >= 0){
			saldo = saldo - saque;
		}
		else {
			System.out.println("Saque recusado");
		}*/
	}
	public void Depositar(double deposito) {
		this.saldo = this.saldo + deposito;
	}

        public int validaConta(int numero)
        {
            if(getNumero() == numero)
            {
                return 1;
            }
            return 0;
        }

//    void Rendimento() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
