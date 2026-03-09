import java.util.ArrayList;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {

       // ArrayList<Pet> pet = new ArrayList<Pet>();
        
        

        boolean sair = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("==============");
        System.out.println("Bem vindo ao PetShop");


        do {
            
            System.out.println("================");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - NUMERO PARA CONTATO");
              System.out.println("2 - PARA MASCAR CONSULTA");
            System.out.println(" 3 - MAQUEI A CONSULTA. DESCRISÂO DO PET");
            System.out.println(" 4 - PARA EMCERAR O ATENDIMENTO");
            System.out.println("================");

            int opcao = sc.nextInt(); // usuário escolhe o número

            switch (opcao) {

                case 1:
                   // System.out.println("Lista de pets:");
                   // System.out.println(pet);
                   System.out.println("================");
                    System.out.println("PARA CONTATOS COM NOSSOS COLABORADORES:");
                    System.out.println("(65) 9 9999-9999");
                    System.out.println("================");
                    break;

                case 2:

                        System.out.println("================");
                        System.out.println("MARQUAR HORARIO PARA CONSULTA");
                        System.out.println("nome do Dono do Pet");
                        String dono = sc.nextLine();
                        System.out.println("numero do CPF");
                        String cpf = sc.nextLine();
                        System.out.println("qual o numero para entrar em contato");
                        String contato = sc.nextLine();
                        System.out.println("HORARIO PARA MARCAR DAS 08:00 ÁS 17:00");
                        String horario = sc.nextLine();
                        System.out.println("================");
                   
                   
                    break;

                    case 3:
                        System.out.println("numero do CPF");
                        String cpfPessoa = sc.next();
                        System.out.println("QUAL O NOME DO PET");
                        String nome = sc.nextLine();
                       System.out.println("qual a idade do PET");
                       int idade = sc.nextInt();
                       System.out.println("raça do seu Pet ");
                       String raca = sc.nextLine();

                       
                    break;

                default:
                    System.out.println("ATENDIMENTO EMCARRADO, TENHA UM ÓTIMO DIA");
                     sair = true;
                    break;
            }

        } while (!sair);

        sc.close();
    }
}