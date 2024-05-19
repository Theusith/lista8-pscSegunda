import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Empregado> empregados = new ArrayList<>();


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continuar = false;
        while(!continuar){
            menu();
            int opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    adicionarEmpregado();
                    break;
                case 2:
                    System.out.println("Digite o nome do empregado:");


                case 7: continuar = true;
            }

        }
    }
    public static void menu(){
        System.out.println("1. Criar novo empregado");
        System.out.println("2. Promover empregado");
        System.out.println("3. Aumentar salario do empregado");
        System.out.println("4. Demitir empregado");
        System.out.println("5. Fazer aniversario do empregado");
        System.out.println("6. Mostrar detalhes dos empregados");
        System.out.println("7. Salir");
    }
     public static void adicionarEmpregado(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite o nome do empregado: ");
         String nome = sc.next();
         System.out.println("Digite a idade do empregado: ");
         int idade = sc.nextInt();
         System.out.println("Digite o salario do empregado: ");
         double salario = sc.nextDouble();
         Empregado empregado = new Empregado(nome, idade, salario);
         empregados.add(empregado);
     }
     public static Empregado buscarEmpregado(String nome){
        for(Empregado empregado : empregados){
            if(empregado.getNome().equals(nome)){
                return empregado;
            }
        } return null;
     }
}