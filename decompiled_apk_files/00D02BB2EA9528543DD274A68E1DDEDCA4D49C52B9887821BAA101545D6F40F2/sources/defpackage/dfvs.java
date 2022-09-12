package defpackage;
/* compiled from: PG */
/* renamed from: dfvs  reason: default package */
/* loaded from: classes6.dex */
public final class dfvs extends dsqw<dfvs, dfvr> implements dssk {
    public static final dfvs a;
    private static volatile dssr<dfvs> b;

    static {
        dfvs dfvsVar = new dfvs();
        a = dfvsVar;
        dsqw.cc(dfvs.class, dfvsVar);
    }

    private dfvs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfvs();
            }
            if (i2 == 4) {
                return new dfvr();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvs> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfvs.class) {
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
