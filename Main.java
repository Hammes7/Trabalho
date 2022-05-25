import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Robo robo = new Robo();

        robo.bateria = 120;
        String escolha = "";

        do{
            if (robo.bateria > 20){
                System.out.println("============================================");
                System.out.println("Qual é o Próximo movimento do Robo Lunar?");
                System.out.println("============================================");
                System.out.println(" 8    - Andar pra Frente");
                System.out.println(" 4    - Virar pra Esquerda");
                System.out.println(" 2    - Andar pra Trás");
                System.out.println(" 6    - Virar pra Direita");
                System.out.println(" G    - Tirar Foto");
                System.out.println(" EXIT  - Para sair do acesso remoto ao robo");
                System.out.println("============================================\n");
                Scanner leitor = new Scanner (System.in);
                escolha = leitor.nextLine();

                switch (escolha) {
                    case "8":
                        robo.Front();
                        break;
                    case "4":
                        robo.Left();
                        break;
                    case "2":
                        robo.Back();
                        break;
                    case "6":
                        robo.Rigth();
                        break;
                    case "G":
                        robo.Photo();
                        break;
                    case "EXIT":
                        System.out.println("\nDesconectando do Robo.......\n");
                        robo.sair = true;
                        break;
                    default:
                        System.out.println(" Esta não é uma função que o Robo saiba executar");                
                }
            }else if(robo.bateria >= 20){
                System.out.println(" O Robo Lunar está com 20% ou menos de sua bateria, entrando em modo de AUTO-RECARGA!");
                System.out.println("* Passam se 3 dias * \n");
                robo.bateria = 120;
            }
        }while(robo.sair != true); 
    }
}