package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfjx  reason: default package */
/* loaded from: classes4.dex */
public class cfjx implements cfhg {
    private final dddi a;
    private final dlna b;
    private final mw<dspd> c;
    private final String d;
    private final cqtd e;

    public cfjx(Resources resources, cfgv cfgvVar, gce gceVar, dddi dddiVar, dspd dspdVar, dlna dlnaVar, mw<dspd> mwVar) {
        String str;
        cqtd e;
        this.a = dddiVar;
        this.b = dlnaVar;
        this.c = mwVar;
        if (!((dpum) cfgvVar.c(dspdVar, dlnaVar.a).h(cfjw.a).c(dpum.d)).equals(dpum.d)) {
            str = resources.getString(R.string.UGC_POST_TRIP_EDITED_LABEL);
        } else {
            str = dlnaVar.c;
        }
        this.d = str;
        boolean h = gceVar.h();
        int a = dlmz.a(dlnaVar.d);
        int i = (a == 0 ? 1 : a) - 1;
        if (i == 2) {
            e = iup.e(h ? R.raw.icon_entrance_dark : R.raw.icon_entrance);
        } else if (i == 3) {
            e = iup.e(h ? R.raw.icon_street_dark : R.raw.icon_street);
        } else if (h) {
            e = iup.e(R.raw.icon_destination_dark);
        } else {
            e = iup.e(R.raw.icon_destination);
        }
        this.e = e;
    }

    @Override // defpackage.cfhg
    public String a() {
        return this.b.b;
    }

    @Override // defpackage.cfhg
    public String b() {
        return this.d;
    }

    @Override // defpackage.cfhg
    public cqkl c() {
        this.c.a(this.b.a);
        return cqkl.a;
    }

    @Override // defpackage.cfhg
    public cqtd d() {
        return this.e;
    }

    @Override // defpackage.cfhg
    public cjtd e() {
        cjta b = cjtd.b();
        b.d = dtxy.od;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.a;
        dsqp dsqpVar = (dsqp) dddiVar.cu(5);
        dsqpVar.bC(dddiVar);
        dddh dddhVar = (dddh) dsqpVar;
        dspd dspdVar = this.b.a;
        if (dddhVar.c) {
            dddhVar.bF();
            dddhVar.c = false;
        }
        dddi dddiVar2 = (dddi) dddhVar.b;
        dspdVar.getClass();
        dddiVar2.a |= 2;
        dddiVar2.c = dspdVar;
        dddi bK = dddhVar.bK();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        bK.getClass();
        dddgVar.d = bK;
        dddgVar.a |= 32;
        b.j(bZ.bK());
        return b.a();
    }
}
