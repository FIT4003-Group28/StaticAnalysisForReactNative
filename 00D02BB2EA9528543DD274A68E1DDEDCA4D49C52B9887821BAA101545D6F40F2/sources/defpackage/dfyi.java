package defpackage;
/* compiled from: PG */
/* renamed from: dfyi  reason: default package */
/* loaded from: classes6.dex */
public final class dfyi extends dsqw<dfyi, dfyf> implements dssk {
    public static final dfyi c;
    private static volatile dssr<dfyi> d;
    public int a;
    public int b;

    static {
        dfyi dfyiVar = new dfyi();
        c = dfyiVar;
        dsqw.cc(dfyi.class, dfyiVar);
    }

    private dfyi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dfyg.a});
            }
            if (i2 == 3) {
                return new dfyi();
            }
            if (i2 == 4) {
                return new dfyf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfyi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfyi.class) {
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
