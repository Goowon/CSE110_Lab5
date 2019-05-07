package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float cel = ((this.getValue()-32)*5)/9;
        return new Celsius(cel);
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        return ""+this.getValue()+" F";
    }
}