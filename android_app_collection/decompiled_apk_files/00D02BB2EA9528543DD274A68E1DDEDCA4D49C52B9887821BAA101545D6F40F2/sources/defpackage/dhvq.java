package defpackage;
/* compiled from: PG */
/* renamed from: dhvq  reason: default package */
/* loaded from: classes6.dex */
public final class dhvq extends dsqw<dhvq, dhvp> implements dssk {
    public static final dhvq c;
    private static volatile dssr<dhvq> d;
    public int a = 0;
    public Object b;

    static {
        dhvq dhvqVar = new dhvq();
        c = dhvqVar;
        dsqw.cc(dhvq.class, dhvqVar);
    }

    private dhvq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001ြ\u0000", new Object[]{"b", "a", dhvo.class});
            }
            if (i2 == 3) {
                return new dhvq();
            }
            if (i2 == 4) {
                return new dhvp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhvq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhvq.class) {
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
