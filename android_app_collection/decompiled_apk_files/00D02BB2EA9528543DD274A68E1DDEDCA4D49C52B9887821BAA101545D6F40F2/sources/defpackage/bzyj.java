package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: bzyj  reason: default package */
/* loaded from: classes4.dex */
public final class bzyj extends cqec {
    private bzyi ad;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r2 != 4) goto L7;
     */
    @Override // defpackage.cqec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aJ(int r2) {
        /*
            r1 = this;
            bzyi r0 = r1.ad
            defpackage.dbsk.s(r0)
            int r2 = r2 + (-1)
            if (r2 == 0) goto L18
            r0 = 3
            if (r2 == r0) goto L10
            r0 = 4
            if (r2 == r0) goto L18
            goto L1f
        L10:
            bzyi r2 = r1.ad
            cqeo r0 = defpackage.cqeo.CANNOT_CONSENT
            r2.c(r0)
            goto L1f
        L18:
            bzyi r2 = r1.ad
            cqeo r0 = defpackage.cqeo.ALREADY_CONSENTED
            r2.c(r0)
        L1f:
            gn r2 = r1.Q()
            r2.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzyj.aJ(int):void");
    }

    @Override // defpackage.ex, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        this.ad = (bzyi) av.a(this).a(bzyi.class);
    }
}
