package defpackage;
/* compiled from: PG */
/* renamed from: dnqm  reason: default package */
/* loaded from: classes6.dex */
public final class dnqm extends dsqw<dnqm, dnql> implements dssk {
    public static final dnqm c;
    private static volatile dssr<dnqm> d;
    public int a = 0;
    public Object b;

    static {
        dnqm dnqmVar = new dnqm();
        c = dnqmVar;
        dsqw.cc(dnqm.class, dnqmVar);
    }

    private dnqm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", dnqo.class, dnry.class});
            }
            if (i2 == 3) {
                return new dnqm();
            }
            if (i2 == 4) {
                return new dnql();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnqm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnqm.class) {
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
