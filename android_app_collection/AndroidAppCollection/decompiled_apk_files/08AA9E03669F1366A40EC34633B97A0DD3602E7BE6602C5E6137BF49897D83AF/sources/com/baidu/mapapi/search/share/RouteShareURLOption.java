package com.baidu.mapapi.search.share;

import com.baidu.mapapi.search.route.PlanNode;
/* loaded from: classes.dex */
public class RouteShareURLOption {

    /* renamed from: c  reason: collision with root package name */
    RouteShareMode f1926c;

    /* renamed from: a  reason: collision with root package name */
    PlanNode f1924a = null;

    /* renamed from: b  reason: collision with root package name */
    PlanNode f1925b = null;

    /* renamed from: d  reason: collision with root package name */
    int f1927d = 0;
    int e = -1;

    /* loaded from: classes.dex */
    public enum RouteShareMode {
        CAR_ROUTE_SHARE_MODE(0),
        FOOT_ROUTE_SHARE_MODE(1),
        CYCLE_ROUTE_SHARE_MODE(2),
        BUS_ROUTE_SHARE_MODE(3);
        

        /* renamed from: a  reason: collision with root package name */
        private int f1929a;

        RouteShareMode(int i) {
            this.f1929a = -1;
            this.f1929a = i;
        }

        public int getRouteShareMode() {
            return this.f1929a;
        }
    }

    public RouteShareURLOption cityCode(int i) {
        this.e = i;
        return this;
    }

    public RouteShareURLOption from(PlanNode planNode) {
        this.f1924a = planNode;
        return this;
    }

    public RouteShareMode getmMode() {
        return this.f1926c;
    }

    public RouteShareURLOption pn(int i) {
        this.f1927d = i;
        return this;
    }

    public RouteShareURLOption routMode(RouteShareMode routeShareMode) {
        this.f1926c = routeShareMode;
        return this;
    }

    public RouteShareURLOption to(PlanNode planNode) {
        this.f1925b = planNode;
        return this;
    }
}
