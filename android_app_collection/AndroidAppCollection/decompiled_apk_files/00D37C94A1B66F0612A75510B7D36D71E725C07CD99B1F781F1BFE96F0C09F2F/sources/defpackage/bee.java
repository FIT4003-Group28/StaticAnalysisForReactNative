package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bee  reason: default package */
/* loaded from: classes2.dex */
public final class bee implements aze {
    public final List a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final SparseBooleanArray d;
    public azh e;
    public int f;
    public boolean g;
    public int h;
    public final cns i;
    private final pwu j;
    private final SparseIntArray k;
    private final beb l;
    private boolean m;
    private boolean n;
    private int o;
    private ayx p;

    public bee() {
        this(null);
    }

    @Override // defpackage.aze
    public final void e(azh azhVar) {
        this.e = azhVar;
    }

    @Override // defpackage.aze
    public final void f() {
    }

    @Override // defpackage.aze
    public final void g(long j, long j2) {
        ayx ayxVar;
        ptx.e(true);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            pxg pxgVar = (pxg) this.a.get(i);
            if (pxgVar.e() != -9223372036854775807L) {
                long c = pxgVar.c();
                if (c != -9223372036854775807L) {
                    if (c != 0) {
                        if (c == j2) {
                        }
                    }
                }
            }
            pxgVar.f(j2);
        }
        if (j2 != 0 && (ayxVar = this.p) != null) {
            ayxVar.b(j2);
        }
        this.j.C(0);
        this.k.clear();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            ((beg) this.b.valueAt(i2)).c();
        }
        this.o = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = r2 + 1;
     */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(defpackage.azf r7) {
        /*
            r6 = this;
            pwu r0 = r6.j
            byte[] r0 = r0.a
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.j(r0, r1, r2)
            r2 = 0
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r2 >= r3) goto L27
            r3 = 0
        L10:
            r4 = 5
            if (r3 >= r4) goto L22
            int r4 = r3 * 188
            int r4 = r4 + r2
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L1f
            int r2 = r2 + 1
            goto Lb
        L1f:
            int r3 = r3 + 1
            goto L10
        L22:
            r7.m(r2)
            r7 = 1
            return r7
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bee.h(azf):boolean");
    }

    public bee(byte[] bArr) {
        pxg pxgVar = new pxg(0L);
        this.i = new cns((byte[]) null);
        this.a = Collections.singletonList(pxgVar);
        this.j = new pwu(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.c = sparseBooleanArray;
        this.d = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.b = sparseArray;
        this.k = new SparseIntArray();
        this.l = new beb();
        this.h = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.b.put(sparseArray2.keyAt(i), (beg) sparseArray2.valueAt(i));
        }
        this.b.put(0, new bdy(new bec(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0295, code lost:
        if (r2 == false) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    @Override // defpackage.aze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(defpackage.azf r28, defpackage.azv r29) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bee.d(azf, azv):int");
    }
}
