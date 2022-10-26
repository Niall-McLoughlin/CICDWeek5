package ie.atu.week5;

public class Count {
    private int countValue;

    public Count() {
        countValue = 0;
    }

    public Count(int startingValue) {
        if (startingValue > 5) {
            countValue = startingValue;
        }
        else
        {
            throw new IllegalArgumentException("This is not a valid number");
        }
    }



    public int increment() {
        countValue++;
        return countValue;
    }
    public int decrement() {
        countValue--;
        return countValue;
    }
}
