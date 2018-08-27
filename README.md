# Bank-Account-Project
This repository contains a bank account project written in Java.This application handles new customer bank account requests.There are two types of accounts ie Checkings & Savings.
Both account types have methods like deposit,withdraw,information and transfer.

Information related to new customers like name,SSN,account type and intial deposit are read from a .csv file.
I have made use of interface for interest rate and super constructors by using Account class as the parent class and Savings and Checkings class extends Account class.

A 11 digit account number is generated starting with 1 for Savings and 2 for Checkings then last 2 digits of SSN,a unique 5 digit number and a 3 digit random number.
Savings account has a safety deposit box and its 3 digit key.
Checking account has a 12 digit debit card and a 4 digit PIN.

I also made use of abstract classes and abstract methods and different access modifiers and as well as interface API to receive information from a developer's application.

To run this application,download the zip file and extract it and run the BankAccountApp.java file.

