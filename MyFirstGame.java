public class MyFirstGame {

    public static void main (String[] args) {
        int computerNumber =  50;
        int myNumber = 10;

        System.out.println("Start!!!");

        while(true){
            if(myNumber == computerNumber) {
                System.out.println("You guessed it !!!");
                break;
            } if(myNumber > computerNumber) {
                System.out.println("You entered a number = " + myNumber + " > than what the computer entered!!");
                myNumber--;
            } if(myNumber < computerNumber) {
                System.out.println("You entered a number = " + myNumber +" < than what the computer entered!!");
                myNumber++;
            }
        }
        System.out.println("You Win!!!");
    }
}
