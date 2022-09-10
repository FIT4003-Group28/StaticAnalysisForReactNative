package defpackage;
/* compiled from: PG */
/* renamed from: drdi  reason: default package */
/* loaded from: classes.dex */
public final class drdi extends dsqw<drdi, drdh> implements dssk {
    public static final drdi d;
    private static volatile dssr<drdi> m;
    public int a;
    public boolean b;
    public drda c;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;
    private boolean j;
    private int k;
    private boolean l;

    static {
        drdi drdiVar = new drdi();
        d = drdiVar;
        dsqw.cc(drdi.class, drdiVar);
    }

    private drdi() {
    }

    public static /* synthetic */ void b(drdi drdiVar) {
        drdiVar.a |= 64;
        drdiVar.h = 1;
    }

    public static /* synthetic */ void c(drdi drdiVar) {
        drdiVar.a |= 256;
        drdiVar.i = true;
    }

    public static /* synthetic */ void d(drdi drdiVar) {
        drdiVar.a |= 512;
        drdiVar.j = true;
    }

    public static /* synthetic */ void e(drdi drdiVar) {
        drdiVar.a |= 1024;
        drdiVar.k = 1;
    }

    public static /* synthetic */ void f(drdi drdiVar) {
        drdiVar.a |= 2;
        drdiVar.e = true;
    }

    public static /* synthetic */ void g(drdi drdiVar) {
        drdiVar.a |= 16384;
        drdiVar.l = true;
    }

    public static /* synthetic */ void h(drdi drdiVar) {
        drdiVar.a |= 8;
        drdiVar.f = true;
    }

    public static /* synthetic */ void i(drdi drdiVar) {
        drdiVar.a |= 16;
        drdiVar.g = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\n\u0000\u0001\u0002\r\n\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0003\u0004ဇ\u0004\u0005ဇ\u0005\u0006င\u0006\u0007ဉ\u0007\bဇ\b\tဇ\t\nင\n\rဇ\u000e", new Object[]{"a", "e", "f", "g", "b", "h", "c", "i", "j", "k", "l"});
            }
            if (i2 == 3) {
                return new drdi();
            }
            if (i2 == 4) {
                return new drdh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drdi> dssrVar = m;
            if (dssrVar == null) {
                synchronized (drdi.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
