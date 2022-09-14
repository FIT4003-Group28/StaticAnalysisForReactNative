package com.baidu.mapapi.search.route;
/* loaded from: classes.dex */
public class WalkingRoutePlanOption {

    /* renamed from: a  reason: collision with root package name */
    PlanNode f1915a = null;

    /* renamed from: b  reason: collision with root package name */
    PlanNode f1916b = null;

    public WalkingRoutePlanOption from(PlanNode planNode) {
        this.f1915a = planNode;
        return this;
    }

    public WalkingRoutePlanOption to(PlanNode planNode) {
        this.f1916b = planNode;
        return this;
    }
}
