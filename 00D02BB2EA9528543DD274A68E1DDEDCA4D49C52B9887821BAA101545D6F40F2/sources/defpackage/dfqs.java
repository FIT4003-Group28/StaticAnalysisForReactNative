package defpackage;
/* compiled from: PG */
/* renamed from: dfqs  reason: default package */
/* loaded from: classes6.dex */
public final class dfqs extends dsqw<dfqs, dfqr> implements dssk {
    public static final dfqs c;
    private static volatile dssr<dfqs> d;
    public int a;
    public String b = "";

    static {
        dfqs dfqsVar = new dfqs();
        c = dfqsVar;
        dsqw.cc(dfqs.class, dfqsVar);
    }

    private dfqs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfqs();
            }
            if (i2 == 4) {
                return new dfqr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfqs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfqs.class) {
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
