package defpackage;
/* compiled from: PG */
/* renamed from: dnwr  reason: default package */
/* loaded from: classes6.dex */
public final class dnwr extends dsqw<dnwr, dnwq> implements dssk {
    public static final dnwr c;
    private static volatile dssr<dnwr> d;
    public int a;
    public String b = "";

    static {
        dnwr dnwrVar = new dnwr();
        c = dnwrVar;
        dsqw.cc(dnwr.class, dnwrVar);
    }

    private dnwr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnwr();
            }
            if (i2 == 4) {
                return new dnwq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnwr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnwr.class) {
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
