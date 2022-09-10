package defpackage;
/* compiled from: PG */
/* renamed from: dfnd  reason: default package */
/* loaded from: classes6.dex */
public final class dfnd extends dsqw<dfnd, dfnc> implements dssk {
    public static final dfnd a;
    private static volatile dssr<dfnd> b;

    static {
        dfnd dfndVar = new dfnd();
        a = dfndVar;
        dsqw.cc(dfnd.class, dfndVar);
    }

    private dfnd() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfnd();
            }
            if (i2 == 4) {
                return new dfnc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfnd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfnd.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
