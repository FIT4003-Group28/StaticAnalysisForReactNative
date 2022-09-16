package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zot  reason: default package */
/* loaded from: classes7.dex */
class zot implements zel {
    final /* synthetic */ zpe a;

    public zot(zpe zpeVar) {
        this.a = zpeVar;
    }

    @Override // defpackage.zel
    public String a() {
        return this.a.m.getString(R.string.TRANSIT_SEGMENT_WITH_NORMAL_TRAFFIC_DESCRIPTION);
    }

    @Override // defpackage.zel
    @dzsi
    public cqss b() {
        return vxj.b(dpbw.ON_TIME);
    }

    @Override // defpackage.zel
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtyc.cM;
        return b.a();
    }
}
