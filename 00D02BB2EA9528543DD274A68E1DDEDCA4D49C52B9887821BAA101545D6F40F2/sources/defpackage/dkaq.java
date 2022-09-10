package defpackage;
/* compiled from: PG */
/* renamed from: dkaq  reason: default package */
/* loaded from: classes6.dex */
public final class dkaq extends dsqw<dkaq, dkap> implements dssk {
    public static final dkaq g;
    private static volatile dssr<dkaq> i;
    public int a;
    public Object c;
    public int d;
    public int e;
    public dnqh f;
    public int b = 0;
    private byte h = 2;

    static {
        dkaq dkaqVar = new dkaq();
        g = dkaqVar;
        dsqw.cc(dkaq.class, dkaqVar);
    }

    private dkaq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            byte b = 1;
            if (i3 == 2) {
                return cd(g, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001ြ\u0000\u0002ဌ\u0002\u0003ᐉ\u0004\u0005ဌ\u0003\u0006ျ\u0000", new Object[]{"c", "b", "a", dpov.class, "d", dpqw.c(), "f", "e", dpqw.c()});
            }
            if (i3 == 3) {
                return new dkaq();
            }
            if (i3 == 4) {
                return new dkap();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.h = b;
                return null;
            }
            dssr<dkaq> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dkaq.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.h);
    }
}
