import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class HttpHandler {

	public String getResponse(String url) throws Exception {
		Unirest.setTimeouts(0, 0);
		HttpResponse<String> response = Unirest.get(url).asString();
		String data = response.getBody();
		
		return data;
	}

}
