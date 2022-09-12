package defpackage;
/* compiled from: PG */
/* renamed from: dqrf  reason: default package */
/* loaded from: classes6.dex */
public final class dqrf extends dsqw<dqrf, dqre> implements dssk {
    public static final dqrf a;
    private static volatile dssr<dqrf> b;

    static {
        dqrf dqrfVar = new dqrf();
        a = dqrfVar;
        dsqw.cc(dqrf.class, dqrfVar);
    }

    private dqrf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqrf();
            }
            if (i2 == 4) {
                return new dqre();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqrf.class) {
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
