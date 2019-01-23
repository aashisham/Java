# Interface :

>interface ma sabai method abstract hunu parchha
- Using the keyword 'interface', you can fully abstract a class interface from its implementation.
- That is ; using interface, you can specify what a class must do, but not how it does it.
- They are syntactically similar to classes, but they lack instance variables ad then methods are declared without any body.
- Interfaces are designed to support dynamic method resolution at run time.

## Defining an Interface :

 ```
    accessModifier interface name{

        returnType methodName(parameterList); // public/abstract method; before JDK 8
        type final varNameOne  = value; // final/static

    }
 ```
But beginning with JDK 8, it is possible to add a default implementation to an interface method. Thus it is now possible for interface to specify some behaviour.
```
    default void mOne(){
        // code goes here
    }
```

## Implementing Interface :
```
    class className [extends superClass] [interface interfaceOne, interfaceTwo]{
        //code goes here
    }
```
- When you implement an interface method, it must be declared as public.
- Method should be public in interface.
- Class member variable should either be PUBLIC or STATIC.
> Class variable final ki static hunu parchha
- The method inside interface can contain the body, if it is DEFAULT.
> Interface ko method ma default lekhe body pani lekhna payinchha


*__Why do we use interface ?__*

- It is used to achieve total abstraction.
- Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance.
- It is also used to achieve loose coupling.

> Interfaces are used to implement abstraction. So the question arises why use interfaces when we have abstract classes?

- The reason is, abstract classes may contain non-final variables, whereas variables in interface are final, public and static.

## Nested Interfaces:
- An interface can be declared a member of class or another interface. Such an interface is called a member interface or nested interface.
  It can be declared as public , private or protected.
  
## Interface can be extended :

- Interface ---  Interface (extends)
 > interface extends interface

- Class     ---  Class (extends)
 > class extends class

- Class     ---  Interface (implements)
 > class implements interface

- Class     ---  Abstract Class (extends)
 > class extends abstract class
