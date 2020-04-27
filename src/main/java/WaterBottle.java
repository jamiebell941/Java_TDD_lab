public class WaterBottle {

    private int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int currentVolume(){
        return volume;
    }

    public int drink(int drink) {
        return volume - drink;
    }

    public int empty(int i) {
        return volume - i;
    }


    public int fill(int currentVolume) {
       int amount = volume - currentVolume;
              return currentVolume + amount;

    }
}

