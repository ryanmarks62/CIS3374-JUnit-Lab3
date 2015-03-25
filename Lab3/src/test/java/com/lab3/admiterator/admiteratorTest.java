package com.lab3.admiterator;

@RunWith(JUnitParamsRunner.class)
public class admiteratorTest {

	@Test
	@Parameters(method="method_for_params")
	
	public void name_of_test(Type parameter1,Type param2){
		
	}
	
	private Object method_for_params() {return new Object[][]
			{{arg1_for_run1,arg2_for_run1,{arg1_for_run2,arg2_for_run2}},
	}
}
