package com.example.app;

//import com.example.util.StringUtil;
import com.example.util2.UtilityHelper;
import com.example.util3.UtilityHelper2;

public class MainApp {
    public static void main(String[] args) {
        useUtilityHelperDirectly();
        //utilDep();
    }

//    private static void utilDep() {
//        String message = "hello world";
//        System.out.println("Capitalized: " + StringUtil.capitalize(message));
//        System.out.println("Formatted Message: " + StringUtil.getFormattedMessage("dependency injection test"));
//    }


     public static void useUtilityHelperDirectly() {
         UtilityHelper helper = new UtilityHelper("direct dependency test");
         System.out.println("Helper Message: " + helper.getMessage());
     }

    public static void useUtilityHelper2Directly() {
        UtilityHelper2 helper2 = new UtilityHelper2("direct dependency test");
        System.out.println("Helper Message: " + helper2.getMessage());
    }
}
