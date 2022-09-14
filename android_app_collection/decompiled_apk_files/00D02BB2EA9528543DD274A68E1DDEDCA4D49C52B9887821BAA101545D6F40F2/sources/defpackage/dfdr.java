package defpackage;
/* compiled from: PG */
/* renamed from: dfdr  reason: default package */
/* loaded from: classes6.dex */
public final class dfdr extends dsqw<dfdr, dfdp> implements dssk {
    public static final dfdr c;
    private static volatile dssr<dfdr> d;
    public int a;
    public int b;

    static {
        dfdr dfdrVar = new dfdr();
        c = dfdrVar;
        dsqw.cc(dfdr.class, dfdrVar);
    }

    private dfdr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဌ\u0000", new Object[]{"a", "b", dfdq.a});
            }
            if (i2 == 3) {
                return new dfdr();
            }
            if (i2 == 4) {
                return new dfdp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfdr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfdr.class) {
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
