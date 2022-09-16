package defpackage;
/* compiled from: PG */
/* renamed from: dvqt  reason: default package */
/* loaded from: classes6.dex */
public final class dvqt extends dsqw<dvqt, dvqs> implements dssk {
    public static final dvqt a;
    private static volatile dssr<dvqt> b;

    static {
        dvqt dvqtVar = new dvqt();
        a = dvqtVar;
        dsqw.cc(dvqt.class, dvqtVar);
    }

    private dvqt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dvqt();
            }
            if (i2 == 4) {
                return new dvqs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvqt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dvqt.class) {
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
