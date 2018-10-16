import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;

import java.io.*;
public class Loader  {
    public Movies[] LoadJson(){
        Movies[] movies=null;
        try{
            Gson gson = new Gson();
            File plik = new File("lista/tmp.json");
            BufferedReader czytaj = new BufferedReader(new FileReader(plik));
            String linia;
            StringBuilder stringBuilder = new StringBuilder();
            String enter = System.getProperty("line.separator");
            while ((linia = czytaj.readLine()) != null) {
                stringBuilder.append(linia);
                stringBuilder.append(enter);
            }

            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            czytaj.close();

            String content = stringBuilder.toString();
            movies = gson.fromJson(content, Movies[].class);


        return movies;
    }catch (Exception e){
        e.printStackTrace();
    }
        return movies;

    }

    public Movies[] LoadXML(){
        Movies[] movies=null;

        try {
            File file = new File("lista/dane.xml");
            XmlMapper xmlMapper = new XmlMapper();

            StringBuilder sb = new StringBuilder();
            String line;
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            br.close();
            sb.toString();

            String xml = sb.toString();
            movies = xmlMapper.readValue(xml, Movies[].class);
            return movies;
        }catch (Exception e){
            e.printStackTrace();
        }
        return movies;

    }


    }
