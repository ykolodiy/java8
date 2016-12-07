package js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		
		ScriptEngineManager manager = new ScriptEngineManager ();
		
		
		ScriptEngine engine = manager.getEngineByName("nashorn");
		
		
		String script = "var welcome='hello'; "
				+ "welcome+=', yuriy';"
				+ "welcome;";
		
		
		Object result = engine.eval(script);
		
		
		System.out.println(result);
				
		
	}

}
