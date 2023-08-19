import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

//todo - in this class create two methods that can handle file copying
// 1.first method must include src file and from it your method will have to
// create another duplicate file. Then name of duplicate file should be like
// notes.txt => notes(1).txt
// 2.second method must include as an input two parameters , scr file and
// destination file. This method will reads from src file and writes to
// destination file.
// 3.For the class involve logger to log method operation details.
// When your methods throws an exception log error message to the console
// When copy file successfully finishes log info about it.
public class Streams {

    Logger logger =Logger.getLogger(Streams.class.getName());
        public void  copyFile(String s , String l){

        BufferedWriter writer=null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(s))){
//            URL url = new URL(s);
             writer = new BufferedWriter(new FileWriter(l));
            String line;
            while ((line=bufferedReader.readLine())!=null){
                writer.write(line);
            }



        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
            logger.info("file not fond "+e);
        } catch (FileNotFoundException e) {
            logger.info("file not fond "+e);
        } catch (IOException e) {
            logger.info("file not fond "+e);
        }
        finally {

            try {
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }






}
