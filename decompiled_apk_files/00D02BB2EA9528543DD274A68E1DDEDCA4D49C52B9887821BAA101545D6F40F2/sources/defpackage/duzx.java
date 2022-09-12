package defpackage;
/* compiled from: PG */
/* renamed from: duzx  reason: default package */
/* loaded from: classes6.dex */
public final class duzx extends dsqw<duzx, duzw> implements dssk {
    public static final duzx c;
    private static volatile dssr<duzx> d;
    public int a = 0;
    public Object b;

    static {
        duzx duzxVar = new duzx();
        c = duzxVar;
        dsqw.cc(duzx.class, duzxVar);
    }

    private duzx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{"b", "a", dvad.class, duzq.class, dqgd.class});
            }
            if (i2 == 3) {
                return new duzx();
            }
            if (i2 == 4) {
                return new duzw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duzx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (duzx.class) {
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
