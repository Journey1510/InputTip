package org.crazyit.inputtip.dao.impl;

import java.util.List;
import java.util.ArrayList;

import org.crazyit.inputtip.domain.*;
import org.crazyit.inputtip.dao.*;

import org.crazyit.common.dao.impl.*;

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
public class ModelDaoHibernate
	extends BaseDaoHibernate4<Model> implements ModelDao
{
	/**
	 * 根据品牌查询型号
	 * @param brand 需要查询的品牌
	 * @return 该品牌对应的全部的型号
	 */
	public List<Model> findByBrand(String brand)
	{
		return find("select m from Model m where m.brand.name=?0" , brand);
	}

	/**
	 * 根据型号名查询型号
	 * @param model 需要查询的型号名
	 * @return 该型号名对应的型号
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
