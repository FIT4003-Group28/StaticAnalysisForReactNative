package defpackage;
/* compiled from: PG */
/* renamed from: dfee  reason: default package */
/* loaded from: classes6.dex */
public final class dfee extends dsqw<dfee, dfdz> implements dssk {
    public static final dfee d;
    private static volatile dssr<dfee> e;
    public int a;
    public dsrj<dfeb> b = dssu.b;
    public dfed c;

    static {
        dfee dfeeVar = new dfee();
        d = dfeeVar;
        dsqw.cc(dfee.class, dfeeVar);
    }

    private dfee() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dfeb.class, "c"});
            }
            if (i2 == 3) {
                return new dfee();
            }
            if (i2 == 4) {
                return new dfdz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfee> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfee.class) {
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
