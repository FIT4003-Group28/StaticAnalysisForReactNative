package defpackage;
/* compiled from: PG */
/* renamed from: dfxy  reason: default package */
/* loaded from: classes6.dex */
public final class dfxy extends dsqw<dfxy, dfxx> implements dssk {
    public static final dfxy e;
    private static volatile dssr<dfxy> f;
    public int a;
    public float b;
    public float c = 90.0f;
    public float d;

    static {
        dfxy dfxyVar = new dfxy();
        e = dfxyVar;
        dsqw.cc(dfxy.class, dfxyVar);
    }

    private dfxy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dfxy();
            }
            if (i2 == 4) {
                return new dfxx();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfxy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfxy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
