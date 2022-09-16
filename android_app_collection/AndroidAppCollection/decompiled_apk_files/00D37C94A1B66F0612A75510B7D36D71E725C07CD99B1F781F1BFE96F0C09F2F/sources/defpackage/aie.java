package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aie  reason: default package */
/* loaded from: classes.dex */
public final class aie extends aig {
    public int a;
    public ahe b;

    public aie(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 == 6) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r0 == 6) goto L12;
     */
    @Override // defpackage.aig
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ahh r6, boolean r7) {
        /*
            r5 = this;
            int r0 = r5.a
            r1 = 1
            r2 = 0
            r3 = 6
            r4 = 5
            if (r7 == 0) goto Lf
            if (r0 != r4) goto Lc
        La:
            r0 = 1
            goto L16
        Lc:
            if (r0 != r3) goto L16
            goto L11
        Lf:
            if (r0 != r4) goto L13
        L11:
            r0 = 0
            goto L16
        L13:
            if (r0 != r3) goto L16
            goto La
        L16:
            boolean r7 = r6 instanceof defpackage.ahe
            if (r7 == 0) goto L1e
            ahe r6 = (defpackage.ahe) r6
            r6.a = r0
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aie.a(ahh, boolean):void");
    }

    public final void b(int i) {
        this.b.c = i;
    }

    @Override // defpackage.aig
    protected final void c() {
        ahe aheVar = new ahe();
        this.b = aheVar;
        this.h = aheVar;
        f();
    }
}
