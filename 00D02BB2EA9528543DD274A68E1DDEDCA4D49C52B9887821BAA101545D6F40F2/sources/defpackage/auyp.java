package defpackage;
/* compiled from: PG */
/* renamed from: auyp  reason: default package */
/* loaded from: classes.dex */
public final class auyp extends aujb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public auyp() {
        /*
            r2 = this;
            dpyv r0 = defpackage.dpyv.TODO_LIST
            int r0 = r0.dm
            aujc r0 = defpackage.aujd.d(r0)
            r1 = 2
            r0.c(r1)
            aujd r0 = r0.a()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auyp.<init>():void");
    }

    @Override // defpackage.aujb
    public final auik k(btvo btvoVar) {
        ddos ddosVar = ddos.TODO_LIST;
        dkpm dkpmVar = btvoVar.getNotificationsParameters().d;
        if (dkpmVar == null) {
            dkpmVar = dkpm.k;
        }
        dkpi dkpiVar = dkpmVar.g;
        if (dkpiVar == null) {
            dkpiVar = dkpi.i;
        }
        return auik.c(ddosVar, dkpiVar);
    }

    @Override // defpackage.aujb
    public final boolean t() {
        return true;
    }
}
