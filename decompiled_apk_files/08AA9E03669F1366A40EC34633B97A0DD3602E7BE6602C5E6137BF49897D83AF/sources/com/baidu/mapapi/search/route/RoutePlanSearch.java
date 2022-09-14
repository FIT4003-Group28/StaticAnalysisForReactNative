package com.baidu.mapapi.search.route;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.inner.MapBound;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.route.DrivingRoutePlanOption;
import com.baidu.mapapi.search.route.TransitRoutePlanOption;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class RoutePlanSearch extends com.baidu.mapapi.search.core.g {

    /* renamed from: a  reason: collision with root package name */
    private com.baidu.platform.comapi.search.d f1892a;

    /* renamed from: b  reason: collision with root package name */
    private OnGetRoutePlanResultListener f1893b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1894c = false;

    /* renamed from: d  reason: collision with root package name */
    private int f1895d = 0;
    private int e = 0;

    /* loaded from: classes.dex */
    private class a implements com.baidu.platform.comapi.search.b {
        private a() {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void a(int i) {
            if (RoutePlanSearch.this.f1894c || RoutePlanSearch.this.f1893b == null) {
                return;
            }
            SearchResult.ERRORNO errorno = null;
            if (i == 8) {
                errorno = SearchResult.ERRORNO.NETWORK_TIME_OUT;
            } else if (i == 107) {
                errorno = SearchResult.ERRORNO.PERMISSION_UNFINISHED;
            } else if (i != 500) {
                switch (i) {
                    case 2:
                        errorno = SearchResult.ERRORNO.NETWORK_ERROR;
                        break;
                    default:
                        switch (i) {
                            case 12:
                                errorno = SearchResult.ERRORNO.NOT_SUPPORT_BUS;
                                break;
                            case 13:
                                errorno = SearchResult.ERRORNO.NOT_SUPPORT_BUS_2CITY;
                                break;
                            case 14:
                                errorno = SearchResult.ERRORNO.ST_EN_TOO_NEAR;
                                break;
                        }
                    case 3:
                        errorno = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                        break;
                }
            } else {
                errorno = SearchResult.ERRORNO.KEY_ERROR;
            }
            if (errorno == null) {
                return;
            }
            switch (RoutePlanSearch.this.e) {
                case 0:
                    RoutePlanSearch.this.f1893b.onGetTransitRouteResult(new TransitRouteResult(errorno));
                    return;
                case 1:
                    RoutePlanSearch.this.f1893b.onGetWalkingRouteResult(new WalkingRouteResult(errorno));
                    return;
                case 2:
                    RoutePlanSearch.this.f1893b.onGetDrivingRouteResult(new DrivingRouteResult(errorno));
                    return;
                case 3:
                    RoutePlanSearch.this.f1893b.onGetBikingRouteResult(new BikingRouteResult(errorno));
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
            if (RoutePlanSearch.this.f1894c || str == null || str.length() == 0 || RoutePlanSearch.this.f1893b == null) {
                return;
            }
            switch (RoutePlanSearch.this.e) {
                case 0:
                    TransitRouteResult transitRouteResult = new TransitRouteResult(SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR);
                    transitRouteResult.a(h.h(str));
                    RoutePlanSearch.this.f1893b.onGetTransitRouteResult(transitRouteResult);
                    return;
                case 1:
                    WalkingRouteResult walkingRouteResult = new WalkingRouteResult(SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR);
                    walkingRouteResult.a(h.h(str));
                    RoutePlanSearch.this.f1893b.onGetWalkingRouteResult(walkingRouteResult);
                    return;
                case 2:
                    DrivingRouteResult drivingRouteResult = new DrivingRouteResult(SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR);
                    drivingRouteResult.a(h.h(str));
                    if (drivingRouteResult.getSuggestAddrInfo().getSuggestEndCity() == null && drivingRouteResult.getSuggestAddrInfo().getSuggestEndNode() == null && drivingRouteResult.getSuggestAddrInfo().getSuggestStartCity() == null && drivingRouteResult.getSuggestAddrInfo().getSuggestStartNode() == null && drivingRouteResult.getSuggestAddrInfo().getSuggestWpCity() == null && drivingRouteResult.getSuggestAddrInfo().getSuggestWpNode() == null) {
                        drivingRouteResult.error = SearchResult.ERRORNO.RESULT_NOT_FOUND;
                    }
                    RoutePlanSearch.this.f1893b.onGetDrivingRouteResult(drivingRouteResult);
                    return;
                case 3:
                    BikingRouteResult bikingRouteResult = new BikingRouteResult(SearchResult.ERRORNO.AMBIGUOUS_ROURE_ADDR);
                    bikingRouteResult.a(h.h(str));
                    RoutePlanSearch.this.f1893b.onGetBikingRouteResult(bikingRouteResult);
                    return;
                default:
                    return;
            }
        }

        @Override // com.baidu.platform.comapi.search.b
        public void d(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void e(String str) {
        }

        @Override // com.baidu.platform.comapi.search.b
        public void f(String str) {
            if (RoutePlanSearch.this.f1894c || str == null || str.length() == 0 || RoutePlanSearch.this.f1893b == null) {
                return;
            }
            RoutePlanSearch.this.f1893b.onGetDrivingRouteResult(h.b(str));
        }

        @Override // com.baidu.platform.comapi.search.b
        public void g(String str) {
            if (RoutePlanSearch.this.f1894c || str == null || str.length() == 0 || RoutePlanSearch.this.f1893b == null) {
                return;
            }
            RoutePlanSearch.this.f1893b.onGetWalkingRouteResult(h.c(str));
        }

        @Override // com.baidu.platform.comapi.search.b
        public void h(String str) {
            if (RoutePlanSearch.this.f1894c || str == null || str.length() == 0 || RoutePlanSearch.this.f1893b == null) {
                return;
            }
            RoutePlanSearch.this.f1893b.onGetTransitRouteResult(h.a(str));
        }

        @Override // com.baidu.platform.comapi.search.b
        public void i(String str) {
            if (RoutePlanSearch.this.f1894c || str == null || str.length() == 0 || RoutePlanSearch.this.f1893b == null) {
                return;
            }
            RoutePlanSearch.this.f1893b.onGetBikingRouteResult(h.d(str));
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

    RoutePlanSearch() {
        this.f1892a = null;
        this.f1892a = new com.baidu.platform.comapi.search.d();
        this.f1892a.a(new a());
    }

    private ArrayList<com.baidu.platform.comapi.search.f> a(DrivingRoutePlanOption drivingRoutePlanOption) {
        if (drivingRoutePlanOption.e == null) {
            return null;
        }
        ArrayList<com.baidu.platform.comapi.search.f> arrayList = new ArrayList<>();
        for (PlanNode planNode : drivingRoutePlanOption.e) {
            if (planNode != null && (planNode.getLocation() != null || (planNode.getName() != null && planNode.getCity() != null && planNode.getName().length() > 0 && planNode.getCity().length() > 0))) {
                com.baidu.platform.comapi.search.f fVar = new com.baidu.platform.comapi.search.f();
                if (planNode.getName() != null) {
                    fVar.f2106b = planNode.getName();
                }
                if (planNode.getLocation() != null) {
                    fVar.f2105a = CoordUtil.ll2point(planNode.getLocation());
                }
                fVar.f2107c = planNode.getCity() == null ? "" : planNode.getCity();
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public static RoutePlanSearch newInstance() {
        BMapManager.init();
        return new RoutePlanSearch();
    }

    public boolean bikingSearch(BikingRoutePlanOption bikingRoutePlanOption) {
        if (this.f1892a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (bikingRoutePlanOption == null || bikingRoutePlanOption.f1869b == null || bikingRoutePlanOption.f1868a == null) {
            throw new IllegalArgumentException("route plan option , origin or destination can not be null");
        }
        com.baidu.platform.comapi.search.a aVar = new com.baidu.platform.comapi.search.a();
        if (bikingRoutePlanOption.f1868a.getName() != null) {
            aVar.f2096d = bikingRoutePlanOption.f1868a.getName();
        }
        if (bikingRoutePlanOption.f1868a.getLocation() != null) {
            aVar.f2095c = bikingRoutePlanOption.f1868a.getLocation();
            aVar.f2093a = 1;
        }
        com.baidu.platform.comapi.search.a aVar2 = new com.baidu.platform.comapi.search.a();
        if (bikingRoutePlanOption.f1869b.getName() != null) {
            aVar2.f2096d = bikingRoutePlanOption.f1869b.getName();
        }
        if (bikingRoutePlanOption.f1869b.getLocation() != null) {
            aVar2.f2095c = bikingRoutePlanOption.f1869b.getLocation();
            aVar2.f2093a = 1;
        }
        this.f1895d = this.e;
        this.e = 3;
        return this.f1892a.a(aVar, aVar2, bikingRoutePlanOption.f1868a.getCity(), bikingRoutePlanOption.f1869b.getCity());
    }

    public void destroy() {
        if (this.f1894c) {
            return;
        }
        this.f1894c = true;
        this.f1893b = null;
        this.f1892a.a();
        this.f1892a = null;
        BMapManager.destroy();
    }

    public boolean drivingSearch(DrivingRoutePlanOption drivingRoutePlanOption) {
        if (this.f1892a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (drivingRoutePlanOption == null || drivingRoutePlanOption.f1878b == null || drivingRoutePlanOption.f1877a == null) {
            throw new IllegalArgumentException("route plan option , origin or destination can not be null");
        }
        if (drivingRoutePlanOption.f1880d == null) {
            drivingRoutePlanOption.f1880d = DrivingRoutePlanOption.DrivingPolicy.ECAR_TIME_FIRST;
        }
        com.baidu.platform.comapi.search.a aVar = new com.baidu.platform.comapi.search.a();
        if (drivingRoutePlanOption.f1877a.getName() != null) {
            aVar.f2096d = drivingRoutePlanOption.f1877a.getName();
        }
        if (drivingRoutePlanOption.f1877a.getLocation() != null) {
            aVar.f2094b = CoordUtil.ll2point(drivingRoutePlanOption.f1877a.getLocation());
            aVar.f2093a = 1;
        }
        com.baidu.platform.comapi.search.a aVar2 = new com.baidu.platform.comapi.search.a();
        if (drivingRoutePlanOption.f1878b.getName() != null) {
            aVar2.f2096d = drivingRoutePlanOption.f1878b.getName();
        }
        if (drivingRoutePlanOption.f1878b.getLocation() != null) {
            aVar2.f2094b = CoordUtil.ll2point(drivingRoutePlanOption.f1878b.getLocation());
            aVar2.f2093a = 1;
        }
        this.f1895d = this.e;
        this.e = 2;
        int i = DrivingRoutePlanOption.DrivingTrafficPolicy.ROUTE_PATH.getInt();
        if (drivingRoutePlanOption.f != null) {
            i = drivingRoutePlanOption.f.getInt();
        }
        return this.f1892a.a(aVar, aVar2, drivingRoutePlanOption.f1879c, drivingRoutePlanOption.f1877a.getCity(), drivingRoutePlanOption.f1878b.getCity(), null, 12, drivingRoutePlanOption.f1880d.getInt(), i, a(drivingRoutePlanOption), null);
    }

    public void setOnGetRoutePlanResultListener(OnGetRoutePlanResultListener onGetRoutePlanResultListener) {
        this.f1893b = onGetRoutePlanResultListener;
    }

    public boolean transitSearch(TransitRoutePlanOption transitRoutePlanOption) {
        if (this.f1892a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (transitRoutePlanOption == null || transitRoutePlanOption.f1906c == null || transitRoutePlanOption.f1905b == null || transitRoutePlanOption.f1904a == null) {
            throw new IllegalArgumentException("route plan option,origin or destination or city can not be null");
        }
        if (transitRoutePlanOption.f1907d == null) {
            transitRoutePlanOption.f1907d = TransitRoutePlanOption.TransitPolicy.EBUS_TIME_FIRST;
        }
        com.baidu.platform.comapi.search.a aVar = new com.baidu.platform.comapi.search.a();
        if (transitRoutePlanOption.f1904a.getName() != null) {
            aVar.f2096d = transitRoutePlanOption.f1904a.getName();
        }
        if (transitRoutePlanOption.f1904a.getLocation() != null) {
            aVar.f2094b = CoordUtil.ll2point(transitRoutePlanOption.f1904a.getLocation());
            aVar.f2093a = 1;
        }
        com.baidu.platform.comapi.search.a aVar2 = new com.baidu.platform.comapi.search.a();
        if (transitRoutePlanOption.f1905b.getName() != null) {
            aVar2.f2096d = transitRoutePlanOption.f1905b.getName();
        }
        if (transitRoutePlanOption.f1905b.getLocation() != null) {
            aVar2.f2094b = CoordUtil.ll2point(transitRoutePlanOption.f1905b.getLocation());
            aVar2.f2093a = 1;
        }
        this.f1895d = this.e;
        this.e = 0;
        return this.f1892a.a(aVar, aVar2, transitRoutePlanOption.f1906c, (MapBound) null, 12, transitRoutePlanOption.f1907d.getInt(), (Map<String, Object>) null);
    }

    public boolean walkingSearch(WalkingRoutePlanOption walkingRoutePlanOption) {
        if (this.f1892a == null) {
            throw new IllegalStateException("searcher has been destroyed");
        }
        if (walkingRoutePlanOption == null || walkingRoutePlanOption.f1916b == null || walkingRoutePlanOption.f1915a == null) {
            throw new IllegalArgumentException("option , origin or destination can not be null");
        }
        com.baidu.platform.comapi.search.a aVar = new com.baidu.platform.comapi.search.a();
        if (walkingRoutePlanOption.f1915a.getName() != null) {
            aVar.f2096d = walkingRoutePlanOption.f1915a.getName();
        }
        if (walkingRoutePlanOption.f1915a.getLocation() != null) {
            aVar.f2094b = CoordUtil.ll2point(walkingRoutePlanOption.f1915a.getLocation());
            aVar.f2093a = 1;
        }
        com.baidu.platform.comapi.search.a aVar2 = new com.baidu.platform.comapi.search.a();
        if (walkingRoutePlanOption.f1916b.getName() != null) {
            aVar2.f2096d = walkingRoutePlanOption.f1916b.getName();
        }
        if (walkingRoutePlanOption.f1916b.getLocation() != null) {
            aVar2.f2094b = CoordUtil.ll2point(walkingRoutePlanOption.f1916b.getLocation());
            aVar2.f2093a = 1;
        }
        this.f1895d = this.e;
        this.e = 1;
        return this.f1892a.a(aVar, aVar2, (String) null, walkingRoutePlanOption.f1915a.getCity(), walkingRoutePlanOption.f1916b.getCity(), (MapBound) null, 12, (Map<String, Object>) null);
    }
}
