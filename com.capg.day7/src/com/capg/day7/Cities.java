package com.capg.day7;

public class Cities {

	
		int num;
		String name,code,state;
		
		 Cities(int num,String name,String code,String state)
		{
		 this.num=num;
		 this.name=name;
		 this.code=code;
		 this.state=state;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
        public void print()
        {
        	System.out.println(getNum());
        	System.out.println(getName());
        	System.out.println(getCode());
        	System.out.println(getState());
        }		 
        
}
