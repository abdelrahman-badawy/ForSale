# ForSale
To Run the code:
  Import project from github into Eclipse
  In file (ForSale\src\main\resources\config\config.properties) update appiumServerLink with your appium server link
   (my configuration is: appiumServerLink=http://127.0.0.1:4723/wd/hub)
   
   Infile (ForSale\testng.xml) update value of deviceName with your dvice name that you will use while executing the code.
    (my configuration is:  <parameter name="deviceName" value="Redmi 9"></parameter>)
    
    connect Mobile device
    Run appium server
    Run testng.xml file as TestNG Suite
![image](https://user-images.githubusercontent.com/53237179/210183242-cb8fbaf1-2792-4e30-8a59-05b88c2030c3.png)
