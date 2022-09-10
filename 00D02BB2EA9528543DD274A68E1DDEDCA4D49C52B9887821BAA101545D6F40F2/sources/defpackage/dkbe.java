package defpackage;
/* compiled from: PG */
/* renamed from: dkbe  reason: default package */
/* loaded from: classes6.dex */
public final class dkbe extends dsqw<dkbe, dkbd> implements dssk {
    public static final dkbe a;
    private static volatile dssr<dkbe> b;

    static {
        dkbe dkbeVar = new dkbe();
        a = dkbeVar;
        dsqw.cc(dkbe.class, dkbeVar);
    }

    private dkbe() {
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
                return new dkbe();
            }
            if (i2 == 4) {
                return new dkbd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkbe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dkbe.class) {
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
