package defpackage;
/* compiled from: PG */
/* renamed from: axdk  reason: default package */
/* loaded from: classes.dex */
public final class axdk extends dsqw<axdk, axdj> implements dssk {
    public static final axdk e;
    private static volatile dssr<axdk> g;
    public int a;
    public long b;
    public dvhs c;
    public dviq d;
    private byte f = 2;

    static {
        axdk axdkVar = new axdk();
        e = axdkVar;
        dsqw.cc(axdk.class, axdkVar);
    }

    private axdk() {
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
                return new axdk();
            }
            if (i2 == 4) {
                return new axdj();
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
            dssr<axdk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axdk.class) {
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
