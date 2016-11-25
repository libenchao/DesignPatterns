package org.tridiots.dp.strategy;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
