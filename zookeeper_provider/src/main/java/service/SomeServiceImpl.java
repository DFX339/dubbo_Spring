package service;

public class SomeServiceImpl implements ISomeService
{

	@Override
	public String something() {
		System.out.println("或许这就是dubbo吧");
		return "服务者的执方法返回值！！！SomeServiceImpl...";
	}

}
