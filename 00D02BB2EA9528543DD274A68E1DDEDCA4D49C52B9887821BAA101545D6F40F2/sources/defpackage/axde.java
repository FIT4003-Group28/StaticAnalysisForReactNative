package defpackage;
/* compiled from: PG */
/* renamed from: axde  reason: default package */
/* loaded from: classes.dex */
public final class axde extends dsqw<axde, axdd> implements dssk {
    public static final axde e;
    private static volatile dssr<axde> g;
    public int a;
    public long b;
    public dvho c;
    public dviq d;
    private byte f = 2;

    static {
        axde axdeVar = new axde();
        e = axdeVar;
        dsqw.cc(axde.class, axdeVar);
    }

    private axde() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new axde();
            }
            if (i2 == 4) {
                return new axdd();
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
            dssr<axde> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axde.class) {
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
