package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zou  reason: default package */
/* loaded from: classes7.dex */
class zou implements zel {
    final /* synthetic */ dgas a;
    final /* synthetic */ zpe b;

    public zou(zpe zpeVar, dgas dgasVar) {
        this.b = zpeVar;
        this.a = dgasVar;
    }

    @Override // defpackage.zel
    public String a() {
        Context context = this.b.m;
        return context.getString(R.string.TRANSIT_SEGMENT_WITH_HEAVY_TRAFFIC_DESCRIPTION, bvtb.c(context.getResources(), this.a, bvsz.ABBREVIATED).toString());
    }

    @Override // defpackage.zel
    @dzsi
    public cqss b() {
        return vxj.b(dpbw.LATE);
    }

    @Override // defpackage.zel
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtyc.cL;
        return b.a();
    }
}
