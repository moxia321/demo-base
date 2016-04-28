package com.bx.base.domain.dao;

/**
 * 关系对象映射接口
 */
public interface Mapper<T> {
	
	/**
	 * 新增数据，仅保存有数据的字段
	 *
	 * @param record
	 */
	int insertSelective(T record);

	/**
	 * 根据主键删除数据
	 *
	 * @param id
	 */
	int deleteByPrimaryKey(Integer id);
	
	/**
	 * 根据主键更新数据，仅更新有数据的字段
	 *
	 * @param record
	 */
	int updateByPrimaryKeySelective(T record);

	/**
	 * 根据主键查询数据
	 *
	 * @param id
	 * @return
	 */
	T getInfoByPrimaryKey(Integer id);
}
