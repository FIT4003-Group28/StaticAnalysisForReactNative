package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfif  reason: default package */
/* loaded from: classes4.dex */
public class cfif implements cfhc {
    private final dlmr a;
    private final dddi b;
    private final cfjm c;
    private boolean d = false;

    public cfif(cqhn cqhnVar, dddi dddiVar, dlmr dlmrVar, cfjm cfjmVar) {
        this.a = dlmrVar;
        this.b = dddiVar;
        this.c = cfjmVar;
    }

    @Override // defpackage.cfhc
    public cqkl a() {
        f(true);
        cfjm cfjmVar = this.c;
        cfga bZ = cfgd.h.bZ();
        dspd dspdVar = this.a.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cfgd cfgdVar = (cfgd) bZ.b;
        dspdVar.getClass();
        cfgdVar.a = 1 | cfgdVar.a;
        cfgdVar.b = dspdVar;
        cfjmVar.a(bZ.bK());
        return cqkl.a;
    }

    @Override // defpackage.cfhc
    public cqtd b() {
        dlmq dlmqVar = dlmq.UNKNOWN_ICON;
        dlmq b = dlmq.b(this.a.c);
        if (b == null) {
            b = dlmq.UNKNOWN_ICON;
        }
        int ordinal = b.ordinal();
        return cqrt.f(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? 2131231585 : 2131231196 : 2131230913 : 2131231197 : 2131230914 : 2131231198);
    }

    @Override // defpackage.cfhc
    public cqsn c() {
        dlmq dlmqVar = dlmq.UNKNOWN_ICON;
        dlmq b = dlmq.b(this.a.c);
        if (b == null) {
            b = dlmq.UNKNOWN_ICON;
        }
        int ordinal = b.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return cqrt.l(R.string.UGC_POST_TRIP_HAPPY_ICON_DESCRIPTION);
            }
            if (ordinal == 4) {
                return cqrt.l(R.string.UGC_POST_TRIP_SAD_ICON_DESCRIPTION);
            }
            if (ordinal == 5) {
                return cqrt.l(R.string.UGC_POST_TRIP_VERY_SAD_ICON_DESCRIPTION);
            }
            return cqrt.l(R.string.UGC_POST_TRIP_NEUTRAL_ICON_DESCRIPTION);
        }
        return cqrt.l(R.string.UGC_POST_TRIP_VERY_HAPPY_ICON_DESCRIPTION);
    }

    @Override // defpackage.cfhc
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxy.nY;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.b;
        dsqp dsqpVar = (dsqp) dddiVar.cu(5);
        dsqpVar.bC(dddiVar);
        dddh dddhVar = (dddh) dsqpVar;
        dspd dspdVar = this.a.b;
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

    @Override // defpackage.cfhc
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }

    public void f(boolean z) {
        boolean z2 = this.d;
        this.d = z;
        if (z2 != z) {
            cqkx.p(this);
        }
    }

    public dspd g() {
        return this.a.b;
    }
}
