package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class CSV
{

    // this method reads data from csv file and returns list
    public static List<String[]> read(String file)

    {
        List<String[]> data=new LinkedList<String[]>();
        String datarow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((datarow=br.readLine())!=null)
            {

                String[] dataRecords = datarow.split(",");
                data.add(dataRecords);
            }

        }
        catch(FileNotFoundException e)
        {
            System.out.println("Could not find file");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            System.out.println("Could not read file");
            e.printStackTrace();
        }
        return data;
    }

}
