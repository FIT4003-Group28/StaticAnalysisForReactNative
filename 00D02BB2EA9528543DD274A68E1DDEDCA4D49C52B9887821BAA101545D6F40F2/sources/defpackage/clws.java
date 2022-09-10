package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
/* compiled from: PG */
/* renamed from: clws  reason: default package */
/* loaded from: classes5.dex */
public final class clws implements clun {
    public boolean a;
    private final cmnk b;
    private final clss c;
    private final clva d;
    private final clvb e;
    private final clvk f;
    private clup g;
    private clvk h;
    private clvk i;
    private int j;
    private Metadata k;
    private long l;
    private long m;
    private long n;
    private int o;
    private clwu p;

    static {
        int i = clwr.a;
    }

    public clws() {
        this(null);
    }

    private final long a(long j) {
        return this.l + ((j * 1000000) / this.c.d);
    }

    private static boolean b(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int c(defpackage.cluk r40) {
        /*
            Method dump skipped, instructions count: 952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clws.c(cluk):int");
    }

    private final boolean h(cluk clukVar, boolean z) {
        int i;
        int i2;
        int a;
        int i3 = true != z ? 131072 : 32768;
        clukVar.i();
        if (clukVar.c == 0) {
            Metadata a2 = this.e.a(clukVar, null);
            this.k = a2;
            if (a2 != null) {
                this.d.b(a2);
            }
            i2 = (int) clukVar.j();
            if (!z) {
                clukVar.d(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!i(clukVar)) {
                this.b.f(0);
                int r = this.b.r();
                if ((i == 0 || b(r, i)) && (a = clst.a(r)) != -1) {
                    i4++;
                    if (i4 != 1) {
                        if (i4 == 4) {
                            break;
                        }
                    } else {
                        this.c.a(r);
                        i = r;
                    }
                    clukVar.h(a - 4);
                } else {
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (!z) {
                            throw new clob("Searched too many bytes.");
                        }
                        return false;
                    }
                    if (z) {
                        clukVar.i();
                        clukVar.h(i2 + i6);
                    } else {
                        clukVar.d(1);
                    }
                    i5 = i6;
                    i = 0;
                    i4 = 0;
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            clukVar.d(i2 + i5);
        } else {
            clukVar.i();
        }
        this.j = i;
        return true;
    }

    private final boolean i(cluk clukVar) {
        clwu clwuVar = this.p;
        if (clwuVar != null) {
            long f = clwuVar.f();
            if (f != -1 && clukVar.j() > f - 4) {
                return true;
            }
        }
        try {
            return !clukVar.e(this.b.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final clwu j(cluk clukVar) {
        clukVar.f(this.b.a, 0, 4);
        this.b.f(0);
        this.c.a(this.b.r());
        return new clwo(clukVar.b, clukVar.c, this.c);
    }

    @Override // defpackage.clun
    public final void d(clup clupVar) {
        this.g = clupVar;
        clvk RT = clupVar.RT(0);
        this.h = RT;
        this.i = RT;
        this.g.RS();
    }

    @Override // defpackage.clun
    public final void e(long j, long j2) {
        this.j = 0;
        this.l = -9223372036854775807L;
        this.m = 0L;
        this.o = 0;
        clwu clwuVar = this.p;
        if (!(clwuVar instanceof clwp)) {
            return;
        }
        clwp clwpVar = (clwp) clwuVar;
        throw null;
    }

    @Override // defpackage.clun
    public final boolean f(cluk clukVar) {
        return h(clukVar, true);
    }

    @Override // defpackage.clun
    public final int g(cluk clukVar, clvd clvdVar) {
        cmmn.e(this.h);
        int i = cmny.a;
        int c = c(clukVar);
        if (c == -1) {
            if (this.p instanceof clwp) {
                if (this.p.c() != a(this.m)) {
                    clwp clwpVar = (clwp) this.p;
                    throw null;
                }
            }
            return -1;
        }
        return c;
    }

    public clws(byte[] bArr) {
        this.b = new cmnk(10);
        this.c = new clss();
        this.d = new clva();
        this.l = -9223372036854775807L;
        this.e = new clvb();
        clum clumVar = new clum();
        this.f = clumVar;
        this.i = clumVar;
    }
}
