package te.Abstraction;

import java.util.ArrayList;
import java.util.List;

public class ListGV extends CrollHeight{

	public void getListGV() {
		List<String> gv = new ArrayList<String>();
		gv.add("a");
		gv.add("b");
		gv.add("a");
		gv.add("b");
		gv.add("a");
		gv.add("b");
		this.setCrollHeight(gv.size());
	}
    
}
