package defpackage;
/* compiled from: PG */
/* renamed from: dfut  reason: default package */
/* loaded from: classes6.dex */
public final class dfut extends dsqw<dfut, dfus> implements dssk {
    public static final dfut d;
    private static volatile dssr<dfut> e;
    public int a;
    public int b;
    public int c;

    static {
        dfut dfutVar = new dfut();
        d = dfutVar;
        dsqw.cc(dfut.class, dfutVar);
    }

    private dfut() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfut();
            }
            if (i2 == 4) {
                return new dfus();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfut> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfut.class) {
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
