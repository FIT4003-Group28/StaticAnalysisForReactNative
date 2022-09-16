package com.baidu.mapapi.search.sug;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.g;
import com.baidu.platform.comapi.search.d;
/* loaded from: classes.dex */
public class SuggestionSearch extends g {

    /* renamed from: a  reason: collision with root package name */
    private d f1938a;

    /* renamed from: b  reason: collision with root package name */
    private OnGetSuggestionResultListener f1939b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1940c = false;

    /* loaded from: classes.dex */
    private class a implements com.baidu.platform.comapi.search.b {
        private a() {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(int i) {
            if (SuggestionSearch.this.f1940c || SuggestionSearch.this.f1939b == null) {
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
            SuggestionSearch.this.f1939b.onGetSuggestionResult(new SuggestionResult(errorno));
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
            if (SuggestionSearch.this.f1940c || str == null || str.length() <= 0 || SuggestionSearch.this.f1939b == null) {
                return;
            }
            SuggestionSearch.this.f1939b.onGetSuggestionResult(c.a(str));
        }

        @Override // com.baidu.platform.comapi.search.b
        public void m(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void n(String str) {
        }
    }

    SuggestionSearch() {
        this.f1938a = null;
        this.f1938a = new d();
        this.f1938a.a(new a());
    }

    public static SuggestionSearch newInstance() {
        BMapManager.init();
        return new SuggestionSearch();
    }

    public void destroy() {
        if (this.f1940c) {
            return;
        }
        this.f1940c = true;
        this.f1939b = null;
        this.f1938a.a();
        this.f1938a = null;
        BMapManager.destroy();
    }

    public boolean requestSuggestion(SuggestionSearchOption suggestionSearchOption) {
        if (this.f1938a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (suggestionSearchOption != null && suggestionSearchOption.f1943b != null && suggestionSearchOption.f1942a != null) {
            return this.f1938a.a(suggestionSearchOption.f1943b, 0, suggestionSearchOption.f1942a, (MapBound) null, 12, CoordUtil.ll2point(suggestionSearchOption.f1944c));
        }
        throw new IllegalArgumentException("option or keyword or city can not be null");
    }

    public void setOnGetSuggestionResultListener(OnGetSuggestionResultListener onGetSuggestionResultListener) {
        this.f1939b = onGetSuggestionResultListener;
    }
}
