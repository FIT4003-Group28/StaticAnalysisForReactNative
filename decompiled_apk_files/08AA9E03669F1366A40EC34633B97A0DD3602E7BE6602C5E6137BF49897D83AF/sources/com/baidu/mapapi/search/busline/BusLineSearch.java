package com.baidu.mapapi.search.busline;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.g;
import com.baidu.platform.comapi.search.d;
/* loaded from: classes.dex */
public class BusLineSearch extends g {

    /* renamed from: a  reason: collision with root package name */
    private d f1781a;

    /* renamed from: b  reason: collision with root package name */
    private OnGetBusLineSearchResultListener f1782b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1783c = false;

    /* loaded from: classes.dex */
    private class a implements com.baidu.platform.comapi.search.b {
        private a() {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(int i) {
            if (BusLineSearch.this.f1783c || BusLineSearch.this.f1782b == null) {
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
            BusLineSearch.this.f1782b.onGetBusLineResult(new BusLineResult(errorno));
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
            if (BusLineSearch.this.f1783c || str == null || str.length() <= 0 || BusLineSearch.this.f1782b == null) {
                return;
            }
            BusLineSearch.this.f1782b.onGetBusLineResult(b.a(str));
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

    BusLineSearch() {
        this.f1781a = null;
        this.f1781a = new d();
        this.f1781a.a(new a());
    }

    public static BusLineSearch newInstance() {
        BMapManager.init();
        return new BusLineSearch();
    }

    public void destroy() {
        if (this.f1783c) {
            return;
        }
        this.f1783c = true;
        this.f1782b = null;
        this.f1781a.a();
        this.f1781a = null;
        BMapManager.destroy();
    }

    public boolean searchBusLine(BusLineSearchOption busLineSearchOption) {
        if (this.f1781a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (busLineSearchOption != null && busLineSearchOption.f1786b != null && busLineSearchOption.f1785a != null) {
            return this.f1781a.a(busLineSearchOption.f1786b, busLineSearchOption.f1785a);
        }
        throw new IllegalArgumentException("option or city or uid can not be null");
    }

    public void setOnGetBusLineSearchResultListener(OnGetBusLineSearchResultListener onGetBusLineSearchResultListener) {
        this.f1782b = onGetBusLineSearchResultListener;
    }
}
