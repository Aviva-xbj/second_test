package com.example.util;

//HttpUtil����ʹ�õ���HttpCallbackListener�ӿ����ص����񷵻صĽ���������Ҫ��util�����������ӿ�

public interface HttpCallbackListener {  //ʹ��Java�Ļص����ƣ����ȶ�����һ���ӿڣ�
	
	void onFinish(String response);  //onFinish����������ɹ���Ӧ���ǵ�������á�
	
	void onError(Exception e);       //onError��ʾ�������������ʱ����ִ�����е��á�

}
