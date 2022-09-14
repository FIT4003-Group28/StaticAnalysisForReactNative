package defpackage;
/* compiled from: PG */
/* renamed from: drpq  reason: default package */
/* loaded from: classes6.dex */
public final class drpq extends dsqw<drpq, drpp> implements dssk {
    public static final drpq c;
    private static volatile dssr<drpq> d;
    public int a;
    public String b = "";

    static {
        drpq drpqVar = new drpq();
        c = drpqVar;
        dsqw.cc(drpq.class, drpqVar);
    }

    private drpq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drpq();
            }
            if (i2 == 4) {
                return new drpp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drpq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drpq.class) {
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
