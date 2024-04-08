package com.github.novel.manager;

import com.github.novel.constant.CacheConsts;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HomeBookCacheManager {

/*    @Cacheable(cacheManager = CacheConsts.CAFFEINE_CACHE_MANAGER
                , value = CacheConsts.HOME_BOOK_CACHE_NAME)
    public List<HomeBookRespDto> listHomeBooks(){






    }*/
}
