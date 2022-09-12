package defpackage;
/* compiled from: PG */
/* renamed from: dfgm  reason: default package */
/* loaded from: classes6.dex */
public final class dfgm extends dsqw<dfgm, dfgj> implements dssk {
    public static final dfgm d;
    private static volatile dssr<dfgm> f;
    public int a;
    public float b;
    public float c;
    private int e;

    static {
        dfgm dfgmVar = new dfgm();
        d = dfgmVar;
        dsqw.cc(dfgm.class, dfgmVar);
    }

    private dfgm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"e", "a", dfgk.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dfgm();
            }
            if (i2 == 4) {
                return new dfgj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfgm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfgm.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
