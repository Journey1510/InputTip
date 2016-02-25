package org.crazyit.inputtip.dao.impl;

import java.util.List;
import java.util.ArrayList;

import org.crazyit.inputtip.domain.*;
import org.crazyit.inputtip.dao.*;

import org.crazyit.common.dao.impl.*;

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
public class ModelDaoHibernate
	extends BaseDaoHibernate4<Model> implements ModelDao
{
	/**
	 * ����Ʒ�Ʋ�ѯ�ͺ�
	 * @param brand ��Ҫ��ѯ��Ʒ��
	 * @return ��Ʒ�ƶ�Ӧ��ȫ�����ͺ�
	 */
	public List<Model> findByBrand(String brand)
	{
		return find("select m from Model m where m.brand.name=?0" , brand);
	}

	/**
	 * �����ͺ�����ѯ�ͺ�
	 * @param model ��Ҫ��ѯ���ͺ���
	 * @return ���ͺ�����Ӧ���ͺ�
	 */
	public Model findByModel(String model)
	{
		List<Model> ml = (List<Model>)find("select m from Model m"
			+ " where m.name = ?0" , model);
		if (ml != null && ml.size() >= 0)
		{
			return ml.get(0);
		}
		return null;
	}
}
