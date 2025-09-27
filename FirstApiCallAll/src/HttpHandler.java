import org.json.*;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class HttpHandler {
	
	public String getResponse(String url, int i) throws Exception {
		Unirest.setTimeouts(0, 0);
		HttpResponse<String> response = Unirest.get(url).asString();
		String data = response.getBody();
		
		JSONObject json = new JSONObject(data);
		JSONArray people = json.getJSONArray("data");
		JSONObject person = (JSONObject)people.get(i);
		
		String fullname = 
				person.getString("first_name")
				+ " " +
				person.getString("last_name");
		
		return fullname;
		
	}

	public int getLength(String url) throws Exception {
		String total = "0";
		
		Unirest.setTimeouts(0, 0);
		HttpResponse<String> response = Unirest.get(url).asString();
		String data = response.getBody();
		
		JSONObject json = new JSONObject(data);
		total = json.get("per_page").toString();
		System.out.println("Length: " + total);
		
		return Integer.parseInt(total);
	}
}
