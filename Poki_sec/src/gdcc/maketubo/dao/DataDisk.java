package gdcc.maketubo.dao;


import gdcc.maketubo.dto.Record;




import java.util.List;

import gdcc.maketubo.dto.GameDto;
import gdcc.maketubo.dto.Record;


public class DataDisk implements Data{
	private final String filePath="save/record.dat";

	
	public DataDisk (){}


	@Override
	public List<Record> loadData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCompuDto(gdcc.maketubo.dto.GameDto gameDto) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean saveData(List<Record> recordList) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
}
