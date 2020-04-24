enum DangerLevel {
    HIGH ("high",3),
    MEDIUM("medium",2),
    LOW("low",1);



    private final String dangerLevel;
    private final int number;

    DangerLevel(String dangerLevel, int number) {
        this.dangerLevel = dangerLevel;
        this.number = number;
    }


    public int getLevel (){
        return this.number;
    }
}
