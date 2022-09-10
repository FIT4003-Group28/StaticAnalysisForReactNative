package defpackage;
/* compiled from: PG */
/* renamed from: ddro  reason: default package */
/* loaded from: classes6.dex */
public final class ddro extends dsqw<ddro, ddrn> implements dssk {
    public static final ddro h;
    private static volatile dssr<ddro> p;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    static {
        ddro ddroVar = new ddro();
        h = ddroVar;
        dsqw.cc(ddro.class, ddroVar);
    }

    private ddro() {
    }

    public static /* synthetic */ void b(ddro ddroVar) {
        ddroVar.a |= 32;
        ddroVar.i = true;
    }

    public static /* synthetic */ void c(ddro ddroVar) {
        ddroVar.a |= 64;
        ddroVar.j = true;
    }

    public static /* synthetic */ void d(ddro ddroVar) {
        ddroVar.a |= 128;
        ddroVar.k = true;
    }

    public static /* synthetic */ void e(ddro ddroVar) {
        ddroVar.a |= 256;
        ddroVar.l = true;
    }

    public static /* synthetic */ void f(ddro ddroVar) {
        ddroVar.a |= 512;
        ddroVar.m = true;
    }

    public static /* synthetic */ void g(ddro ddroVar) {
        ddroVar.a |= 1024;
        ddroVar.n = true;
    }

    public static /* synthetic */ void h(ddro ddroVar) {
        ddroVar.a |= 4096;
        ddroVar.o = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(h, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f", new Object[]{"a", "b", "c", "d", "e", "f", "i", "j", "k", "l", "m", "n", "g", "o"});
            }
            if (i2 == 3) {
                return new ddro();
            }
            if (i2 == 4) {
                return new ddrn();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddro> dssrVar = p;
            if (dssrVar == null) {
                synchronized (ddro.class) {
                    dssrVar = p;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        p = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
