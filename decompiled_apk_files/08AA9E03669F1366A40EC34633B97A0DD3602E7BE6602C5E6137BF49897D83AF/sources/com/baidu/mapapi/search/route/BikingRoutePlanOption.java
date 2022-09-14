package com.baidu.mapapi.search.route;
/* loaded from: classes.dex */
public class BikingRoutePlanOption {

    /* renamed from: a  reason: collision with root package name */
    PlanNode f1868a = null;

    /* renamed from: b  reason: collision with root package name */
    PlanNode f1869b = null;

    public BikingRoutePlanOption from(PlanNode planNode) {
        this.f1868a = planNode;
        return this;
    }

    public BikingRoutePlanOption to(PlanNode planNode) {
        this.f1869b = planNode;
        return this;
    }
}
