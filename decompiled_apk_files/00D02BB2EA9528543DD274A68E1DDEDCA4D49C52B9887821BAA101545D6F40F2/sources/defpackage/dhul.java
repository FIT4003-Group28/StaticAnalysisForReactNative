package defpackage;
/* compiled from: PG */
/* renamed from: dhul  reason: default package */
/* loaded from: classes6.dex */
public final class dhul extends dsqw<dhul, dhuk> implements dssk {
    public static final dhul c;
    private static volatile dssr<dhul> d;
    public int a;
    public String b = "";

    static {
        dhul dhulVar = new dhul();
        c = dhulVar;
        dsqw.cc(dhul.class, dhulVar);
    }

    private dhul() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dhul();
            }
            if (i2 == 4) {
                return new dhuk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhul> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhul.class) {
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
