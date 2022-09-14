package defpackage;
/* compiled from: PG */
/* renamed from: dtnt  reason: default package */
/* loaded from: classes6.dex */
public final class dtnt extends dsqw<dtnt, dtns> implements dssk {
    public static final dtnt a;
    private static volatile dssr<dtnt> b;

    static {
        dtnt dtntVar = new dtnt();
        a = dtntVar;
        dsqw.cc(dtnt.class, dtntVar);
    }

    private dtnt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtnt();
            }
            if (i2 == 4) {
                return new dtns();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtnt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dtnt.class) {
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
