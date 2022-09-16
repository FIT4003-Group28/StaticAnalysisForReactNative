package defpackage;
/* compiled from: PG */
/* renamed from: aahc  reason: default package */
/* loaded from: classes.dex */
public final class aahc {
    public volatile boolean a;
    private final int b;
    private int c;
    private final acrq d;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public aahc(defpackage.aacz r2, defpackage.acrq r3) {
        /*
            r1 = this;
            r1.<init>()
            r1.d = r3
            r3 = 0
            if (r2 == 0) goto L1e
            apyy r0 = r2.b()
            athd r0 = r0.o
            if (r0 != 0) goto L12
            athd r0 = defpackage.athd.a
        L12:
            aqwf r0 = r0.e
            if (r0 != 0) goto L18
            aqwf r0 = defpackage.aqwf.a
        L18:
            boolean r0 = r0.b
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r1.a = r0
            if (r2 == 0) goto L36
            apyy r2 = r2.b()
            athd r2 = r2.o
            if (r2 != 0) goto L2d
            athd r2 = defpackage.athd.a
        L2d:
            aqwf r2 = r2.e
            if (r2 != 0) goto L33
            aqwf r2 = defpackage.aqwf.a
        L33:
            int r2 = r2.c
            goto L37
        L36:
            r2 = 0
        L37:
            r1.b = r2
            r1.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aahc.<init>(aacz, acrq):void");
    }

    public final void a(aqvv aqvvVar) {
        int i;
        if (!this.a || ((i = this.b) != 0 && this.c >= i)) {
            this.a = false;
            return;
        }
        acrq acrqVar = this.d;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).cs(aqvvVar);
        acrqVar.a((arrh) a.mo39build());
        this.c++;
    }
}
