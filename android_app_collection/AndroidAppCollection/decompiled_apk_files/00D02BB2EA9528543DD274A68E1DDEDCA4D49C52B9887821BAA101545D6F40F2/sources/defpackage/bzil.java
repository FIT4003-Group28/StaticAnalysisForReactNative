package defpackage;
/* compiled from: PG */
/* renamed from: bzil  reason: default package */
/* loaded from: classes4.dex */
public final class bzil extends dsqw<bzil, bzij> implements dssk {
    public static final bzil e;
    private static volatile dssr<bzil> g;
    public int a;
    public bzhr b;
    public bzig c;
    public int d;
    private byte f = 2;

    static {
        bzil bzilVar = new bzil();
        e = bzilVar;
        dsqw.cc(bzil.class, bzilVar);
    }

    private bzil() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bzik.a});
            }
            if (i2 == 3) {
                return new bzil();
            }
            if (i2 == 4) {
                return new bzij();
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
            dssr<bzil> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bzil.class) {
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
