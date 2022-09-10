package defpackage;
/* compiled from: PG */
/* renamed from: dhlo  reason: default package */
/* loaded from: classes6.dex */
public final class dhlo extends dsqw<dhlo, dhln> implements dssk {
    public static final dhlo c;
    private static volatile dssr<dhlo> d;
    public int a;
    public String b = "";

    static {
        dhlo dhloVar = new dhlo();
        c = dhloVar;
        dsqw.cc(dhlo.class, dhloVar);
    }

    private dhlo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhlo();
            }
            if (i2 == 4) {
                return new dhln();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhlo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhlo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
