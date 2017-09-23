package com.nashwork.commomutils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @Project :boot-demo
 * @Author : kewei@nash.work
 * @Date : 2017-09-23 下午1:58 星期六
 * @Version : v1.0
 **/
public final class BeanConvertUtil {

    /**
     * 存储线程当前正执行转换的原始对象
     */
    private static ThreadLocal<Object> origThreadLocal = new ThreadLocal<>();


    /**
     * 获取当前转换中的源对象
     * @param <R> 根据调用代码推断返回类型
     */
    public static <R> R getCurrentConvertOrigObject() {
        return (R) origThreadLocal.get();
    }

    /**
     * 转换 origObjList 中的对象到 destClass 对象实例集合
     *
     * 工具会自动创建 List<T> 集合类
     * 工具会通过 newInstance 创建 destClass 实例, 因此需要有无参构造方法
     *
     * @param destClass 目标对象类型
     * @param origObjList 源对象
     * @param ignoreProperties 希望忽略的属性列表
     * @param <T> 目标对象类型
     * @return 目标对象实例集合, 如果 origObjList == null , 则返回 null
     */
    public static <T> List<T> convert(Class<T> destClass, List<?> origObjList, String... ignoreProperties) {
        if (origObjList == null) return null;

        List<T> destObjList = new ArrayList<>();
        origObjList.forEach(
                origObj -> destObjList.add(convert(destClass, origObj, ignoreProperties)));

        return destObjList;
    }

    /**
     * 转换 origObj 对象到 destClass 对象实例
     * 工具会通过 newInstance 创建 destClass 实例, 因此需要有无参构造方法
     *
     * @param destClass 目标对象类型
     * @param origObj 源对象
     * @param ignoreProperties 希望忽略的属性列表
     * @param <T> 目标对象类型
     * @return 目标对象实例, 如果 origObj == null , 则返回 null
     */
    public static <T> T convert(Class<T> destClass, Object origObj, String... ignoreProperties) {
        if (origObj == null) return null;

        T destObj = null;
        try {
            destObj = destClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(destClass.getName() + "没有无参构造方法, 创建实例失败");
        }
        return convert(destObj, origObj, ignoreProperties);
    }

    /**
     * 转换 origObj 对象到 destObj
     *
     * @param destObj 目标对象
     * @param origObj 源对象
     * @param ignoreProperties 希望忽略的属性列表
     * @param <T> 目标对象类型
     * @return destObj原对象返回
     */
    public static <T> T convert(T destObj, Object origObj, String... ignoreProperties) {

     /*
        try {
            origThreadLocal.set(origObj);
            // 默认转换
            hackBeanUtilsBean.copyProperties(destObj, origObj, ignoreProperties);

            // 定制转换
            IBeanConvert ibc = getCustomBeanConvert(destObj.getClass(), origObj.getClass());
            if(ibc != null) {
                ibc.convert(destObj, origObj);
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(
                    origObj.getClass().getName() + " to " + destObj.getClass().getName() + "转换异常");
        }
        */
        return destObj;
    }

}
