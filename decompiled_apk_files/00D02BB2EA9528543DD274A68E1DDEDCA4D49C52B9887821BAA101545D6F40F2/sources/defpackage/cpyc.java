package defpackage;
/* compiled from: PG */
/* renamed from: cpyc  reason: default package */
/* loaded from: classes5.dex */
public final class cpyc extends dsqw<cpyc, cpya> implements dssk {
    public static final cpyc a;
    private static volatile dssr<cpyc> c;
    private dssd<Integer, Double> b = dssd.b;

    static {
        cpyc cpycVar = new cpyc();
        a = cpycVar;
        dsqw.cc(cpyc.class, cpycVar);
    }

    private cpyc() {
        dsqz dsqzVar = dsqz.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0000\u000f\u000f\u0001\u0001\u0000\u0000\u000f2", new Object[]{"b", cpyb.a});
            }
            if (i2 == 3) {
                return new cpyc();
            }
            if (i2 == 4) {
                return new cpya();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cpyc> dssrVar = c;
            if (dssrVar == null) {
                synchronized (cpyc.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
