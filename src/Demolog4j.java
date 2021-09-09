
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Demolog4j {

public static void main(String[] args) {
Logger myLogger = Logger.getLogger(Demolog4j.class.getName());
PropertyConfigurator.configure("resources/log4j.properties");
int a =-1;
boolean flag=false;
myLogger.info("Logging information for Demolog4j");
myLogger.info("Code debugging started");
if(a<0) {
myLogger.info("This is last time warning");
}
if(flag==false) {
myLogger.info("Error occured due to false value");
}

}

}