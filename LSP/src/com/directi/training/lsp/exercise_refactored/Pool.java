package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run()
    {
        Quackable donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn(); // On l'allume avant de l'utiliser
        
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Quackable... quackables)
    {
        for (Quackable quackable : quackables) {
            quackable.quack();
        }
    }

    private void swim(Quackable... quackables)
    {
        for (Quackable quackable : quackables) {
            quackable.swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
