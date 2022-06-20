package application;
import java.util.ArrayList;
public class quizBase{
    private ArrayList<String> arr1 = new ArrayList<String>();
    private ArrayList<String> answer = new ArrayList<String>();
    private ArrayList<String> question = new ArrayList<String>();
    public quizBase(){
        arr1.add("Explain the meaning of following terms \n Accessor method");
        arr1.add("A method that accesses an object but does not change itactual parameter - \nthe expression supplied for a formal parameter of a method by the caller");
        arr1.add("Constructor");
        arr1.add("A set of statements for initializing a newly instantiated variable");
        arr1.add("Binary");
        arr1.add("The binary, or the base-2, positional numbering system represents numerical values \nusing only two symbols, 0 and 1");
        arr1.add("Boolean");
        arr1.add("A data type with two possible value representing true and false.");
        arr1.add("Object reference");
        arr1.add("A value that denotes the location of an object in memory. In Java, a variable \nwhose type is a class contains a reference to an object of this class.");
        arr1.add("Encapsulation");
        arr1.add("The hiding of implementation details");
        arr1.add("Instance variable");
        arr1.add("A variable defined in a class for which every object of the class has its own value.");
        arr1.add("Primitive data type");
        arr1.add("A data type structured by Java to hold a single data item (Integer, character, \nfloating point, true/false, long)");
        arr1.add("Object reference");
        arr1.add("A value that denotes the location of an object in memory. In Java, a variable \nwhose type is a class contains a reference to an object of this class.");
        arr1.add("Mutator method");
        arr1.add("A method that changes the state of its objects, as opposed to an accessor method");
        arr1.add("Sequential search");
        arr1.add("Assume that you are searching for a key in a list of n elements. A sequential\n search"
        		+ " starts at the first element and compares the key to each element in turn\n until the key"
        		+ " is found or there are no more elements to examine in the list.");
        arr1.add("Signature of a method");
        arr1.add("The signature of a method consists of the name of the method and the description\n (i.e., type, number, and position) of its parameters.");
        arr1.add("Initialize");
        arr1.add("To set a variable to a well-defined value when it is created.");
        arr1.add("Answer the following blanks with appropriate terms.\nInheritance is when a new class (_______) \nis created from an existing class (_______)");
        arr1.add("subclass, superclass");
        arr1.add("The benefit of _______ is: ability to define a behavior that's specific to the subclass type");
        arr1.add("Method overriding");
        arr1.add("To specify the inheritance relationship between a subclass and a superclass,\n in the declaration of the subclass, use the keyword _______");
        arr1.add("Extends");
        arr1.add("A method in a superclass is overriden in a subclass by defining a method with same _______");
        arr1.add("return type and signature (name and parameter types)");
        arr1.add("_______ is never inherited");
        arr1.add("Constructor");
        arr1.add("If super is used in the implementation of a subclass constructor, it must\n be used in the _______ of the constructor body");
        arr1.add("first line");
        arr1.add("The mechanism of selecting the appropriate method for a particular object\n in a class hierarchy");
        arr1.add("Polymorphism");
        arr1.add("Making a run-time decision about which instance method to call is known as _______");
        arr1.add("Dynamic binding (late binding)");
        arr1.add("When the compiler selects the correct overloaded method at compile time by\n comparing the methods' signatures");
        arr1.add("Overloading");
        arr1.add("Casting a superclass to a subclass type is called _______");
        arr1.add("Downcasting");
        arr1.add("Abstract methods must be declared in an _______");
        arr1.add("Abstract class");
        arr1.add("Which data type(s) would be most appropriate to use when recording whether a\n switch is in the \"on\" or \"off\" position?");
        arr1.add("Boolean");
        arr1.add("Is the size of an ArrayList variable?");
        arr1.add("Yes");
        arr1.add("_______ methods and variables in a class can be accessed only by methods of that class.");
        arr1.add("Private");
        arr1.add("Which java keyword means that memory allocation happens once.");
        arr1.add("Static");
        arr1.add("In Java, the selection of the correct method occurs during _______.");
        arr1.add("Run-time");
        arr1.add("Making a run-time decision about which instance method to call is known as _______.");
        arr1.add("Dynamic binding or late binding");
        arr1.add("An _______ class is a superclass that represents an abstract concept, and \ntherefore should not be instantiated.");
        arr1.add("Abstract");
        arr1.add("An _______ is a collection of related methods, either abstract (headers only) or default(implementation provided in the interface).");
        arr1.add("Interface");
        arr1.add("Wrapper classes for \"int\" and \"double\" are _______.");
        arr1.add("Integer class and Double class");
        arr1.add("A _______ method is a method that calls itself.");
        arr1.add("Recursive");
        for (int i = 0; i < arr1.size(); i += 2) {
        	question.add(arr1.get(i));
        }
        for (int t = 1; t < arr1.size(); t += 2) {
        	answer.add(arr1.get(t));
        }
    }
    public ArrayList<String> qb(){
        return arr1;
    }
    
    public ArrayList<String> ans(){
        return answer;
    }
    
    public ArrayList<String> ques(){
        return question;
    }
}
