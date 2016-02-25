package org.crazyit.inputtip.service;

import org.crazyit.inputtip.dao.*;
import org.crazyit.inputtip.domain.*;

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
public interface TipService
{
	/**
	 * ����Ʒ��ǰ׺����������Ʒ�Ƶ�Ʒ����
	 * @param prefix Ʒ��ǰ׺
	 * @return ��Ʒ��ǰ׺��Ӧ������Ʒ����
	 */
	public List<String> getBrandsByPrefix(String prefix);

	/**
	 * ����Ʒ�������ظ�Ʒ���µ��ͺ���
	 * @param brand Ʒ����
	 * @return ��Ʒ�ƶ�Ӧ��ȫ���ͺ���
	 */
	public List<String> getModelsByBrand(String brand);

	/**
	 * ����ģ���������ظ�ģ�͵�����
	 * @param model ģ����
	 * @return ��ģ������Ӧ��ģ������
	 */
	public String getDescByModel(String model);
}