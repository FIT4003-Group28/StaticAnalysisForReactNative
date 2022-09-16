package defpackage;
/* compiled from: PG */
/* renamed from: dfvq  reason: default package */
/* loaded from: classes6.dex */
public final class dfvq extends dsqw<dfvq, dfvp> implements dssk {
    public static final dfvq a;
    private static volatile dssr<dfvq> b;

    static {
        dfvq dfvqVar = new dfvq();
        a = dfvqVar;
        dsqw.cc(dfvq.class, dfvqVar);
    }

    private dfvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfvq();
            }
            if (i2 == 4) {
                return new dfvp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvq> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfvq.class) {
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
