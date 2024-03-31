package Interfaces;


public class DiamondProlemClass implements DiamondProblemInterface1, DiamondProblemInterface2 {
    
    @Override
    public void m1(){
        DiamondProblemInterface1.super.m1();
    }

}
