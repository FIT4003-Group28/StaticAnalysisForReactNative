package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
/* compiled from: PG */
/* renamed from: pau  reason: default package */
/* loaded from: classes4.dex */
public final class pau implements oxq {
    public static final long a = pcx.c("AC-3");
    public static final long b = pcx.c("EAC3");
    public static final long c = pcx.c("HEVC");
    public int g;
    private oxr k;
    public final pao d = new pao();
    private final pct h = new pct(940);
    private final pcs i = new pcs(new byte[3]);
    final SparseArray e = new SparseArray();
    final SparseBooleanArray f = new SparseBooleanArray();
    private final SparseIntArray j = new SparseIntArray();

    public pau() {
        b();
    }

    private final void b() {
        this.f.clear();
        this.e.clear();
        this.e.put(0, new paq(this));
        this.g = 8192;
    }

    @Override // defpackage.oxq
    public final void a(oxr oxrVar) {
        this.k = oxrVar;
        oxrVar.pS(oye.f);
    }

    @Override // defpackage.oxq
    public final void d() {
        this.d.b();
        this.h.v();
        this.j.clear();
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        r2 = r2 + 1;
     */
    @Override // defpackage.oxq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.oxn r7) {
        /*
            r6 = this;
            pct r0 = r6.h
            byte[] r0 = r0.a
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.g(r0, r1, r2)
            r2 = 0
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L27
            r3 = 0
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.j(r2)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r2 = r2 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pau.f(oxn):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    @Override // defpackage.oxq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.oxn r10, defpackage.oxz r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pau.e(oxn, oxz):int");
    }
}
