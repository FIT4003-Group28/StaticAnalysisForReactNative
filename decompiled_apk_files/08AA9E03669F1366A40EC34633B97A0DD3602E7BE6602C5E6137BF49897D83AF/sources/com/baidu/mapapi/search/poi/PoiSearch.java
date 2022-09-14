package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.mapapi.model.inner.Point;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.g;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class PoiSearch extends g {

    /* renamed from: a  reason: collision with root package name */
    private com.baidu.platform.comapi.search.d f1860a;
    private boolean f;

    /* renamed from: b  reason: collision with root package name */
    private OnGetPoiSearchResultListener f1861b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1862c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f1863d = 0;
    private int e = 0;
    private int g = 0;

    /* loaded from: classes.dex */
    private class a implements com.baidu.platform.comapi.search.b {
        private a() {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(int i) {
            if (PoiSearch.this.f1862c || PoiSearch.this.f1861b == null) {
                return;
            }
            SearchResult.ERRORNO errorno = null;
            if (i == 2) {
                errorno = SearchResult.ERRORNO.NETWORK_ERROR;
            } else if (i == 8) {
                errorno = SearchResult.ERRORNO.NETWORK_TIME_OUT;
            } else if (i == 11) {
                errorno = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } else if (i == 107) {
                errorno = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
            } else if (i != 500) {
                switch (i) {
                    case 601:
                        errorno = SearchResult.ERRORNO.POIINDOOR_BID_ERROR;
                        break;
                    case 602:
                        errorno = SearchResult.ERRORNO.POIINDOOR_FLOOR_ERROR;
                        break;
                    case 603:
                        errorno = SearchResult.ERRORNO.POIINDOOR_SERVER_ERROR;
                        break;
                }
            } else {
                errorno = SearchResult.ERRORNO.KEY_ERROR;
            }
            if (errorno == null) {
                return;
            }
            if (PoiSearch.this.e == 4) {
                PoiSearch.this.f1861b.onGetPoiDetailResult(new PoiDetailResult(errorno));
            } else if (PoiSearch.this.e == 5) {
                PoiSearch.this.f1861b.onGetPoiIndoorResult(new PoiIndoorResult(errorno));
            } else {
                PoiSearch.this.f1861b.onGetPoiResult(new PoiResult(errorno));
            }
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(String str) {
            if (PoiSearch.this.f1862c || str == null || str.length() <= 0 || PoiSearch.this.f1861b == null) {
                return;
            }
            PoiSearch.this.f1861b.onGetPoiResult(d.a(str, PoiSearch.this.g, PoiSearch.this.f1860a.b()));
        }

        @Override // com.baidu.platform.comapi.search.b
        public void b(String str) {
            if (str == null || str.length() <= 0 || PoiSearch.this.f1861b == null) {
                return;
            }
            PoiSearch.this.f1861b.onGetPoiResult(d.a(str));
        }

        @Override // com.baidu.platform.comapi.search.b
        public void c(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void d(String str) {
            OnGetPoiSearchResultListener onGetPoiSearchResultListener;
            if (PoiSearch.this.f1862c || str == null || str.length() <= 0 || PoiSearch.this.f1861b == null) {
                return;
            }
            PoiDetailResult poiDetailResult = new PoiDetailResult();
            if (poiDetailResult.a(str)) {
                onGetPoiSearchResultListener = PoiSearch.this.f1861b;
            } else {
                onGetPoiSearchResultListener = PoiSearch.this.f1861b;
                poiDetailResult = new PoiDetailResult(SearchResult.ERRORNO.RESULT_NOT_FOUND);
            }
            onGetPoiSearchResultListener.onGetPoiDetailResult(poiDetailResult);
        }

        @Override // com.baidu.platform.comapi.search.b
        public void e(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void f(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void g(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void h(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void i(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void j(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void k(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void l(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void m(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void n(String str) {
            if (PoiSearch.this.f1862c || str == null || str.length() <= 0 || PoiSearch.this.f1861b == null) {
                return;
            }
            PoiSearch.this.f1861b.onGetPoiIndoorResult(d.b(str));
        }
    }

    PoiSearch() {
        this.f1860a = null;
        this.f1860a = new com.baidu.platform.comapi.search.d();
        this.f1860a.a(new a());
    }

    public static PoiSearch newInstance() {
        BMapManager.init();
        return new PoiSearch();
    }

    public void destroy() {
        if (this.f1862c) {
            return;
        }
        this.f1862c = true;
        this.f1861b = null;
        this.f1860a.a();
        this.f1860a = null;
        BMapManager.destroy();
    }

    public boolean searchInBound(PoiBoundSearchOption poiBoundSearchOption) {
        if (this.f1860a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (poiBoundSearchOption == null || poiBoundSearchOption.f1831a == null || poiBoundSearchOption.f1832b == null) {
            throw new IllegalArgumentException("option or bound or keyworld can not be null");
        }
        this.f1863d = this.e;
        this.e = 2;
        this.g = poiBoundSearchOption.f1834d;
        this.f1860a.a(poiBoundSearchOption.e);
        MapBound mapBound = new MapBound();
        mapBound.setPtRT(CoordUtil.ll2point(poiBoundSearchOption.f1831a.northeast));
        mapBound.setPtLB(CoordUtil.ll2point(poiBoundSearchOption.f1831a.southwest));
        return this.f1860a.a(poiBoundSearchOption.f1832b, 1, poiBoundSearchOption.f1834d, mapBound, (int) poiBoundSearchOption.f1833c, (Point) null, (Map<String, Object>) null);
    }

    public boolean searchInCity(PoiCitySearchOption poiCitySearchOption) {
        if (this.f1860a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (poiCitySearchOption == null || poiCitySearchOption.f1835a == null || poiCitySearchOption.f1836b == null) {
            throw new IllegalArgumentException("option or city or keyworld can not be null");
        }
        this.f1863d = this.e;
        this.e = 1;
        this.g = poiCitySearchOption.e;
        this.f1860a.a(poiCitySearchOption.f);
        return this.f1860a.a(poiCitySearchOption.f1836b, poiCitySearchOption.f1835a, poiCitySearchOption.e, (MapBound) null, (int) poiCitySearchOption.f1837c, (Map<String, Object>) null);
    }

    public boolean searchNearby(PoiNearbySearchOption poiNearbySearchOption) {
        if (this.f1860a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (poiNearbySearchOption == null || poiNearbySearchOption.f1853b == null || poiNearbySearchOption.f1852a == null) {
            throw new IllegalArgumentException("option or location or keyworld can not be null");
        }
        if (poiNearbySearchOption.f1854c <= 0) {
            return false;
        }
        this.f1863d = this.e;
        this.e = 3;
        this.g = poiNearbySearchOption.e;
        this.f1860a.a(poiNearbySearchOption.f);
        Point ll2point = CoordUtil.ll2point(poiNearbySearchOption.f1853b);
        Point point = new Point(ll2point.x - poiNearbySearchOption.f1854c, ll2point.y - poiNearbySearchOption.f1854c);
        Point point2 = new Point(ll2point.x + poiNearbySearchOption.f1854c, ll2point.y + poiNearbySearchOption.f1854c);
        MapBound mapBound = new MapBound();
        mapBound.setPtLB(point);
        mapBound.setPtRT(point2);
        HashMap hashMap = new HashMap();
        hashMap.put("distance", Integer.valueOf(poiNearbySearchOption.f1854c));
        return this.f1860a.a(poiNearbySearchOption.f1852a, 1, poiNearbySearchOption.e, (int) poiNearbySearchOption.f1855d, mapBound, mapBound, hashMap, poiNearbySearchOption.g.ordinal());
    }

    public boolean searchPoiDetail(PoiDetailSearchOption poiDetailSearchOption) {
        if (this.f1860a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (poiDetailSearchOption == null || poiDetailSearchOption.f1843a == null) {
            throw new IllegalArgumentException("option or uid can not be null");
        }
        this.f1863d = this.e;
        this.e = 4;
        this.f = poiDetailSearchOption.f1844b;
        return this.f1860a.a(poiDetailSearchOption.f1843a);
    }

    public boolean searchPoiIndoor(PoiIndoorOption poiIndoorOption) {
        if (this.f1860a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (poiIndoorOption == null || poiIndoorOption.f1845a == null || poiIndoorOption.f1846b == null) {
            throw new IllegalArgumentException("option or indoor bid or keyword can not be null");
        }
        this.f1863d = this.e;
        this.e = 5;
        return this.f1860a.a(poiIndoorOption.f1845a, poiIndoorOption.f1846b, poiIndoorOption.f1848d, poiIndoorOption.e, poiIndoorOption.f1847c);
    }

    public void setOnGetPoiSearchResultListener(OnGetPoiSearchResultListener onGetPoiSearchResultListener) {
        this.f1861b = onGetPoiSearchResultListener;
    }
}
