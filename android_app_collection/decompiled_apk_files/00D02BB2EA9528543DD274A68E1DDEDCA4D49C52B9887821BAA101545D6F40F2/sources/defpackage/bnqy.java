package defpackage;

import java.util.Arrays;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: bnqy  reason: default package */
/* loaded from: classes.dex */
public final class bnqy {
    int a;
    int b;
    int c;
    int d;
    BitSet e;
    BitSet f;
    int[] g;
    int h;
    int[] i;
    int[] j;
    int k;
    int[] l;
    int[] m;
    int n;
    int o;

    public bnqy(int i, int i2) {
        dbsk.l(i > 0);
        dbsk.l(i2 > 0);
        dbsk.l(true);
        dbsk.l(i > 0);
        this.a = i;
        this.b = i2;
        this.c = 1;
        this.d = (int) Math.ceil(i);
        this.e = new BitSet(i2);
        this.f = new BitSet(this.d * i2);
        this.h = -1;
        int[] iArr = new int[1024];
        this.i = iArr;
        this.j = new int[1024];
        this.k = -1;
        this.l = new int[i2];
        this.n = -1;
        this.o = 0;
        Arrays.fill(iArr, -1);
        Arrays.fill(this.j, -1);
        Arrays.fill(this.l, -1);
        this.m = new int[6144];
        for (int i3 = 0; i3 < 1024; i3++) {
            t(i3);
        }
        this.g = new int[768];
        for (int i4 = 0; i4 < 128; i4++) {
            v(i4);
        }
    }

    public static final int B(BitSet bitSet, int i, int i2, int i3) {
        while (i >= 0 && i2 - i >= i3) {
            int nextSetBit = bitSet.nextSetBit(i);
            if (nextSetBit == -1 || nextSetBit - i >= i3) {
                return i;
            }
            i = bitSet.nextClearBit(nextSetBit);
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnqy.A(int, int):int");
    }

    public final void C(int i, boolean z) {
        int a = bnqw.FLAGS.a(this.m, i);
        bnqw.FLAGS.b(this.m, i, z ? a | 2 : a & (-3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(int i) {
        return bnqx.NEXT.a(this.g, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        return bnqx.PREV.a(this.g, i);
    }

    final int c(int i) {
        return bnqx.Y.a(this.g, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i) {
        return bnqx.CELL_COUNT.a(this.g, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        bnqx.NEXT.b(this.g, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, int i2) {
        bnqx.PREV.b(this.g, i, i2);
    }

    final void g(int i, int i2) {
        bnqx.Y.b(this.g, i, i2);
    }

    final void h(int i, int i2) {
        bnqx.HEIGHT.b(this.g, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(int i, int i2) {
        bnqx.CELL_COUNT.b(this.g, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j(int i, int i2) {
        bnqx.HOLE_LIMIT.b(this.g, i, i2);
    }

    public final int k(int i) {
        return bnqw.X.a(this.m, i);
    }

    public final int l(int i) {
        return bnqw.Y.a(this.m, i);
    }

    public final int m(int i) {
        return bnqw.WIDTH.a(this.m, i);
    }

    public final int n(int i) {
        return bnqw.HEIGHT.a(this.m, i);
    }

    final void o(int i, int i2) {
        bnqw.NEXT.b(this.m, i, i2);
    }

    final void p(int i, int i2) {
        bnqw.X.b(this.m, i, i2);
    }

    final void q(int i, int i2) {
        bnqw.Y.b(this.m, i, i2);
    }

    final void r(int i, int i2) {
        bnqw.WIDTH.b(this.m, i, i2);
    }

    final void s(int i, int i2) {
        bnqw.HEIGHT.b(this.m, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t(int i) {
        boolean z = true;
        dbsk.l(i >= 0);
        if (i >= u()) {
            z = false;
        }
        dbsk.l(z);
        p(i, 0);
        q(i, 0);
        r(i, 0);
        s(i, 0);
        bnqw.FLAGS.b(this.m, i, 0);
        o(i, this.n);
        this.n = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int u() {
        return this.m.length / 6;
    }

    final void v(int i) {
        boolean z = true;
        dbsk.l(i >= 0);
        if (i >= w()) {
            z = false;
        }
        dbsk.l(z);
        g(i, 0);
        h(i, 0);
        i(i, 0);
        j(i, this.a);
        e(i, this.h);
        f(i, -1);
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int w() {
        return this.g.length / 6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x(int i, int i2) {
        boolean z = true;
        dbsk.l(i >= 0);
        dbsk.l(i < w());
        dbsk.l(i2 > 0);
        dbsk.l(a(i) == -1);
        if (b(i) != -1) {
            z = false;
        }
        dbsk.l(z);
        int[] iArr = this.j;
        int i3 = iArr[i2];
        if (i3 == -1) {
            this.i[i2] = i;
            iArr[i2] = i;
            return;
        }
        f(i, i3);
        e(i, -1);
        e(i3, i);
        this.j[i2] = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(int r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 < 0) goto L6
            r2 = 1
            goto L7
        L6:
            r2 = 0
        L7:
            defpackage.dbsk.l(r2)
            int r2 = r6.w()
            if (r7 >= r2) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            defpackage.dbsk.l(r2)
            if (r8 <= 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            defpackage.dbsk.l(r2)
            int r2 = r6.b(r7)
            int r3 = r6.a(r7)
            r4 = -1
            if (r2 != r4) goto L34
            int[] r2 = r6.i
            r2 = r2[r8]
            if (r2 != r7) goto L31
            r2 = -1
            goto L34
        L31:
            r2 = -1
            r5 = 0
            goto L35
        L34:
            r5 = 1
        L35:
            defpackage.dbsk.l(r5)
            if (r3 != r4) goto L43
            int[] r3 = r6.j
            r3 = r3[r8]
            if (r3 != r7) goto L41
            r0 = 1
        L41:
            r3 = -1
            goto L44
        L43:
            r0 = 1
        L44:
            defpackage.dbsk.l(r0)
            int[] r0 = r6.i
            r1 = r0[r8]
            if (r7 != r1) goto L54
            if (r3 < 0) goto L52
            r0[r8] = r3
            goto L54
        L52:
            r0[r8] = r4
        L54:
            int[] r0 = r6.j
            r1 = r0[r8]
            if (r7 != r1) goto L61
            if (r2 < 0) goto L5f
            r0[r8] = r2
            goto L61
        L5f:
            r0[r8] = r4
        L61:
            if (r2 == r4) goto L66
            r6.e(r2, r3)
        L66:
            if (r3 == r4) goto L6b
            r6.f(r3, r2)
        L6b:
            r6.f(r7, r4)
            r6.e(r7, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnqy.y(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void z(int i, int i2) {
        boolean z = true;
        dbsk.l(i >= 0);
        dbsk.l(i < w());
        dbsk.l(i2 > 0);
        if (d(i) != 0) {
            z = false;
        }
        dbsk.l(z);
        int c = c(i);
        this.l[c] = -1;
        this.e.clear(c, i2 + c);
        v(i);
    }
}
