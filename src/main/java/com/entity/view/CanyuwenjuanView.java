package com.entity.view;

import com.entity.CanyuwenjuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 参与问卷
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-07 14:28:21
 */
@TableName("canyuwenjuan")
public class CanyuwenjuanView  extends CanyuwenjuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CanyuwenjuanView(){
	}
 
 	public CanyuwenjuanView(CanyuwenjuanEntity canyuwenjuanEntity){
 	try {
			BeanUtils.copyProperties(this, canyuwenjuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
