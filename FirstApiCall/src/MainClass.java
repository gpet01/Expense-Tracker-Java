import org.json.*;

public class MainClass {

	public static void main(String[] args) {
		String url = "https://reqres.in/api/users/2";
		
		try {
			HttpHandler handler = new HttpHandler();
			String myResponse = handler.getResponse(url);
			//System.out.println(myResponse);
			
			JSONObject json = new JSONObject(myResponse);
			String fullname = "The name is " +
					json.getJSONObject("data").getString("first_name")
					+ " " +
					json.getJSONObject("data").getString("last_name");
			System.out.println(fullname);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
