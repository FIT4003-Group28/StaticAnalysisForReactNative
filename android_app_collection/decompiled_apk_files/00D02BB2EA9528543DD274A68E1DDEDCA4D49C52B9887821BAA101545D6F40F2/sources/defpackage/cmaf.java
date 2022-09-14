package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmaf  reason: default package */
/* loaded from: classes5.dex */
public final class cmaf implements clun {
    public final List<cmnv> a;
    public final cmai b;
    public final SparseArray<cmak> c;
    public final SparseBooleanArray d;
    public final SparseBooleanArray e;
    public clup f;
    public int g;
    public boolean h;
    public int i;
    private final cmnk j;
    private final SparseIntArray k;
    private final cmab l;
    private cmaa m;
    private boolean n;
    private boolean o;
    private int p;

    static {
        int i = cmac.a;
    }

    public cmaf() {
        this(null);
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.f = clupVar;
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        cmaa cmaaVar;
        cmmn.c(true);
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            cmnv cmnvVar = this.a.get(i);
            if (cmnvVar.b() == -9223372036854775807L || (cmnvVar.b() != 0 && cmnvVar.a != j2)) {
                cmnvVar.c();
                cmnvVar.a(j2);
            }
        }
        if (j2 != 0 && (cmaaVar = this.m) != null) {
            cmaaVar.a(j2);
        }
        this.j.a(0);
        this.k.clear();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            this.c.valueAt(i2).b();
        }
        this.p = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = r2 + 1;
     */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(defpackage.cluk r7) {
        /*
            r6 = this;
            cmnk r0 = r6.j
            byte[] r0 = r0.a
            r1 = 0
            r2 = 940(0x3ac, float:1.317E-42)
            r7.f(r0, r1, r2)
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
            r7.d(r2)
            r7 = 1
            return r7
        L27:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmaf.f(cluk):boolean");
    }

    public cmaf(byte[] bArr) {
        cmnv cmnvVar = new cmnv(0L);
        this.b = new clyw(null);
        this.a = Collections.singletonList(cmnvVar);
        this.j = new cmnk(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.d = sparseBooleanArray;
        this.e = new SparseBooleanArray();
        SparseArray<cmak> sparseArray = new SparseArray<>();
        this.c = sparseArray;
        this.k = new SparseIntArray();
        this.l = new cmab();
        this.i = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            this.c.put(sparseArray2.keyAt(i), (cmak) sparseArray2.valueAt(i));
        }
        this.c.put(0, new clzx(new cmad(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0252, code lost:
        if (r1 == false) goto L127;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.cluk r21, defpackage.clvd r22) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmaf.g(cluk, clvd):int");
    }
}
