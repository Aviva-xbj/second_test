package com.example.util;

//HttpUtil类中使用到了HttpCallbackListener接口来回调服务返回的结果，因此需要在util包下添加这个接口

public interface HttpCallbackListener {  //使用Java的回调机制，首先定义了一个接口：
	
	void onFinish(String response);  //onFinish代表服务器成功响应我们的请求调用。
	
	void onError(Exception e);       //onError表示进行网络操作的时候出现错误进行调用。

}
