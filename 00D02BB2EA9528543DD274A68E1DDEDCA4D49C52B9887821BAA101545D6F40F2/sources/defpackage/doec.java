package defpackage;
/* compiled from: PG */
/* renamed from: doec  reason: default package */
/* loaded from: classes6.dex */
public final class doec extends dsqw<doec, doeb> implements dssk {
    public static final doec a;
    private static volatile dssr<doec> b;

    static {
        doec doecVar = new doec();
        a = doecVar;
        dsqw.cc(doec.class, doecVar);
    }

    private doec() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new doec();
            }
            if (i2 == 4) {
                return new doeb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doec> dssrVar = b;
            if (dssrVar == null) {
                synchronized (doec.class) {
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
