package defpackage;
/* compiled from: PG */
/* renamed from: dqrp  reason: default package */
/* loaded from: classes6.dex */
public final class dqrp extends dsqw<dqrp, dqrm> implements dssk {
    public static final dqrp b;
    private static volatile dssr<dqrp> c;
    public dsrj<dqro> a = dssu.b;

    static {
        dqrp dqrpVar = new dqrp();
        b = dqrpVar;
        dsqw.cc(dqrp.class, dqrpVar);
    }

    private dqrp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dqro.class});
            }
            if (i2 == 3) {
                return new dqrp();
            }
            if (i2 == 4) {
                return new dqrm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dqrp.class) {
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
