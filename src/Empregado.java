public class Empregado {
    private String nome;
    private int idade;
    private double salario;

    public Empregado(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void promover(){
        aumentarSalario(25);
    }
    public void aumentarSalario(int percento){
        setSalario(this.salario*((double)percento/100));
    }
    public void demitir(int motivo){
        switch(motivo){
            case 1:
                System.out.println("Parabens! Você foi demitido por justa causa. Devera cumprir aviso.");
                break;
            case 2:
                System.out.println("Parabens! Você foi demitido. Deverá parar uma multa de: " + (this.salario*0.4));
                break;
            case 3:
                System.out.println("Parabens! Você foi aposentado. O salário de aposentadoria é:");
                if(this.salario > 1000 && this.salario <= 2000){
                    System.out.println("R$ 1500");
                }else if(this.salario > 2000 && this.salario <= 3000){
                    System.out.println("R$ 2500");
                }else if(this.salario > 3000 && this.salario <= 4000){
                    System.out.println("R$ 3500");
                }else System.out.println("R$ 4000");
            default:
                System.out.println("Opção invalida.");
                break;
        }
    }
    public void felizAniversario(){
        this.idade = this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
