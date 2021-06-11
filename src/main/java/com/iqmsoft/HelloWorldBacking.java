
package com.iqmsoft;


public class HelloWorldBacking
{

    //properties
    private String name;

    /**
     * default empty constructor
     */
    public HelloWorldBacking()
    {
    }

    //-------------------getter & setter
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Method that is backed to a submit button of a form.
     */
    public String send()
    {
        //do real logic
        return ("success");
    }
}