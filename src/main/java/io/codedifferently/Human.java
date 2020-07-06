package io.codedifferently;

public class Human 
{
    private String firstName;
    private String lastName;
    private int energy;
    static int maxEnergy = 100;

    public Human(String firstName, String lastName, int energy) 
    {
        this.firstName = firstName;
        this.lastName = lastName;

        if (energy < maxEnergy)
        {
            this.energy = energy;
        } else {
            this.energy = maxEnergy;
        }
        
    }


    public String getFirstName() 
    {
        return this.firstName;
    }

    public String getLastName() 
    {
        return this.lastName;
    }
    public int getEnergy()
    {
        return this.energy;
    }
    
    public void eat(Fruit givenFruit)
    {
        if (this.energy + givenFruit.energy <= maxEnergy)
        {
            this.energy = this.energy + givenFruit.energy;
        } else {
            this.energy = maxEnergy;
            System.out.println("Energy level exceeds maximum.");
        }
    }

    public void work(int hoursWorked)
    {
        int spent_energy = hoursWorked*10;

        if (spent_energy < this.getEnergy())
        {
            this.energy = this.energy - spent_energy;
        } else {
            System.out.println("Needed energy exceeds current energy amount.");
        }
        
    }

    
}