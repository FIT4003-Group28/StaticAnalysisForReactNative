package defpackage;
/* compiled from: PG */
/* renamed from: auzg  reason: default package */
/* loaded from: classes.dex */
public final class auzg extends auje {
    private final cezl c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public auzg(defpackage.cezl r3) {
        /*
            r2 = this;
            dpyv r0 = defpackage.dpyv.UGC_POST_TRIP_QUESTIONS
            int r0 = r0.dm
            aujc r0 = defpackage.aujd.d(r0)
            r1 = 3
            r0.c(r1)
            aujd r0 = r0.a()
            r2.<init>(r0)
            r2.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auzg.<init>(cezl):void");
    }

    @Override // defpackage.aujb
    public final auil j() {
        return auil.c(ddda.cd, ddcu.JW);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r4.b != 10) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
        r3 = (defpackage.dspd) r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
        r3 = defpackage.dspd.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        r3 = defpackage.dbsg.i((defpackage.dlno) defpackage.dsqw.cp(defpackage.dlno.f, r3));
     */
    @Override // defpackage.aujb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r(defpackage.dlfv r3, defpackage.btlu r4) {
        /*
            r2 = this;
            dlgn r3 = r3.g
            if (r3 != 0) goto L6
            dlgn r3 = defpackage.dlgn.G
        L6:
            dsrj<dlhl> r3 = r3.s
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            dlhl r4 = (defpackage.dlhl) r4
            java.lang.String r0 = r4.d
            java.lang.String r1 = "questions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            int r3 = r4.b     // Catch: defpackage.dsrm -> L3c
            r0 = 10
            if (r3 != r0) goto L2d
            java.lang.Object r3 = r4.c     // Catch: defpackage.dsrm -> L3c
            dspd r3 = (defpackage.dspd) r3     // Catch: defpackage.dsrm -> L3c
            goto L2f
        L2d:
            dspd r3 = defpackage.dspd.b     // Catch: defpackage.dsrm -> L3c
        L2f:
            dlno r4 = defpackage.dlno.f     // Catch: defpackage.dsrm -> L3c
            dsqw r3 = defpackage.dsqw.cp(r4, r3)     // Catch: defpackage.dsrm -> L3c
            dlno r3 = (defpackage.dlno) r3     // Catch: defpackage.dsrm -> L3c
            dbsg r3 = defpackage.dbsg.i(r3)     // Catch: defpackage.dsrm -> L3c
            goto L3e
        L3c:
            dbpy<java.lang.Object> r3 = defpackage.dbpy.a
        L3e:
            boolean r4 = r3.a()
            r0 = 1
            if (r4 != 0) goto L46
            return r0
        L46:
            cezl r4 = r2.c
            java.lang.Object r3 = r3.b()
            dlno r3 = (defpackage.dlno) r3
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L55
            return r0
        L55:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auzg.r(dlfv, btlu):boolean");
    }

    @Override // defpackage.auje
    public final dkhd y(btvo btvoVar) {
        dkrd dkrdVar = btvoVar.getNotificationsParameters().r;
        if (dkrdVar == null) {
            dkrdVar = dkrd.b;
        }
        dkhd dkhdVar = dkrdVar.a;
        return dkhdVar == null ? dkhd.h : dkhdVar;
    }

    @Override // defpackage.auje
    public final auik z(dkpm dkpmVar) {
        ddos ddosVar = ddos.POST_TRIP_UGC;
        dkpi dkpiVar = dkpmVar.f;
        if (dkpiVar == null) {
            dkpiVar = dkpi.i;
        }
        return auik.c(ddosVar, dkpiVar);
    }
}
