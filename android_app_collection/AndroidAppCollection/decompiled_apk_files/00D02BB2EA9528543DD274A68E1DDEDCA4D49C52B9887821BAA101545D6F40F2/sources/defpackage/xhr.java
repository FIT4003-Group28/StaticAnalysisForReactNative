package defpackage;

import android.content.Intent;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: xhr  reason: default package */
/* loaded from: classes7.dex */
public class xhr implements xgv {
    private final amvd a;
    private final gga b;
    private final dxio<afha> c;
    @dzsi
    private final Intent d;

    public xhr(amvd amvdVar, gga ggaVar, dxio<afha> dxioVar) {
        this.a = amvdVar;
        this.b = ggaVar;
        this.c = dxioVar;
        drip dripVar = amvdVar.a.a;
        dqdk dqdkVar = (dripVar == null ? drip.h : dripVar).b;
        this.d = pzf.b(dqdkVar == null ? dqdk.e : dqdkVar, ggaVar.getPackageManager());
    }

    @Override // defpackage.xgv
    public Boolean b() {
        return Boolean.valueOf(this.d != null);
    }

    @Override // defpackage.xgv
    public Boolean c() {
        return false;
    }

    @Override // defpackage.xgv
    public Boolean d() {
        return false;
    }

    @Override // defpackage.xgv
    public Boolean e() {
        drip dripVar = this.a.a.a;
        if (dripVar == null) {
            dripVar = drip.h;
        }
        int a = drio.a(dripVar.f);
        boolean z = false;
        if (a != 0 && a == 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xgv
    public CharSequence f() {
        drip dripVar = this.a.a.a;
        if (dripVar == null) {
            dripVar = drip.h;
        }
        if ((dripVar.a & 4) != 0) {
            drip dripVar2 = this.a.a.a;
            if (dripVar2 == null) {
                dripVar2 = drip.h;
            }
            return dripVar2.d;
        }
        return this.b.getResources().getString(R.string.TRANSIT_BUY_TICKET);
    }

    @Override // defpackage.xgv
    public CharSequence g() {
        drip dripVar = this.a.a.a;
        if (dripVar == null) {
            dripVar = drip.h;
        }
        return dripVar.e;
    }

    @Override // defpackage.xgv
    public CharSequence h() {
        return "";
    }

    @Override // defpackage.xgv
    @dzsi
    public jic i() {
        String str;
        amvd amvdVar = this.a;
        drip dripVar = amvdVar.a.a;
        if (dripVar == null) {
            dripVar = drip.h;
        }
        if ((dripVar.a & 2) != 0) {
            drip dripVar2 = amvdVar.a.a;
            if (dripVar2 == null) {
                dripVar2 = drip.h;
            }
            drim drimVar = dripVar2.c;
            if (drimVar == null) {
                drimVar = drim.c;
            }
            if ((drimVar.a & 1) != 0) {
                drip dripVar3 = amvdVar.a.a;
                if (dripVar3 == null) {
                    dripVar3 = drip.h;
                }
                drim drimVar2 = dripVar3.c;
                if (drimVar2 == null) {
                    drimVar2 = drim.c;
                }
                str = drimVar2.b;
                return new jic(str, ckqc.FULLY_QUALIFIED, cqrt.g(2131232317, ibm.o()), 250, true, null, null);
            }
        }
        str = null;
        return new jic(str, ckqc.FULLY_QUALIFIED, cqrt.g(2131232317, ibm.o()), 250, true, null, null);
    }

    @Override // defpackage.xgv
    public cqkl j() {
        return cqkl.a;
    }

    @Override // defpackage.xgv
    public cqkl k() {
        if (this.d != null) {
            gga ggaVar = this.b;
            Intent intent = this.d;
            dbsk.s(intent);
            this.c.a().F(ggaVar, intent, "Buy tickets activity not found");
        }
        return cqkl.a;
    }

    @Override // defpackage.xgv
    public cqkl l() {
        return cqkl.a;
    }

    @Override // defpackage.xgv
    @dzsi
    public cjtd m() {
        cjta b = cjtd.b();
        b.d = dtyc.cF;
        ddes bZ = ddet.D.bZ();
        ddgp bZ2 = ddgr.d.bZ();
        drip dripVar = this.a.a.a;
        if (dripVar == null) {
            dripVar = drip.h;
        }
        bZ2.a(dripVar.g);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddgr ddgrVar = (ddgr) bZ2.b;
        ddgrVar.c = 1;
        ddgrVar.a = 1 | ddgrVar.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddgr bK = bZ2.bK();
        bK.getClass();
        ddetVar.w = bK;
        ddetVar.a |= 536870912;
        b.s(bZ.bK());
        return b.a();
    }

    @Override // defpackage.xgv
    public cjtd n() {
        return cjtd.b;
    }

    @Override // defpackage.xgv
    public cjtd o() {
        return cjtd.b;
    }
}
