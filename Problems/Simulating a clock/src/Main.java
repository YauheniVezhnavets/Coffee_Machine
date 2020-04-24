class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (minutes <59){
            minutes++;
        }
        else {
            if (hours == 12) {
                minutes = 0;
                hours = 0;
            }
            if (hours<12){
                minutes = 0;
                hours++;
            }
        }
    }
}