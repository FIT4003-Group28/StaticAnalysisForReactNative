package defpackage;
/* compiled from: PG */
/* renamed from: duhp  reason: default package */
/* loaded from: classes6.dex */
public final class duhp extends dsqw<duhp, duho> implements dssk {
    public static final duhp a;
    private static volatile dssr<duhp> b;

    static {
        duhp duhpVar = new duhp();
        a = duhpVar;
        dsqw.cc(duhp.class, duhpVar);
    }

    private duhp() {
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
                return new duhp();
            }
            if (i2 == 4) {
                return new duho();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duhp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (duhp.class) {
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
