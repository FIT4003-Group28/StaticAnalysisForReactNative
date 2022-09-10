package defpackage;
/* compiled from: PG */
/* renamed from: dfwz  reason: default package */
/* loaded from: classes6.dex */
public final class dfwz extends dsqw<dfwz, dfwy> implements dssk {
    public static final dfwz d;
    private static volatile dssr<dfwz> e;
    public int a;
    public double b;
    public double c;

    static {
        dfwz dfwzVar = new dfwz();
        d = dfwzVar;
        dsqw.cc(dfwz.class, dfwzVar);
    }

    private dfwz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003က\u0000\u0004က\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfwz();
            }
            if (i2 == 4) {
                return new dfwy();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfwz.class) {
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
