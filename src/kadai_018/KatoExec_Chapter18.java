package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();
		
		
		Taro.setGivenName("太郎");
		Taro.exeIntroduce();
		
		Ichiro.setGivenName("一郎");
		Ichiro.exeIntroduce();
		
		Hanako.setGivenName("花子");
		Hanako.exeIntroduce();
		
		
	}

}
