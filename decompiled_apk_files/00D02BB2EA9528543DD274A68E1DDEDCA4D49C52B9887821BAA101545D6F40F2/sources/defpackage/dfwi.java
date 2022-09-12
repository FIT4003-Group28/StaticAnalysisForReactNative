package defpackage;
/* compiled from: PG */
/* renamed from: dfwi  reason: default package */
/* loaded from: classes6.dex */
public final class dfwi extends dsqw<dfwi, dfwh> implements dssk {
    public static final dfwi c;
    private static volatile dssr<dfwi> d;
    public int a;
    public float b;

    static {
        dfwi dfwiVar = new dfwi();
        c = dfwiVar;
        dsqw.cc(dfwi.class, dfwiVar);
    }

    private dfwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfwi();
            }
            if (i2 == 4) {
                return new dfwh();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwi> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfwi.class) {
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
