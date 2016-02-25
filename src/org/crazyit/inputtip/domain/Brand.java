package org.crazyit.inputtip.domain;

import java.io.Serializable;
import java.util.*;

/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Brand implements Serializable
{
	private Integer id;
	// 品牌名
	private String name;
	// 该品牌对应的全部型号
	private Set<Model> models
		= new HashSet<>();

	// 无参数的构造器
	public Brand()
	{
	}
	// 初始化全部成员变量的构造器
	public Brand(Integer id , String name , Set<Model> models)
	{
		this.id = id;
		this.name = name;
		this.models = models;
	}

	// id的setter和getter方法
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// models的setter和getter方法
	public void setModels(Set<Model> models)
	{
		this.models = models;
	}
	public Set<Model> getModels()
	{
		return this.models;
	}

}