package defpackage;
/* compiled from: PG */
/* renamed from: axdz  reason: default package */
/* loaded from: classes.dex */
public final class axdz extends dsqw<axdz, axdy> implements dssk {
    public static final axdz e;
    private static volatile dssr<axdz> g;
    public int a;
    public long b;
    public dviz c;
    public dviq d;
    private byte f = 2;

    static {
        axdz axdzVar = new axdz();
        e = axdzVar;
        dsqw.cc(axdz.class, axdzVar);
    }

    private axdz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဂ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new axdz();
            }
            if (i2 == 4) {
                return new axdy();
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
            dssr<axdz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (axdz.class) {
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
