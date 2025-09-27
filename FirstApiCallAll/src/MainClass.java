
public class MainClass {

	public static void main(String[] args) {
		String url = "https://reqres.in/api/users/";
		
		
		try {
			
			HttpHandler handler = new HttpHandler();
			int length = handler.getLength(url);
			
			for (int i=0; i<length; i++) {
				String myResponse = handler.getResponse(url, i);
				System.out.println("Name: " + myResponse);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

