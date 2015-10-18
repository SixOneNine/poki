package gdcc.maketubo.dao;


import java.util.List;

import gdcc.maketubo.dto.GameDto;
import gdcc.maketubo.dto.Record;



public class DataBase implements Data{
	private String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	
	private static String dbUrl="jdbc:sqlserver://127.0.0.1:1433;database=compu";
		
	private static String LOAD_SQL="SELECT name,rule_num,rule_text FROM Compu WHERE name = 'default' ORDER BY rule_num";
		
	private static String SAVE_SQL="INSERT INTO Compu(name,rule_num,rule_text) VALUES(?,?,?)";	
	
	public DataBase(){		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Record> loadData() {
		return null;
	}
 
	@Override
	public boolean saveData(List<Record> RecordList) {
		
		return false;
		
	}
   
	@Override
	public void setCompuDto(GameDto gameDto) {
		// TODO Auto-generated method stub
		
	}

			
	
	
}
