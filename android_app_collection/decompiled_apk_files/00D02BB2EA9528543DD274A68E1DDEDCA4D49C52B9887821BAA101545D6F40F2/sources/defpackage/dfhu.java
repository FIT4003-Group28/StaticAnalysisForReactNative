package defpackage;
/* compiled from: PG */
/* renamed from: dfhu  reason: default package */
/* loaded from: classes6.dex */
public final class dfhu extends dsqw<dfhu, dfht> implements dssk {
    public static final dfhu a;
    private static volatile dssr<dfhu> b;

    static {
        dfhu dfhuVar = new dfhu();
        a = dfhuVar;
        dsqw.cc(dfhu.class, dfhuVar);
    }

    private dfhu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dfhu();
            }
            if (i2 == 4) {
                return new dfht();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfhu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dfhu.class) {
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
