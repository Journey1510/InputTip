package org.crazyit.inputtip.dao;

import java.util.List;

import org.crazyit.inputtip.domain.*;
import org.crazyit.common.dao.*;

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
public interface ModelDao extends BaseDao<Model>
{
	/**
	 * 根据品牌查询型号
	 * @param brand 需要查询的品牌
	 * @return 该品牌对应的全部的型号
	 */
	List<Model> findByBrand(String brand);

	/**
	 * 根据型号查询型号
	 * @param model 需要查询的型号
	 * @return 该型号对应的全部的型号
	 */
	Model findByModel(String model);
}