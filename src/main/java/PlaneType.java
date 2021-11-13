
public enum PlaneType {

    BOEING767(200, 200),
    BOEING757(150, 150),
    BOEING747(100, 100);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }
}