package MyNotFirstButFirstProject;

public class HelloWorld {

    public static void main(String args[]){
        System.out.println("Hello World ");
        System.out.println("Makadini Nyika");
    }

    //saving a .java file automatically compiles it to a .class(byte) file
    //a single .java file can have multiple classes, but they will each be compiled into their own .class file
    //class with main method must always be public
    //.java file must have the same name as the class name.(it will throw an error if that's not the case.

    /*
    * Soo what then happens after the .class file has been created?
    *
    * Well let me tell YOU! The file is loaded into the Java Virtual Machine ( that's the thing responsible for actually
    * running your code). So what's in the JVM? We will look at that in parts now.
    *
    * JVM dun dun dun!! zoop lol
    *
    * --class loader: loads the class files needed for execution
    * --byte code verifier: checks code fragments for illegal code
    * --Interpreter: converts the byte code to machine language (literal interpreter lol)
    * --JIT(Just In Time) Compiler: compiles reusable byte code to machine code (APPARENTLY, this helps with performance
    *    optimization)
    * --Runtime: Assists in the overall execution of the program
    *
    * Now back to what we were talking about...
    * Java is platform independent, meaning it is not dependent on any one operating system, and I can take the same app
    * or code that works on a Linux or MacOS(though mac is linux lol) and run it on a Windows machine no problem.. so
    * long as I have the JDK(Java Development Kit) on my windows too... SO Convenient! Oh and apparently this happens
    * with absolutely NO recompilation... wonderful!!
    *
    * Some other really cool features of Java:
    *
    *   -- Object Oriented.. will explain this a little later :)
    *   -- Simple: it is a high level language, so a little easier to understand than some other languages like ARM(eew)
    *               it also relatively easy to learn
    *   -- Robust: performs automatic memory management(unlike yucky C lol) so no malloc and dealloc( and the nightmare
    *               of leaks and that weird ambiguous error lol)
    *               -strong type checking mechanism, so if you say it's a string and you put a character... better be ready
    *                for that mad level screaming letting you know( it's actually not that bad, but a nuisance if you wanna
    *                break strings.. but there's methods for that so it's ok)
    *   -- Architecture Neutral: the whole platform independence thing we talked about but named fancilly lol
    *   -- Secure: remember the whole memory management thing, well that also means you can't access data using memory addresses
    *               so if you hate pointers like me, woot woot.. if you don't know what pointers are.. TRIPLE WOOT.
    *               -execution is inside contained environment
    *   --Multi-threaded: so like before I had thos one WILD interview test, I only half knew about this, and still do lol
    *                     but it means that a program can do the same thing many times at the same time, like boiling two
    *                     pots of water on a single stove but two different burners.
    *
    *  NOW WE MOVE ON TO A LITTLE CODING THING THING SO INTO XPro Sellers we go!
    *
    * */
}
