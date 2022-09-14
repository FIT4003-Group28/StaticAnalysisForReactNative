package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bwdu  reason: default package */
/* loaded from: classes4.dex */
public final class bwdu extends bweo {
    @dzsi
    private final String c;
    @dzsi
    private final String d;
    private final boolean e;
    private final int f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bwdu(java.lang.String r1, @defpackage.dzsi defpackage.drrp r2, @defpackage.dzsi java.lang.String r3, @defpackage.dzsi java.lang.String r4, boolean r5, int r6) {
        /*
            r0 = this;
            if (r2 != 0) goto L7
            dqhg r1 = g(r1)
            goto Lb
        L7:
            dqhg r1 = h(r2, r1)
        Lb:
            r0.<init>(r1)
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwdu.<init>(java.lang.String, drrp, java.lang.String, java.lang.String, boolean, int):void");
    }

    @Override // defpackage.bweo
    @dzsi
    public final String a(Context context, @dzsi bwfq bwfqVar) {
        return j(this.e ? this.c : null, this.d);
    }

    @Override // defpackage.bweo
    @dzsi
    public final String b(Context context, @dzsi bwfq bwfqVar) {
        return this.c;
    }

    @Override // defpackage.bweo
    public final int d() {
        return this.f;
    }
}
