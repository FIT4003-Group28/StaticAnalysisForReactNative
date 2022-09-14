package com.baidu.mapapi.search.share;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.Point;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.g;
import com.baidu.mapapi.search.share.RouteShareURLOption;
import com.baidu.platform.comapi.search.d;
/* loaded from: classes.dex */
public class ShareUrlSearch extends g {

    /* renamed from: a  reason: collision with root package name */
    private d f1932a;

    /* renamed from: b  reason: collision with root package name */
    private OnGetShareUrlResultListener f1933b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1934c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f1935d = 0;
    private int e = 0;

    /* loaded from: classes.dex */
    private class a implements com.baidu.platform.comapi.search.b {
        private a() {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(int i) {
            if (ShareUrlSearch.this.f1934c || ShareUrlSearch.this.f1933b == null) {
                return;
            }
            SearchResult.ERRORNO errorno = null;
            if (i != 8) {
                if (i != 11) {
                    if (i == 107) {
                        errorno = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
                    } else if (i != 500) {
                        switch (i) {
                            case 2:
                                errorno = SearchResult.ERRORNO.NETWORK_ERROR;
                                break;
                        }
                    } else {
                        errorno = SearchResult.ERRORNO.KEY_ERROR;
                    }
                }
                errorno = SearchResult.ERRORNO.RESULT_NOT_FOUND;
            } else {
                errorno = SearchResult.ERRORNO.NETWORK_TIME_OUT;
            }
            if (errorno == null) {
                return;
            }
            switch (ShareUrlSearch.this.e) {
                case 1:
                    ShareUrlSearch.this.f1933b.onGetPoiDetailShareUrlResult(new ShareUrlResult(errorno));
                    return;
                case 2:
                    ShareUrlSearch.this.f1933b.onGetLocationShareUrlResult(new ShareUrlResult(errorno));
                    return;
                case 3:
                    ShareUrlSearch.this.f1933b.onGetRouteShareUrlResult(new ShareUrlResult(errorno));
                    return;
                default:
                    return;
            }
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void b(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void c(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void d(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void e(String str) {
            if (ShareUrlSearch.this.f1934c || ShareUrlSearch.this.f1933b == null) {
                return;
            }
            switch (ShareUrlSearch.this.e) {
                case 1:
                    ShareUrlSearch.this.f1933b.onGetPoiDetailShareUrlResult(b.a(str));
                    return;
                case 2:
                    ShareUrlSearch.this.f1933b.onGetLocationShareUrlResult(b.a(str));
                    return;
                case 3:
                    ShareUrlSearch.this.f1933b.onGetRouteShareUrlResult(b.a(str));
                    return;
                default:
                    return;
            }
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
        }
    }

    ShareUrlSearch() {
        this.f1932a = null;
        this.f1932a = new d();
        this.f1932a.a(new a());
    }

    private boolean a(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private int b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static ShareUrlSearch newInstance() {
        BMapManager.init();
        return new ShareUrlSearch();
    }

    public void destroy() {
        if (this.f1934c) {
            return;
        }
        this.f1934c = true;
        this.f1933b = null;
        this.f1932a.a();
        this.f1932a = null;
        BMapManager.destroy();
    }

    public boolean requestLocationShareUrl(LocationShareURLOption locationShareURLOption) {
        if (this.f1932a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (locationShareURLOption == null || locationShareURLOption.f1920a == null || locationShareURLOption.f1921b == null || locationShareURLOption.f1922c == null) {
            throw new IllegalArgumentException("option or name or snippet  can not be null");
        }
        this.f1935d = this.e;
        this.e = 2;
        return this.f1932a.a(CoordUtil.ll2point(locationShareURLOption.f1920a), locationShareURLOption.f1921b, locationShareURLOption.f1922c);
    }

    public boolean requestPoiDetailShareUrl(PoiDetailShareURLOption poiDetailShareURLOption) {
        if (this.f1932a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (poiDetailShareURLOption == null || poiDetailShareURLOption.f1923a == null) {
            throw new IllegalArgumentException("option or uid can not be null");
        }
        this.f1935d = this.e;
        this.e = 1;
        return this.f1932a.b(poiDetailShareURLOption.f1923a);
    }

    public boolean requestRouteShareUrl(RouteShareURLOption routeShareURLOption) {
        d dVar;
        Point ll2point;
        Point ll2point2;
        String name;
        String name2;
        int b2;
        int b3;
        int ordinal;
        int i;
        int i2;
        if (this.f1932a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (routeShareURLOption == null) {
            throw new IllegalStateException("option is null");
        }
        if (routeShareURLOption.getmMode().ordinal() < 0) {
            return false;
        }
        if (routeShareURLOption.f1924a == null || routeShareURLOption.f1925b == null) {
            throw new IllegalArgumentException("start or end point can not be null");
        }
        this.f1935d = this.e;
        this.e = 3;
        if (routeShareURLOption.f1926c == RouteShareURLOption.RouteShareMode.BUS_ROUTE_SHARE_MODE) {
            if ((routeShareURLOption.f1924a.getLocation() == null || routeShareURLOption.f1925b.getLocation() == null) && routeShareURLOption.e < 0) {
                throw new IllegalArgumentException("city code can not be null if don't set start or end point");
            }
            dVar = this.f1932a;
            ll2point = CoordUtil.ll2point(routeShareURLOption.f1924a.getLocation());
            ll2point2 = CoordUtil.ll2point(routeShareURLOption.f1925b.getLocation());
            name = routeShareURLOption.f1924a.getName();
            name2 = routeShareURLOption.f1925b.getName();
            b2 = -1;
            b3 = -1;
            ordinal = routeShareURLOption.f1926c.ordinal();
            i = routeShareURLOption.e;
            i2 = routeShareURLOption.f1927d;
        } else if (routeShareURLOption.f1924a.getLocation() == null && !a(routeShareURLOption.f1924a.getCity())) {
            throw new IllegalArgumentException("start cityCode must be set if not set start location");
        } else {
            if (routeShareURLOption.f1925b.getLocation() == null && !a(routeShareURLOption.f1925b.getCity())) {
                throw new IllegalArgumentException("end cityCode must be set if not set end location");
            }
            dVar = this.f1932a;
            ll2point = CoordUtil.ll2point(routeShareURLOption.f1924a.getLocation());
            ll2point2 = CoordUtil.ll2point(routeShareURLOption.f1925b.getLocation());
            name = routeShareURLOption.f1924a.getName();
            name2 = routeShareURLOption.f1925b.getName();
            b2 = b(routeShareURLOption.f1924a.getCity());
            b3 = b(routeShareURLOption.f1925b.getCity());
            ordinal = routeShareURLOption.f1926c.ordinal();
            i = 0;
            i2 = 0;
        }
        return dVar.a(ll2point, ll2point2, name, name2, b2, b3, ordinal, i, i2);
    }

    public void setOnGetShareUrlResultListener(OnGetShareUrlResultListener onGetShareUrlResultListener) {
        this.f1933b = onGetShareUrlResultListener;
    }
}
