import java.util.Random;

public class Die {
    //Method to get die roll
    public int getDie(){
        Random randomNumberGenerator = new Random();
        int randomNumbers = randomNumberGenerator.nextInt(6) + 1;
        return randomNumbers;
    }
}
