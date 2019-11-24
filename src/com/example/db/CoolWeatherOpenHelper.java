package com.example.db; //声明包名

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {   //CoolWeatherOpenHelper继承自：SQLiteOpenHelper
	
	//构造函数（同名CoolWeatherOpenHelper）
	public CoolWeatherOpenHelper(Context context, String name,
			CursorFactory factory, int version) {
		super(context, name, factory, version); //调用父类同名方法(context为上下文，name为数据库的名字，factory为游标工厂，version为数据库的版本)
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 省市县需要三张表：省，市，县，建表语句如下
	 * 将三条建表语句定义成常量，然后在onCreate()方法中去执行.
	 * 这三个成员常量，创建名称全大写，字符串型（只编写一次，之后不再修改），每一个都封装了一个sql属性
	 */
	
	/**
	 * Province表建表数据
	 */
	public static final String CREATE_PROVINCE = "creat table Province ("
			+ "id integer primary key autoincrement, "
			+ "province_name text, "
			+ "province_code text)";
	
	/**
	 * City表建表数据
	 */
	public static final String CREATE_CITY = "creat table City ("
			+ "id integer primary key autoincrement, "
			+ "city_name text, "
			+ "city_code text, "
			+ "province_id integer)";
	
	/**
	 * County表建表数据
	 */
	public static final String CREATE_COUNTY = "creat table County ("
			+ "id integer primary key autoincrement, "
			+ "county_name text, "
			+ "county_code text, "
			+ "city_id integer)";
	
	@Override
	public void onCreate(SQLiteDatabase db){ //创建数据库,初始化操作（注：execSQL表示执行一个sql语句）
		db.execSQL(CREATE_PROVINCE); //创建Province表
		db.execSQL(CREATE_CITY);  //创建City表
		db.execSQL(CREATE_COUNTY); //创建County表
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){ //数据库中途的更新修改
		
	}
	
	

}
