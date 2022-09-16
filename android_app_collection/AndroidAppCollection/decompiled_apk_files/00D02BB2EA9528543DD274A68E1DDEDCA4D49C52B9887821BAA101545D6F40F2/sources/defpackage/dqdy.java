package defpackage;
/* compiled from: PG */
/* renamed from: dqdy  reason: default package */
/* loaded from: classes6.dex */
public final class dqdy extends dsqw<dqdy, dqdx> implements dssk {
    public static final dqdy c;
    private static volatile dssr<dqdy> e;
    public dpum a;
    public long b;
    private int d;

    static {
        dqdy dqdyVar = new dqdy();
        c = dqdyVar;
        dsqw.cc(dqdy.class, dqdyVar);
    }

    private dqdy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqdy();
            }
            if (i2 == 4) {
                return new dqdx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqdy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqdy.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
