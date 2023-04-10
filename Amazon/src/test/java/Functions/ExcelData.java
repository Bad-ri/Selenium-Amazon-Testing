package Functions;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelData {
    public FileInputStream fs ;
    public XSSFWorkbook wb ;
    public XSSFSheet sh ;
    public void ReadValidData() throws IOException {
        String FilePath = System.getProperty("user.dir")+"\\src\\main\\resources\\Data\\Data.xlsx";
        fs = new FileInputStream(FilePath);
        wb = new XSSFWorkbook(fs);
        sh = wb.getSheetAt(0);
    }
    public String GetValidName(){
        return String.valueOf(sh.getRow(0).getCell(1));
    }
    public String GetValidEmail(){
        return String.valueOf(sh.getRow(1).getCell(1));
    }
    public String GetInValidEmail(){
        return String.valueOf(sh.getRow(1).getCell(3));
    }
    public String GetValidPassword(){
        return String.valueOf(sh.getRow(2).getCell(1));
    }
    public String GetValidSearch(){
        return String.valueOf(sh.getRow(3).getCell(1));
    }

}
