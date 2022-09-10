package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: clxq  reason: default package */
/* loaded from: classes5.dex */
public final class clxq implements clun, clvg {
    public static final /* synthetic */ int a = 0;
    private final cmnk b;
    private final cmnk c;
    private final cmnk d;
    private final cmnk e;
    private final ArrayDeque<clwx> f;
    private final List<Metadata.Entry> g;
    private int h;
    private int i;
    private long j;
    private int k;
    private cmnk l;
    private int m;
    private int n;
    private int o;
    private int p;
    private clup q;
    private clxp[] r;
    private long[][] s;
    private int t;
    private long u;
    private int v;

    static {
        int i = clxo.a;
    }

    public clxq() {
        this(null);
    }

    private final void h() {
        this.h = 0;
        this.k = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0185 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void i(long r28) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxq.i(long):void");
    }

    private static long j(clxx clxxVar, long j, long j2) {
        int k = k(clxxVar, j);
        return k == -1 ? j2 : Math.min(clxxVar.c[k], j2);
    }

    private static int k(clxx clxxVar, long j) {
        int a2 = clxxVar.a(j);
        return a2 == -1 ? clxxVar.b(j) : a2;
    }

    private static int l(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // defpackage.clvg
    public final boolean a() {
        return true;
    }

    @Override // defpackage.clvg
    public final clve b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((clxp[]) cmmn.f(this.r)).length == 0) {
            clvh clvhVar = clvh.a;
            return new clve(clvhVar, clvhVar);
        }
        int i = this.t;
        if (i != -1) {
            clxx clxxVar = this.r[i].b;
            int k = k(clxxVar, j);
            if (k == -1) {
                clvh clvhVar2 = clvh.a;
                return new clve(clvhVar2, clvhVar2);
            }
            long j6 = clxxVar.f[k];
            j2 = clxxVar.c[k];
            if (j6 >= j || k >= clxxVar.b - 1 || (b = clxxVar.b(j)) == -1 || b == k) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = clxxVar.f[b];
                j5 = clxxVar.c[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            clxp[] clxpVarArr = this.r;
            if (i2 >= clxpVarArr.length) {
                break;
            }
            if (i2 != this.t) {
                clxx clxxVar2 = clxpVarArr[i2].b;
                long j7 = j(clxxVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = j(clxxVar2, j4, j3);
                }
                j2 = j7;
            }
            i2++;
        }
        clvh clvhVar3 = new clvh(j, j2);
        if (j4 == -9223372036854775807L) {
            return new clve(clvhVar3, clvhVar3);
        }
        return new clve(clvhVar3, new clvh(j4, j3));
    }

    @Override // defpackage.clvg
    public final long c() {
        return this.u;
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.q = clupVar;
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        this.f.clear();
        this.k = 0;
        this.m = -1;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        if (j == 0) {
            h();
            return;
        }
        clxp[] clxpVarArr = this.r;
        if (clxpVarArr == null) {
            return;
        }
        for (clxp clxpVar : clxpVarArr) {
            clxx clxxVar = clxpVar.b;
            int a2 = clxxVar.a(j2);
            if (a2 == -1) {
                a2 = clxxVar.b(j2);
            }
            clxpVar.d = a2;
        }
    }

    @Override // defpackage.clun
    public final boolean f(cluk clukVar) {
        return clxt.a(clukVar, false);
    }

    public clxq(byte[] bArr) {
        this.h = 0;
        new clxs();
        this.g = new ArrayList();
        this.e = new cmnk(16);
        this.f = new ArrayDeque<>();
        this.b = new cmnk(cmni.a);
        this.c = new cmnk(4);
        this.d = new cmnk();
        this.m = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x0333, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:251:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    @Override // defpackage.clun
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.cluk r30, defpackage.clvd r31) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clxq.g(cluk, clvd):int");
    }
}
