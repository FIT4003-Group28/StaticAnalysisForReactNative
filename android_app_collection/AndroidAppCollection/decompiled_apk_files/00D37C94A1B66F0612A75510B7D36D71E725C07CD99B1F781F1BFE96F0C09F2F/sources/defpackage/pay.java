package defpackage;

import java.util.Stack;
/* compiled from: PG */
/* renamed from: pay  reason: default package */
/* loaded from: classes4.dex */
public final class pay implements paz {
    private final byte[] a = new byte[8];
    private final Stack b = new Stack();
    private final pbb c = new pbb();
    private int d;
    private int e;
    private long f;
    private pbc g;

    private final long d(oxn oxnVar, int i) {
        oxnVar.h(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }

    @Override // defpackage.paz
    public final void a() {
        this.d = 0;
        this.b.clear();
        this.c.c();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08e0 A[LOOP:0: B:7:0x000e->B:436:0x08e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0755 A[SYNTHETIC] */
    @Override // defpackage.paz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.oxn r46) {
        /*
            Method dump skipped, instructions count: 2464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pay.b(oxn):boolean");
    }

    @Override // defpackage.paz
    public final void c(pbc pbcVar) {
        this.g = pbcVar;
    }
}
