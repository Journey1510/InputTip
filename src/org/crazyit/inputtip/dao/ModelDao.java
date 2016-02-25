package org.crazyit.inputtip.dao;

import java.util.List;

import org.crazyit.inputtip.domain.*;
import org.crazyit.common.dao.*;

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
public interface ModelDao extends BaseDao<Model>
{
	/**
	 * ����Ʒ�Ʋ�ѯ�ͺ�
	 * @param brand ��Ҫ��ѯ��Ʒ��
	 * @return ��Ʒ�ƶ�Ӧ��ȫ�����ͺ�
	 */
	List<Model> findByBrand(String brand);

	/**
	 * �����ͺŲ�ѯ�ͺ�
	 * @param model ��Ҫ��ѯ���ͺ�
	 * @return ���ͺŶ�Ӧ��ȫ�����ͺ�
	 */
	Model findByModel(String model);
}