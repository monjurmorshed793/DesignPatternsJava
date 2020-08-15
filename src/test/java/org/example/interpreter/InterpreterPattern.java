package org.example.interpreter;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterPattern {

    static Expression buildInterpreterTree(){
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");


        //Tigers and Bears
        Expression alternation1 = new AndExpression(terminal2, terminal3);

        // Lions or (Tigers and Bears)
        Expression alternation2 = new OrExpression(terminal1, alternation1);

        return new AndExpression(terminal3, alternation2);
    }
    @Test
    public void testBasicInterpreter(){
        String input = "Lions, and tigers, and bears! Oh, my!";

        Pattern p = Pattern.compile("(Lion|cat|dog|dog|wolf|bear|human|tiger)");
        Matcher m = p.matcher(input);

        while(m.find()){
            System.out.println("Found a "+ m.group()+".");
        }
    }

    @Test
    public void testInterpreterPattern(){
        String context = "Lions Bears";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is "+ define.interpret(context));

    }
}
