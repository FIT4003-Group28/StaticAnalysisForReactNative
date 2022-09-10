package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
/* compiled from: PG */
/* renamed from: ikk  reason: default package */
/* loaded from: classes6.dex */
final class ikk extends pg {
    final /* synthetic */ ikl b;

    public ikk(ikl iklVar) {
        this.b = iklVar;
    }

    private final pc d(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.b.b, i);
        pc pcVar = obtain != null ? new pc((Object) obtain) : null;
        pcVar.v(true);
        pcVar.q(true);
        pcVar.T();
        pcVar.B(SeekBar.class.getName());
        pcVar.z(this.b.b.getContext().getPackageName());
        pcVar.i(this.b.b);
        pcVar.f(4096);
        pcVar.f(8192);
        if (this.b.f == i) {
            pcVar.s(true);
            pcVar.f(128);
        } else {
            pcVar.s(false);
            pcVar.f(64);
        }
        return pcVar;
    }

    @Override // defpackage.pg
    @dzsi
    public final pc a(int i) {
        if (i == -1) {
            pc b = pc.b(this.b.b);
            od.b(this.b.b, b);
            b.v(true);
            b.q(true);
            b.e(this.b.b, 0);
            b.e(this.b.b, 1);
            if (!this.b.g.isEmpty()) {
                b.G(this.b.g);
            }
            b.k(this.b.l());
            b.m(this.b.m());
            return b;
        } else if (i == 0) {
            pc d = d(0);
            if (!this.b.h.isEmpty()) {
                d.G(this.b.h);
            }
            d.k(this.b.j);
            ikl iklVar = this.b;
            d.m(iklVar.n(iklVar.j));
            iki ikiVar = this.b.b;
            d.J(pb.a(ikiVar.e, ikiVar.f, ikiVar.g));
            return d;
        } else if (i != 1) {
            return null;
        } else {
            pc d2 = d(1);
            if (!this.b.i.isEmpty()) {
                d2.G(this.b.i);
            }
            d2.k(this.b.k);
            ikl iklVar2 = this.b;
            d2.m(iklVar2.n(iklVar2.k));
            iki ikiVar2 = this.b.b;
            d2.J(pb.a(ikiVar2.e, ikiVar2.f, ikiVar2.h));
            return d2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r6 != 4096) goto L21;
     */
    @Override // defpackage.pg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(int r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            r0 = -1
            if (r5 != r0) goto Lc
            ikl r5 = r4.b
            iki r5 = r5.b
            boolean r5 = r5.performAccessibilityAction(r6, r7)
            return r5
        Lc:
            r7 = 64
            r1 = 0
            r2 = 1
            if (r6 == r7) goto L92
            r7 = 128(0x80, float:1.794E-43)
            if (r6 == r7) goto L83
            r7 = 8192(0x2000, float:1.14794E-41)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r6 == r3) goto L1f
            if (r6 == r7) goto L1f
            return r1
        L1f:
            if (r5 == 0) goto L25
            if (r5 == r2) goto L24
            goto L78
        L24:
            r5 = 1
        L25:
            if (r6 == r7) goto L2a
            if (r6 == r3) goto L2d
            goto L78
        L2a:
            if (r6 == r3) goto L2d
            goto L2e
        L2d:
            r0 = 1
        L2e:
            ikl r6 = r4.b
            iki r7 = r6.b
            int r1 = r7.f
            int r3 = r7.e
            int r1 = r1 - r3
            int r1 = r1 * 5
            float r1 = (float) r1
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            int r1 = (int) r1
            int r0 = r0 * r1
            if (r5 != 0) goto L57
            ikb r6 = r6.e
            int r1 = r7.g
            int r7 = r7.h
            ikc r3 = defpackage.ikc.MIN
            int r1 = r1 + r0
            int r6 = r6.a(r1, r7, r3)
            ikl r7 = r4.b
            iki r7 = r7.b
            r7.setSelectedMin(r6)
            goto L6b
        L57:
            ikb r6 = r6.e
            int r1 = r7.g
            int r7 = r7.h
            ikc r3 = defpackage.ikc.MAX
            int r7 = r7 + r0
            int r6 = r6.a(r1, r7, r3)
            ikl r7 = r4.b
            iki r7 = r7.b
            r7.setSelectedMax(r6)
        L6b:
            ikl r6 = r4.b
            r7 = 4
            r6.k(r7, r5)
            ikl r5 = r4.b
            ikd r6 = r5.l
            if (r6 != 0) goto L79
            r1 = 1
        L78:
            return r1
        L79:
            iki r5 = r5.b
            int r7 = r5.g
            int r5 = r5.h
            r6.a(r7, r5, r2)
            return r2
        L83:
            ikl r6 = r4.b
            int r7 = r6.f
            if (r7 == r5) goto L8a
            return r1
        L8a:
            r6.f = r0
            r7 = 65536(0x10000, float:9.18355E-41)
            r6.k(r7, r5)
            return r2
        L92:
            ikl r6 = r4.b
            int r7 = r6.f
            if (r7 != r5) goto L99
            return r1
        L99:
            r6.f = r5
            r7 = 32768(0x8000, float:4.5918E-41)
            r6.k(r7, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikk.b(int, int, android.os.Bundle):boolean");
    }
}
