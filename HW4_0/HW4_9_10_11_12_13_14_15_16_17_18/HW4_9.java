///*package HW4_4;
//
//public abstract final class ab_fn {
//}*/
//No, you cannot make an abstract class or method final in Java
//because the abstract and final are mutually exclusive
//
//
// -----------------4_9-----------------
//Class cannot extend multiple classes

/*-------------------4_10-----------------
add:        import animals.Dog;*/


/*
--------------------4_11-------------------
1) its not running because bark method is protected
2) for fix: change protected to public

-------------------4_12----------------------
Whaf-Dog
-------------------4_13----------------------
Since it is not a manual activity, the JVM will automatically take care of this for you
-------------------4_14----------------------
D: All the above
--------------------4_15---------------------
Yes, It is possible to have a try block without a catch block by using a final block.

A final block should be always execute even there is an exception occurred in a try block,
except System.exit() it will execute always.

-------------------4_16----------------------
Exception in thread "main" java.lang.RuntimeException:

-------------------4_17----------------------
A constant is a variable whose value cannot change once it has been assigned.
Java doesn't have built-in support for constants.

A constant can make our program more easily read and understood by others.
In addition, a constant is cached by the JVM as well as our application,
so using a constant can improve performance.


To define a variable as a constant, we just need to add the keyword “final”
in front of the variable declaration.


-------------------4_18----------------------
class A extends B{}
class B extends C{}
class C extends A{}

Such relation is simply not possible
While Dog is an Animal an Animal is not a Dog. Otherwise all animals will be Dogs!

*/




