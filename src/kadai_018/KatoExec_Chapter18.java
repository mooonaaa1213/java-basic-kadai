package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();
		
		Taro.setGivenName("太郎");
		Taro.commonIntroduce();
		Taro.eachIntroduce();
		System.out.println("");
		
		Ichiro.setGivenName("一郎");
		Ichiro.commonIntroduce();
		Ichiro.eachIntroduce();
		System.out.println("");
		
		Hanako.setGivenName("花子");
		Hanako.commonIntroduce();
		Hanako.eachIntroduce();
		System.out.println("");
		
		
	}

}
