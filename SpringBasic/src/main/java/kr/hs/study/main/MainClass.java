package kr.hs.study.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.hs.study.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		/* config.xml파일을 읽어서 메모리로 로딩하여 객체를 생성한 후 container 에 보관 */
		ClassPathXmlApplicationContext  ctx=
				new ClassPathXmlApplicationContext("kr/hs/study/config/config.xml");
		
		/* container에 있는 t1 빈 을 가지고 와서 t1에 넣음 */
		TestBean t1=(TestBean) ctx.getBean("t1");
		System.out.println("t1:"+t1);
		
		TestBean t2=ctx.getBean("t2",TestBean.class);
		System.out.println("t2:"+t2);
		
		TestBean t3=ctx.getBean("t2",TestBean.class);
		System.out.println("t3:"+t3);
		/* t2 빈을 가지고 와서 t2에 넣음 */
		/* container종료 */
		ctx.close();
		

	}

}
