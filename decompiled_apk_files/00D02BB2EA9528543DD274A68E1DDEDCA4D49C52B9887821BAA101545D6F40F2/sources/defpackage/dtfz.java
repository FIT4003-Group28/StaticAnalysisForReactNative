package defpackage;
/* compiled from: PG */
/* renamed from: dtfz  reason: default package */
/* loaded from: classes6.dex */
public final class dtfz extends dsqw<dtfz, dtfy> implements dssk {
    public static final dtfz a;
    private static volatile dssr<dtfz> b;

    static {
        dtfz dtfzVar = new dtfz();
        a = dtfzVar;
        dsqw.cc(dtfz.class, dtfzVar);
    }

    private dtfz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtfz();
            }
            if (i2 == 4) {
                return new dtfy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtfz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtfz.class) {
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
