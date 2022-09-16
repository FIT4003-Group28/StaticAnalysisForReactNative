package defpackage;
/* compiled from: PG */
/* renamed from: dmnx  reason: default package */
/* loaded from: classes.dex */
public final class dmnx extends dsqw<dmnx, dmnw> implements dssk {
    public static final dmnx a;
    private static volatile dssr<dmnx> b;

    static {
        dmnx dmnxVar = new dmnx();
        a = dmnxVar;
        dsqw.cc(dmnx.class, dmnxVar);
    }

    private dmnx() {
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
                return new dmnx();
            }
            if (i2 == 4) {
                return new dmnw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmnx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmnx.class) {
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
