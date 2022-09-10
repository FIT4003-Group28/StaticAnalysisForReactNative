package defpackage;
/* compiled from: PG */
/* renamed from: dihr  reason: default package */
/* loaded from: classes6.dex */
public final class dihr extends dsqw<dihr, dihq> implements dssk {
    public static final dihr a;
    private static volatile dssr<dihr> b;

    static {
        dihr dihrVar = new dihr();
        a = dihrVar;
        dsqw.cc(dihr.class, dihrVar);
    }

    private dihr() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dihr();
            }
            if (i2 == 4) {
                return new dihq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dihr> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dihr.class) {
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
