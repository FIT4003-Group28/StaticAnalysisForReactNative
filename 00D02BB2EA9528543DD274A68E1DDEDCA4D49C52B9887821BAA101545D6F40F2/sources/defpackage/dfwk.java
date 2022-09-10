package defpackage;
/* compiled from: PG */
/* renamed from: dfwk  reason: default package */
/* loaded from: classes6.dex */
public final class dfwk extends dsqw<dfwk, dfwj> implements dssk {
    public static final dfwk d;
    private static volatile dssr<dfwk> e;
    public int a;
    public dfwe b;
    public dfwe c;

    static {
        dfwk dfwkVar = new dfwk();
        d = dfwkVar;
        dsqw.cc(dfwk.class, dfwkVar);
    }

    private dfwk() {
        dsqz dsqzVar = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0000\bဉ\u0006\tဉ\u0007", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dfwk();
            }
            if (i2 == 4) {
                return new dfwj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfwk> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfwk.class) {
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
