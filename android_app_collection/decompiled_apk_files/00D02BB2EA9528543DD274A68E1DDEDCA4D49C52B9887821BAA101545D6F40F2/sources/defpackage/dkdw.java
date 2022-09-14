package defpackage;
/* compiled from: PG */
/* renamed from: dkdw  reason: default package */
/* loaded from: classes6.dex */
public final class dkdw extends dsqw<dkdw, dkdv> implements dssk {
    public static final dkdw b;
    private static volatile dssr<dkdw> c;
    public dsrj<dqle> a = dssu.b;

    static {
        dkdw dkdwVar = new dkdw();
        b = dkdwVar;
        dsqw.cc(dkdw.class, dkdwVar);
    }

    private dkdw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqle.class});
            }
            if (i2 == 3) {
                return new dkdw();
            }
            if (i2 == 4) {
                return new dkdv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkdw> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dkdw.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
