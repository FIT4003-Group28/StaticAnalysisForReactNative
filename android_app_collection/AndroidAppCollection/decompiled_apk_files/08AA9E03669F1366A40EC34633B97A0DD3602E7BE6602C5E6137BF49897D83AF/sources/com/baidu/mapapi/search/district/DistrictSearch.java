package com.baidu.mapapi.search.district;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.g;
import com.baidu.platform.comapi.search.d;
/* loaded from: classes.dex */
public class DistrictSearch extends g {

    /* renamed from: a  reason: collision with root package name */
    private d f1811a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1812b = false;

    /* renamed from: c  reason: collision with root package name */
    private OnGetDistricSearchResultListener f1813c;

    /* loaded from: classes.dex */
    private class a implements com.baidu.platform.comapi.search.b {
        private a() {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(int i) {
            if (DistrictSearch.this.f1812b || DistrictSearch.this.f1813c == null) {
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
            DistrictSearch.this.f1813c.onGetDistrictResult(new DistrictResult(errorno));
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
        }

        @Override // com.baidu.platform.comapi.search.b
        public void k(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void l(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void m(String str) {
            if (DistrictSearch.this.f1812b || str == null || str.length() <= 0 || DistrictSearch.this.f1813c == null) {
                return;
            }
            DistrictSearch.this.f1813c.onGetDistrictResult(b.a(str));
        }

        @Override // com.baidu.platform.comapi.search.b
        public void n(String str) {
        }
    }

    DistrictSearch() {
        this.f1811a = null;
        this.f1811a = new d();
        this.f1811a.a(new a());
    }

    public static DistrictSearch newInstance() {
        BMapManager.init();
        return new DistrictSearch();
    }

    public void destroy() {
        if (this.f1812b) {
            return;
        }
        this.f1812b = true;
        this.f1813c = null;
        this.f1811a.a();
        this.f1811a = null;
        BMapManager.destroy();
    }

    public boolean searchDistrict(DistrictSearchOption districtSearchOption) {
        if (this.f1811a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (districtSearchOption != null && districtSearchOption.f1815a != null) {
            return this.f1811a.c(districtSearchOption.f1815a, districtSearchOption.f1816b);
        }
        throw new IllegalArgumentException("option or city name can not be null");
    }

    public void setOnDistrictSearchListener(OnGetDistricSearchResultListener onGetDistricSearchResultListener) {
        this.f1813c = onGetDistricSearchResultListener;
    }
}
