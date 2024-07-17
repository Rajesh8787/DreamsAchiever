package main.java.org.corejava.hashMap;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Write a java code to filter out imcomplete loan status in java 8\
//creatin a list with status
//stream & filter(return boolean) apply
//collect


public class LoanFiltering {
    public static void main(String args){
        List<Loan> loans = new ArrayList<>();
        loans.add(new Loan ("Loan 1","incomplete"));
        loans.add(new Loan("Loan 2","complete"));

        List<Loan> loanFilter = loans.stream()
                .filter(x -> x.getStatus().equals("incomplete"))
                .collect(Collectors.toList());

        System.out.println(loanFilter);
    }

}
