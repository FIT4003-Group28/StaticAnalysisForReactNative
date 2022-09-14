package defpackage;
/* compiled from: PG */
/* renamed from: dmsf  reason: default package */
/* loaded from: classes.dex */
public final class dmsf extends dsqw<dmsf, dmse> implements dssk {
    public static final dmsf a;
    private static volatile dssr<dmsf> b;

    static {
        dmsf dmsfVar = new dmsf();
        a = dmsfVar;
        dsqw.cc(dmsf.class, dmsfVar);
    }

    private dmsf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmsf();
            }
            if (i2 == 4) {
                return new dmse();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmsf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmsf.class) {
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
