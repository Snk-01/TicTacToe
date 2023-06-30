import java.util.Scanner;
public class main_class2 {
        public static void main(String[] args){
            minimax_algorithm ob = new minimax_algorithm();
            int i=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1 for players first move or 0 for computer's first move");
            int input=sc.nextInt();
            if(input==1) // player gives moves
                ob.isfirst=false;
            while(true){
                if(ob.evaluate()==10) {
                    System.out.println("Computer Wins");
                    break;
                }
                else if(ob.evaluate()==-10) {
                    System.out.println("Player Wins");
                    break;
                }

                if(i%2==input){
                    Move bestMove=ob.findBestMove();
                    ob.board[bestMove.row][bestMove.col]='x';
                    System.out.println("The computer's move:");
                }
                else{
                    System.out.print("Enter position:- ");
                    int row=sc.nextInt();
                    int col=sc.nextInt();
                    if(ob.board[row][col]!='_'){
                        System.out.println("You cheater you nickel-head i punish you to lose the game!!");
                        System.exit(0);
                    }
                    ob.board[row][col]='o';
                    System.out.println("The Player's move:");
                }
                ob.display();
                i++;
                if(i==9) {
                    System.out.println("Draw");
                    break;
                }
            }
            System.out.println("The final board is:");
            ob.display();
        }
}

