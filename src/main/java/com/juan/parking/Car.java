package com.juan.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter ;
    //private long enter;
    private LocalDateTime leave ;
    //private long leave;

    public Car(String id , LocalDateTime enter){
        this.id = id ;
        this.enter = enter;
    }

    public long getDuration() {
        Duration duration = Duration.between(enter, leave);
        return  duration.toMinutes();
    }

    public void leave(){
        this.leave = LocalDateTime.now();//System.currentTimeMillis();
    }

    public void setLeave(LocalDateTime leave){
        if(leave.isAfter(this.enter)){
            this.leave = leave ;
        }
    }
}
