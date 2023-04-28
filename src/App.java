import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("digite o número de contatos na agenda: ");
        int quant = sc.nextInt();
        Schedule []list = new Schedule[quant];

        for(int i = 0; i < quant; i++){
                // Limpa o terminal 
                  System.out.print("\033[H\033[2J");
                   System.out.flush();
                // Limpa o terminal 
        Schedule agdSchedule = new Schedule();
         
        System.out.println("Digite o primeiro nome: ");
        agdSchedule.setName(sc.next()); 

        System.out.println("Digite o sobrenome: ");
        agdSchedule.setSurName(sc.next());
        
        System.out.println("Digite o telefone para contato: ");
        agdSchedule.setContactPhone(sc.nextInt());

        list[i] = agdSchedule;
        }
        System.out.println("\n--------LISTA TELEFÔNICA-------- \n");

        for(Schedule schedule : list ){
            System.out.println(schedule.getName());
            System.out.println(schedule.getSurName());
            System.out.println(schedule.getContactPhone()+"\n");
        }

        System.out.println("EXISTEM "+quant+" NÚMEROS DE TELEFONE NESSA LISTA !!!");
      
    }
}
