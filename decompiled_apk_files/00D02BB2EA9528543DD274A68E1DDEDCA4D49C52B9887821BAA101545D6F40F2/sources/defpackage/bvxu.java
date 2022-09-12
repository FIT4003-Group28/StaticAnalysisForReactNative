package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bvxu */
/* loaded from: classes4.dex */
public final class bvxu extends dsqw<bvxu, bvxn> implements dssk {
    public static final bvxu A;
    private static volatile dssr<bvxu> B;
    public int a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean g;
    public boolean i;
    public dkyx j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public bvxm t;
    public int u;
    public boolean v;
    public bvxt w;
    public bvxp x;
    public bvxp y;
    public int z;
    public String b = "";
    public int f = 2;
    public String h = "";
    public String o = "";

    static {
        bvxu bvxuVar = new bvxu();
        A = bvxuVar;
        dsqw.cc(bvxu.class, bvxuVar);
    }

    private bvxu() {
    }

    public static /* synthetic */ void b(bvxu bvxuVar) {
        bvxuVar.a |= 128;
        bvxuVar.i = true;
    }

    public static /* synthetic */ void c(bvxu bvxuVar) {
        bvxuVar.a |= 1024;
        bvxuVar.l = true;
    }

    public static /* synthetic */ void d(bvxu bvxuVar) {
        bvxuVar.a |= 4096;
        bvxuVar.n = true;
    }

    public static /* synthetic */ void e(bvxu bvxuVar) {
        bvxuVar.a |= ImageMetadata.SHADING_MODE;
        bvxuVar.v = false;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(A, "\u0001\u0019\u0000\u0001\u0001\u001d\u0019\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0004င\u0004\u0006ဇ\u0005\u0007ဈ\u0006\tဇ\u0007\nဉ\b\fဇ\t\rဇ\u000b\u000eဇ\f\u000fဈ\r\u0010ဇ\u000e\u0011ဇ\n\u0012ဇ\u000f\u0013ဇ\u0010\u0014ဇ\u0011\u0015ဉ\u0012\u0017င\u0013\u0018ဇ\u0014\u0019ဉ\u0015\u001aဉ\u0016\u001bဉ\u0017\u001cဇ\u0001\u001dဌ\u0018", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "p", "l", "q", "r", "s", "t", "u", "v", "w", "x", "y", "c", "z", dszg.c()});
            }
            if (i2 == 3) {
                return new bvxu();
            }
            if (i2 == 4) {
                return new bvxn();
            }
            if (i2 == 5) {
                return A;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bvxu> dssrVar = B;
            if (dssrVar == null) {
                synchronized (bvxu.class) {
                    dssrVar = B;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(A);
                        B = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
