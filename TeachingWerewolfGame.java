import java.util.Random;
import java.util.Scanner;

public class TeachingWerewolfGame{
    static class Player{
        
        private int id;
        private String role;
        private boolean alive;
        //private id ,role ,alive

        public Player(){
            this.id = id;
            this.role = role;
            this.alive = true;

        }

        public int gitId(){
            return id;
        }

        public String getRole(){
            return role;
        }

        public boolean get isAlive(){
            return alive;
        }

        public void kill(){
            this.alive = false;
        }

        public String getPublucInfo(){
            if(alive){
                return "Player" + id + "[Alive]";
            }else{
                return "Player" + id + "[Dead]";
            }
        }

        public static void main(String[]){

            Scanner sc = Scanner(System.in);
            Random rand = Random();

            System.out.println("wolfGame");
            System.out.printin("Entere unmber of playres (4-10)");
            int n = sc.nextInt();
            sc.nextLine();

            while (n < 4 || n > 10) {
                System.out.println("Invalidnumber of players. Please enter a unmber betwen 4 and 10.");
                n = sc.nextInt();
                sc.nextLine()
            }
            Player[] players = new Player[n];
            int wolfGame = rand.nextInt();

            for(int i = 0; i < ; i++){
                if(i == wolfGame){
                    players[i] = new Player(i+1, role = "wereWolf");
                }else{
                    players[i] = new Player(i+1, role = "villager");
                }
            }




            System.out.println("Game Start!");
            System.out.print("Role assigment start.");
            System.out.print("Each player take to role");

            for (int i = 0 ; i < n ; i++){
                System.out.printin();
                System.out.println("Player" + (i + 1) + "Please Enter");
                sc.nextLine();
                System.out.println("Your Role :" + players[i].getRole());
                System.out.print("Memorize your role, then turn.");
                sc.nextLine();
                for(int line = 0; line < 30; line++){
                    System.out.println();
                }
            }

            boolean gameOver = false;
            int round = 1;

            while(!gameOver){
                System.out.println("Round" + round);
                System.out();

                System.out.println("Night falls. Werewolf wakes up.");
                int aliveWolf = findAliveWerewolf(players);
                if(aliveWolf != -1){
                    
                }
            }


        }
        } 
    }
}