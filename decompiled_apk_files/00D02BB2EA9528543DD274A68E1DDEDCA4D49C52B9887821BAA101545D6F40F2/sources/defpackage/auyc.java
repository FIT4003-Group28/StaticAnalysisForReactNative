package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: auyc  reason: default package */
/* loaded from: classes.dex */
public final class auyc extends aujb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public auyc() {
        /*
            r2 = this;
            dpyv r0 = defpackage.dpyv.RIDDLER
            int r0 = r0.dm
            aujc r0 = defpackage.aujd.d(r0)
            r1 = 3
            r0.c(r1)
            r1 = 1
            r0.b(r1)
            aujd r0 = r0.a()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auyc.<init>():void");
    }

    @Override // defpackage.aujb
    public final boolean r(dlfv dlfvVar, btlu btluVar) {
        dplw dplwVar;
        dspd dspdVar;
        dlgn dlgnVar = dlfvVar.g;
        if (dlgnVar == null) {
            dlgnVar = dlgn.G;
        }
        dplx dplxVar = dlgnVar.r;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        Iterator<dplw> it = dplxVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                dplwVar = null;
                break;
            }
            dplwVar = it.next();
            if ("payload".equals(dplwVar.d)) {
                break;
            }
        }
        if (dplwVar != null) {
            try {
                if (dplwVar.b != 3) {
                    dspdVar = dspd.b;
                } else {
                    dspdVar = (dspd) dplwVar.c;
                }
                return ((dlil) dsqw.cp(dlil.g, dspdVar)).b.size() == 0;
            } catch (dsrm unused) {
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.aujb
    public final boolean t() {
        return true;
    }
}
