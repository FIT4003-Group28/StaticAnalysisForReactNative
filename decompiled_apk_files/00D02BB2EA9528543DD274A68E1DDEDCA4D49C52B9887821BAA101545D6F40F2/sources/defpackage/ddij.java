package defpackage;
/* compiled from: PG */
/* renamed from: ddij  reason: default package */
/* loaded from: classes.dex */
public final class ddij extends dsqw<ddij, ddii> implements dssk {
    public static final ddij e;
    private static volatile dssr<ddij> g;
    public int a;
    public long b;
    public dtbk d;
    private byte f = 2;
    public String c = "";

    static {
        ddij ddijVar = new ddij();
        e = ddijVar;
        dsqw.cc(ddij.class, ddijVar);
    }

    private ddij() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new ddij();
            }
            if (i2 == 4) {
                return new ddii();
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
            dssr<ddij> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ddij.class) {
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
