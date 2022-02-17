package com.gdchent.kotlin;

public interface JavaInputDevice {


    void input(Object event);


    class Computer implements JavaInputDevice{
        @Override
        public void input(Object event) {

        }
    }
}


