package dev.lpa;

interface FlightEnabled { // abstract modifier here is unnecessary and redundant

    void takeOff(); // public and abstract modifiers are redundant, meaning unnecessary to declare

    void land(); // abstract modifier is redundant, meaning unnecessary to declare

    void fly(); // This is PREFERRED declaration, public and abstract are implied
}

interface Trackable {
    void track();
}

public abstract class Animal {

    public abstract void move();

}
