package com.baidu.mapapi.search.geocode;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.g;
/* loaded from: classes.dex */
public class GeoCoder extends g {

    /* renamed from: a  reason: collision with root package name */
    private com.baidu.platform.comapi.search.d f1821a;

    /* renamed from: b  reason: collision with root package name */
    private OnGetGeoCoderResultListener f1822b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1823c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f1824d = 0;
    private int e = 0;

    /* loaded from: classes.dex */
    private class a implements com.baidu.platform.comapi.search.b {
        private a() {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(int i) {
            if (GeoCoder.this.f1823c || GeoCoder.this.f1822b == null) {
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
            } else if (i == 500) {
                errorno = SearchResult.ERRORNO.KEY_ERROR;
            }
            if (errorno == null) {
                return;
            }
            switch (GeoCoder.this.e) {
                case 1:
                    GeoCoder.this.f1822b.onGetGeoCodeResult(new GeoCodeResult(errorno));
                    return;
                case 2:
                    GeoCoder.this.f1822b.onGetReverseGeoCodeResult(new ReverseGeoCodeResult(errorno));
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
            if (GeoCoder.this.f1823c || GeoCoder.this.f1822b == null || str == null || str.length() <= 0) {
                return;
            }
            switch (GeoCoder.this.e) {
                case 1:
                    GeoCoder.this.f1822b.onGetGeoCodeResult(b.b(str));
                    return;
                case 2:
                    GeoCoder.this.f1822b.onGetReverseGeoCodeResult(b.a(str));
                    return;
                default:
                    return;
            }
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

    GeoCoder() {
        this.f1821a = null;
        this.f1821a = new com.baidu.platform.comapi.search.d();
        this.f1821a.a(new a());
    }

    public static GeoCoder newInstance() {
        BMapManager.init();
        return new GeoCoder();
    }

    public void destroy() {
        if (this.f1823c) {
            return;
        }
        this.f1823c = true;
        this.f1822b = null;
        this.f1821a.a();
        this.f1821a = null;
        BMapManager.destroy();
    }

    public boolean geocode(GeoCodeOption geoCodeOption) {
        if (this.f1821a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (geoCodeOption == null || geoCodeOption.f1818b == null || geoCodeOption.f1817a == null) {
            throw new IllegalArgumentException("option or address or city can not be null");
        }
        this.f1824d = this.e;
        this.e = 1;
        return this.f1821a.b(geoCodeOption.f1818b, geoCodeOption.f1817a);
    }

    public boolean reverseGeoCode(ReverseGeoCodeOption reverseGeoCodeOption) {
        if (this.f1821a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (reverseGeoCodeOption == null || reverseGeoCodeOption.f1826a == null) {
            throw new IllegalArgumentException("option or mLocation can not be null");
        }
        this.f1824d = this.e;
        this.e = 2;
        return this.f1821a.a(CoordUtil.ll2point(reverseGeoCodeOption.f1826a));
    }

    public void setOnGetGeoCodeResultListener(OnGetGeoCoderResultListener onGetGeoCoderResultListener) {
        this.f1822b = onGetGeoCoderResultListener;
    }
}
