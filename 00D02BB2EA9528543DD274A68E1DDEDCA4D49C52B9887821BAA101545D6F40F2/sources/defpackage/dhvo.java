package defpackage;
/* compiled from: PG */
/* renamed from: dhvo  reason: default package */
/* loaded from: classes6.dex */
public final class dhvo extends dsqw<dhvo, dhvn> implements dssk {
    public static final dhvo c;
    private static volatile dssr<dhvo> d;
    public int a;
    public String b = "";

    static {
        dhvo dhvoVar = new dhvo();
        c = dhvoVar;
        dsqw.cc(dhvo.class, dhvoVar);
    }

    private dhvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhvo();
            }
            if (i2 == 4) {
                return new dhvn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhvo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhvo.class) {
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
