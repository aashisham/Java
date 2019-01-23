# Nested Interface :
 *An interface can be declared a member of class or another interface. Such an interface is called a member interface or nested interface.* 
- It can be declared as public , private or protected.
- **We can declare an interface in another interface or class. Such an interface is termed as a nested interface.**

Following are the rules governing a nested interface.

- A nested interface declared within an interface must be public.
- A nested interface declared within a class can have any access modifier.
- A nested interface is by default static.

```java
    interface OuterInterface{
        interface InnerInterface{
            // code goes here.
        }
    }
```
