package defpackage;
/* compiled from: PG */
/* renamed from: chve  reason: default package */
/* loaded from: classes4.dex */
public final class chve extends dsqw<chve, chvb> implements dssk {
    public static final chve e;
    private static volatile dssr<chve> g;
    public int a;
    public int b;
    public chxr c;
    public dwjb d;
    private byte f = 2;

    static {
        chve chveVar = new chve();
        e = chveVar;
        dsqw.cc(chve.class, chveVar);
    }

    private chve() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", chvd.c(), "c", "d"});
            }
            if (i2 == 3) {
                return new chve();
            }
            if (i2 == 4) {
                return new chvb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<chve> dssrVar = g;
            if (dssrVar == null) {
                synchronized (chve.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
