package defpackage;
/* compiled from: PG */
/* renamed from: dqro  reason: default package */
/* loaded from: classes6.dex */
public final class dqro extends dsqw<dqro, dqrn> implements dssk {
    public static final dqro c;
    private static volatile dssr<dqro> d;
    public int a;
    public int b;

    static {
        dqro dqroVar = new dqro();
        c = dqroVar;
        dsqw.cc(dqro.class, dqroVar);
    }

    private dqro() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqrc.a});
            }
            if (i2 == 3) {
                return new dqro();
            }
            if (i2 == 4) {
                return new dqrn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqro> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqro.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
