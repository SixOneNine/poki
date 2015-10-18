package gdcc.maketubo.dao;


import java.util.List;


import gdcc.maketubo.dto.GameDto;
import gdcc.maketubo.dto.Record;

//openfileinput ,openfileoutput
//SQLite
//权限

/**
 * 数据持久层接口
 * 
 * @author maketubo
 *
 */
public interface Data {

	/**
	 *读取数据
	 */
	public List<Record> loadData();

	/**
	 * 存储数据
	 */
	public boolean  saveData(List<Record> recordList);

	
	
	public void setCompuDto(GameDto gameDto);
}
