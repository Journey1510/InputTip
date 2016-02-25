package org.crazyit.inputtip.domain;

import java.io.Serializable;
import java.util.*;

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
public class Brand implements Serializable
{
	private Integer id;
	// Ʒ����
	private String name;
	// ��Ʒ�ƶ�Ӧ��ȫ���ͺ�
	private Set<Model> models
		= new HashSet<>();

	// �޲����Ĺ�����
	public Brand()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Brand(Integer id , String name , Set<Model> models)
	{
		this.id = id;
		this.name = name;
		this.models = models;
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

	// models��setter��getter����
	public void setModels(Set<Model> models)
	{
		this.models = models;
	}
	public Set<Model> getModels()
	{
		return this.models;
	}

}