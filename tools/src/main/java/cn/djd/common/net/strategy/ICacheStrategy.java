package cn.djd.common.net.strategy;

import cn.djd.common.net.core.ApiCache;
import cn.djd.common.net.mode.CacheResult;
import rx.Observable;

/**
 * @Description: 缓存策略接口
 * @author: jeasinlee
 * @date: 16/12/31 14:21.
 */
public interface ICacheStrategy<T> {
    <T> Observable<CacheResult<T>> execute(ApiCache apiCache, String cacheKey, Observable<T> source, Class<T> clazz);
}
