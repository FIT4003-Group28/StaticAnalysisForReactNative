package defpackage;
/* compiled from: PG */
/* renamed from: dfii  reason: default package */
/* loaded from: classes6.dex */
public final class dfii extends dsqw<dfii, dfif> implements dssk {
    public static final dfii d;
    private static volatile dssr<dfii> e;
    public int a;
    public boolean b;
    public dfih c;

    static {
        dfii dfiiVar = new dfii();
        d = dfiiVar;
        dsqw.cc(dfii.class, dfiiVar);
    }

    private dfii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfii();
            }
            if (i2 == 4) {
                return new dfif();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfii> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfii.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}