package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zox  reason: default package */
/* loaded from: classes7.dex */
class zox implements zen {
    final /* synthetic */ zpe a;

    public zox(zpe zpeVar) {
        this.a = zpeVar;
    }

    @Override // defpackage.zen
    public String a() {
        return this.a.m.getString(R.string.INFORMAL_TRANSIT_SEE_TRIP_DETAILS);
    }

    @Override // defpackage.zen
    @dzsi
    public CharSequence b() {
        return this.a.b;
    }

    @Override // defpackage.zen
    @dzsi
    public String c() {
        return this.a.e;
    }

    @Override // defpackage.zen
    public Boolean d() {
        return Boolean.valueOf(!dbsj.d(this.a.e));
    }

    @Override // defpackage.zen
    @dzsi
    public String e() {
        dpbw dpbwVar = dpbw.UNKNOWN;
        int ordinal = this.a.k.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return this.a.m.getString(R.string.INFORMAL_TRANSIT_ROUTE_TRAFFIC_USUAL_TRAFFIC);
        }
        if (ordinal == 3) {
            return this.a.m.getString(R.string.INFORMAL_TRANSIT_ROUTE_TRAFFIC_HEAVY);
        }
        return null;
    }

    @Override // defpackage.zen
    public cqss f() {
        return vxj.b(this.a.k);
    }

    @Override // defpackage.zen
    @dzsi
    public cqkl g() {
        return this.a.T();
    }

    @Override // defpackage.zen
    public cjtd h() {
        cjta b = cjtd.b();
        b.d = dtxs.ab;
        return b.a();
    }
}
