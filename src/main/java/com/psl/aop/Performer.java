package com.psl.aop;

import org.springframework.aop.ThrowsAdvice;

public class Performer {

	public void getUp(){			//join point
		System.out.println("Perfromer gets up");
	}
	
	public void eatsBreakfast(){			//join point
		System.out.println("Performer eats breakfast");
	}
	
	public void addressesAudience(){			//join point
		System.out.println("Performer addresses audience");
	}
	
	public void perform() throws Exception{				//point cut
		System.out.println("Performer singing a song.....");
	//	throw new Exception("Raining");
	}
	
	public void giveThanks(){			//join point
		System.out.println("Performer gives Thanks");
	}
}