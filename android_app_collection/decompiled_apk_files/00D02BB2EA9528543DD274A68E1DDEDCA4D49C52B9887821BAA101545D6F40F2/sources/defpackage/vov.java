package defpackage;
/* compiled from: PG */
/* renamed from: vov  reason: default package */
/* loaded from: classes7.dex */
public enum vov {
    NORMAL(true, 2, akps.NORMAL),
    SINGLE_ROUTE(false, 1, akps.NORMAL),
    SINGLE_ROUTE_NO_PINS(false, 1, vuu.a, akps.NORMAL),
    SINGLE_ROUTE_WITH_ETA(false, 2, akps.NORMAL),
    LAST_MILE(false, 3, akps.NORMAL),
    MINI_MAP(false, 2, akps.MINI),
    SAME_TRAVEL_MODE(true, 2, akps.NORMAL),
    WAYPOINTS_ONLY(false, 1, vuu.d, akps.NORMAL);
    
    public final boolean i;
    public final akps j;
    public final int k;
    public final int l;
    public final int m;

    vov(boolean z, int i, int i2, akps akpsVar) {
        this.i = z;
        this.k = i;
        this.l = 1;
        this.m = i2;
        this.j = akpsVar;
    }

    vov(boolean z, int i, akps akpsVar) {
        this(z, i, vuu.b, akpsVar);
    }
}
