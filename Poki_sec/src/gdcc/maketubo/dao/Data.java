package gdcc.maketubo.dao;


import java.util.List;


import gdcc.maketubo.dto.GameDto;
import gdcc.maketubo.dto.Record;

//openfileinput ,openfileoutput
//SQLite
//Ȩ��

/**
 * ���ݳ־ò�ӿ�
 * 
 * @author maketubo
 *
 */
public interface Data {

	/**
	 *��ȡ����
	 */
	public List<Record> loadData();

	/**
	 * �洢����
	 */
	public boolean  saveData(List<Record> recordList);

	
	
	public void setCompuDto(GameDto gameDto);
}
