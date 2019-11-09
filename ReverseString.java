class ReverseString{
	public static void main(String[] args) {
		String str = "PreetiKant";

		//create a byte array
		byte[] strAsByteArray = str.getBytes();
		byte[] result = new byte[strAsByteArray.length];

		//store result in reverse order into the result byte[]
		for (int i=0;i<strAsByteArray.length ;i++ ) {
			result[i] = strAsByteArray[strAsByteArray.length-i-1];
			
		}
		System.out.println(new String(result));
	}
}