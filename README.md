# Java-Shopping
# Java
-----------------------------------------------------------
Version 17 of Java
you use Intellij Idea to write the Java code 

# Architecture
---------------------------------------------------------
we use MVC method
Model View Controller, or MVC
We only needed to build a getter and setter method in the model file.
Simply looking at the page in View File
An enterprise logic is written in the Controller File.
To print and scan files, we use the Utiliz file

# Flow
------------------------------------------------------------------------------------------------------
First app run from app.java
In app.java class File,we create a constructor for appController model
call a Init method from app.java to appController file
In that Init Method we call a welcome method to welcome page
It display a "Welcome to java shopping"
After we set a navbar menu -->1.login and 2.Register
If user enter a 1 it go to login page suppose user enter a 2 it move to Register page otherwise it show invalid choice
In Login Method, we pass a email and password to a user model
In Register Method,we pass a email,username,password,confirmpassword to File using append method
After successfully register it again move navbar menu again it ask login and register
after login it move homemenu page
In home page it display 1.product 2.category 3.cart 4.orders 5.logout
1. it go to productController page it display a product details
2.It go to category page,show category name and enter a category id it show a matches product
3.Cart-->workinprogress
4.orders-->orkinprogress
5.it go to navbar menu

# Assessts
-------------------------
 * csv File

# OOPS Concept
-----------------------------
      Class
      Object
      Constructed
      Interface
      Abstraction --> Achieve using an Interface
      Exception --> throws and try-catch, Custom Exception
      File Handling -->  fileWriter, FileReader, 
  
   

# Defects
-----------------------------------------------------
How do create a arrayList obj
sometimes products cannot push to file
confuse to write a flow


# Faced Challenges 
---------------------------------------
  Exception --> NullPointerException, NumberFormatterException, ArrayIndexOutOfBoundsException, FileNotFoundException
  Object --> Null











