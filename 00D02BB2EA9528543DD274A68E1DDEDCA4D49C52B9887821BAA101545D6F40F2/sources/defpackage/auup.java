package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: auup  reason: default package */
/* loaded from: classes.dex */
public final class auup extends aujb {
    private final dxio<btwr> c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public auup(defpackage.auuq r2, defpackage.dxio<defpackage.btwr> r3) {
        /*
            r1 = this;
            dpyv r0 = defpackage.dpyv.INSIGHTS_BUSINESS_NOTIFICATION
            int r0 = r0.dm
            aujc r0 = defpackage.aujd.d(r0)
            r0.d(r2)
            r2 = 2
            r0.c(r2)
            aujd r2 = r0.a()
            r1.<init>(r2)
            r1.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auup.<init>(auuq, dxio):void");
    }

    @Override // defpackage.aujb
    public final boolean f() {
        return true;
    }

    @Override // defpackage.aujb
    public final boolean g(btvo btvoVar) {
        return btvoVar.getMerchantParameters().c;
    }

    @Override // defpackage.aujb
    public final boolean r(dlfv dlfvVar, btlu btluVar) {
        dplx dplxVar;
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        if ((dlgnVar.a & 8192) != 0) {
            dplxVar = dlgnVar.r;
            if (dplxVar == null) {
                dplxVar = dplx.g;
            }
        } else {
            dplxVar = null;
        }
        if (dplxVar == null || dplxVar.f.isEmpty()) {
            return true;
        }
        Iterator<dplw> it = dplxVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            dplw next = it.next();
            if ("has_multiple_listings".equals(next.d)) {
                if ((next.b == 2 ? (String) next.c : "").equals("true")) {
                    if (!this.c.a().a().getMerchantParameters().d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.aujb
    public final boolean t() {
        return true;
    }
}
