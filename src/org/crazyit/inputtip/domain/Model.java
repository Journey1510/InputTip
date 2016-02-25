package org.crazyit.inputtip.domain;

import java.io.Serializable;

/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2014, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class Model implements Serializable
{
	// Model�ı�ʶ����
	private Integer id;
	// �ͺ���
	private String name;
	// �ͺ�����
	private String desc;
	// ���ͺ�������Ʒ��
	private Brand brand;


	// �޲����Ĺ�����
	public Model()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Model(Integer id , String name , String desc)
	{
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	// id��setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// desc��setter��getter����
	public void setDesc(String desc)
	{
		this.desc = desc;
	}
	public String getDesc()
	{
		return this.desc;
	}

	// brand��setter��getter����
	public void setBrand(Brand brand)
	{
		this.brand = brand;
	}
	public Brand getBrand()
	{
		return this.brand;
	}
}