package defpackage;
/* compiled from: PG */
/* renamed from: dfhc  reason: default package */
/* loaded from: classes6.dex */
public final class dfhc extends dsqw<dfhc, dfhb> implements dssk {
    public static final dfhc c;
    private static volatile dssr<dfhc> d;
    public int a;
    public int b;

    static {
        dfhc dfhcVar = new dfhc();
        c = dfhcVar;
        dsqw.cc(dfhc.class, dfhcVar);
    }

    private dfhc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dfgy.a});
            }
            if (i2 == 3) {
                return new dfhc();
            }
            if (i2 == 4) {
                return new dfhb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfhc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfhc.class) {
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
