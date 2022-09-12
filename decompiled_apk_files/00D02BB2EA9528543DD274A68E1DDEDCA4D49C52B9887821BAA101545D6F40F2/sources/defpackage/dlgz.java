package defpackage;
/* compiled from: PG */
/* renamed from: dlgz  reason: default package */
/* loaded from: classes6.dex */
public final class dlgz extends dsqw<dlgz, dlgy> implements dssk {
    public static final dlgz a;
    private static volatile dssr<dlgz> b;

    static {
        dlgz dlgzVar = new dlgz();
        a = dlgzVar;
        dsqw.cc(dlgz.class, dlgzVar);
    }

    private dlgz() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dlgz();
            }
            if (i2 == 4) {
                return new dlgy();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgz> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dlgz.class) {
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
