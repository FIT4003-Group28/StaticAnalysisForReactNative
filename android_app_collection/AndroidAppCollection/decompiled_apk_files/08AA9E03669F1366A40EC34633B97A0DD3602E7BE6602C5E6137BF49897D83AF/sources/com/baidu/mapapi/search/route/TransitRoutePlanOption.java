package com.baidu.mapapi.search.route;
/* loaded from: classes.dex */
public class TransitRoutePlanOption {

    /* renamed from: a  reason: collision with root package name */
    PlanNode f1904a = null;

    /* renamed from: b  reason: collision with root package name */
    PlanNode f1905b = null;

    /* renamed from: c  reason: collision with root package name */
    String f1906c = null;

    /* renamed from: d  reason: collision with root package name */
    TransitPolicy f1907d = TransitPolicy.EBUS_TIME_FIRST;

    /* loaded from: classes.dex */
    public enum TransitPolicy {
        EBUS_TIME_FIRST(3),
        EBUS_TRANSFER_FIRST(4),
        EBUS_WALK_FIRST(5),
        EBUS_NO_SUBWAY(6);
        

        /* renamed from: a  reason: collision with root package name */
        private int f1909a;

        TransitPolicy(int i) {
            this.f1909a = 0;
            this.f1909a = i;
        }

        public int getInt() {
            return this.f1909a;
        }
    }

    public TransitRoutePlanOption city(String str) {
        this.f1906c = str;
        return this;
    }

    public TransitRoutePlanOption from(PlanNode planNode) {
        this.f1904a = planNode;
        return this;
    }

    public TransitRoutePlanOption policy(TransitPolicy transitPolicy) {
        this.f1907d = transitPolicy;
        return this;
    }

    public TransitRoutePlanOption to(PlanNode planNode) {
        this.f1905b = planNode;
        return this;
    }
}
