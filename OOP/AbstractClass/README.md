# Abstract Class :
![abstractclass](https://user-images.githubusercontent.com/33601771/51620300-292f6380-1f5a-11e9-83b1-8ea763cfd4ce.jpg)

> Extract class ko object garauna payinna
- There are situations in which you will want to define a superclass that declares the structure of a given abstration without providing a complete implement ation of every method.
- That is, sometimes you will want to create a superclass that only defines a generalized form that will be shared by all of its subclasses, leaving it to each subclass to fill in the detail.
- One way this situation can occur is when a superclass is unable to create a meaningful implementation for a method.
- When you want some way to ensure that a subclass does, indeed, override all necessary methods. Java's solution is the abstract method.
  
 > *Syntax of abstract method :*

  ` abstract typeName (parameter List); // No body `
> Example :

   ` abstract void sum(int a, int b); // No body`
   
- These abstract methods are sometimes referred to as sub classes responsibility because they have no implementation specified in the superclass. Thus subclass must override them.
- Any class that contains one or more abstract methods must also be declared abstract.
> Example :
```java
    abstract class A{
        // code goes here.
    }
 ```
- Abstract class cannot e directly instantiated with new operator i.e. no object.
- Cannot declare abstract constructor or abstract static method.
- *__Any subclass of an abstract class must either implement all of the abstract methods or be declared abstract itself.__*
