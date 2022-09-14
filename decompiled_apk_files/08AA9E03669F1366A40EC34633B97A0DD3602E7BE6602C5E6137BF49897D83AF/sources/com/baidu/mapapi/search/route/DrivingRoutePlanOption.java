package com.baidu.mapapi.search.route;

import java.util.List;
/* loaded from: classes.dex */
public class DrivingRoutePlanOption {

    /* renamed from: c  reason: collision with root package name */
    String f1879c;

    /* renamed from: a  reason: collision with root package name */
    PlanNode f1877a = null;

    /* renamed from: b  reason: collision with root package name */
    PlanNode f1878b = null;

    /* renamed from: d  reason: collision with root package name */
    DrivingPolicy f1880d = DrivingPolicy.ECAR_TIME_FIRST;
    List<PlanNode> e = null;
    DrivingTrafficPolicy f = DrivingTrafficPolicy.ROUTE_PATH;

    /* loaded from: classes.dex */
    public enum DrivingPolicy {
        ECAR_AVOID_JAM(-1),
        ECAR_TIME_FIRST(0),
        ECAR_DIS_FIRST(1),
        ECAR_FEE_FIRST(2);
        

        /* renamed from: a  reason: collision with root package name */
        private int f1882a;

        DrivingPolicy(int i) {
            this.f1882a = i;
        }

        public int getInt() {
            return this.f1882a;
        }
    }

    /* loaded from: classes.dex */
    public enum DrivingTrafficPolicy {
        ROUTE_PATH(0),
        ROUTE_PATH_AND_TRAFFIC(1);
        

        /* renamed from: a  reason: collision with root package name */
        private int f1884a;

        DrivingTrafficPolicy(int i) {
            this.f1884a = i;
        }

        public int getInt() {
            return this.f1884a;
        }
    }

    public DrivingRoutePlanOption currentCity(String str) {
        this.f1879c = str;
        return this;
    }

    public DrivingRoutePlanOption from(PlanNode planNode) {
        this.f1877a = planNode;
        return this;
    }

    public DrivingRoutePlanOption passBy(List<PlanNode> list) {
        this.e = list;
        return this;
    }

    public DrivingRoutePlanOption policy(DrivingPolicy drivingPolicy) {
        this.f1880d = drivingPolicy;
        return this;
    }

    public DrivingRoutePlanOption to(PlanNode planNode) {
        this.f1878b = planNode;
        return this;
    }

    public DrivingRoutePlanOption trafficPolicy(DrivingTrafficPolicy drivingTrafficPolicy) {
        this.f = drivingTrafficPolicy;
        return this;
    }
}
