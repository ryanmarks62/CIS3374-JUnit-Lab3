package com.lab3.runnable;

import com.lab3.admiterator.Parameters;
import com.lab3.admiterator.Test;
import com.lab3.admiterator.Type;

@RunWith(JUnitParamsRunner.class);
public class runnableTest {

		@Test
		@Parameters(method="method_for_params")
		
		public void name_of_test(Type parameter1,Type param2){
			
		}
		
		private Object method_for_params() {return new Object[][]
				{{arg1_for_run1,arg2_for_run1,{arg1_for_run2,arg2_for_run2}},
		}
}
