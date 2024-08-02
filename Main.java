import java.util.HashMap;

// Допустимый формат ввода: Belyaev Sergey Igorevich 01.07.2024 79121112233 male
public class Main {
    public static void main(String[] args) {
        DataParse dataParse = new DataParse();
        String newFileName = null;
        WriteFile WriteFile = new WriteFile();

        HashMap<String, Object> data = dataParse.parseInputData();
        while (data.size() != 6) {
            try {
                throw new DateException();
            } catch (DateException e) {
                data = dataParse.parseInputData();
            }
        }

        newFileName = data.get("lastName") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str : data.keySet()) {
            sb.append(data.get(str));
            sb.append(" ");
        }


        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        WriteFile.writeData(String.valueOf(sb), filePath);
    }
}

