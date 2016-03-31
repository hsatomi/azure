import java.util.Random;
class Test{
	
	public static void main(String[] args){
		//コマンドプロンプトに"Java Test"と表示します
		out("JavaTest");
		
		out(args.length);
		
		if(args.length > 0){
			out(args[0]);
		}
		
		
//		Random rnd = new Random();
//		
//		int max=100;
//		int limite=25;
//		int cnt_sum=1000000;
//		int cnt=0;
//		
//		for(int i=0;i<cnt_sum;i++){
//			int a = rnd.nextInt(max);
//			
//			if(a<limite){
//				cnt++;
//			}
//		}
//		
//		double late=(double)cnt/(double)cnt_sum;
//		out(late);
//		
//		try{
//			Process proc;
//			Runtime rt = Runtime.getRuntime();
//			proc = rt.exec("C:\\tools\\df141\\DFe.exe");
//			
//			out(proc);
//			
//		}catch(Exception e){
//			out("error=" + e.getMessage());
//		}
		
		
	}
	
	
//	private static void out(int str){
//		out(String.valueOf(str));
//	}
//
//	private static void out(String str){
//		System.out.println(str);
//	}
	
	private static void out(Object str){
		System.out.println(str);
	}
	
}