package defpackage;
/* compiled from: PG */
/* renamed from: dgoq  reason: default package */
/* loaded from: classes6.dex */
public final class dgoq extends dsqw<dgoq, dgop> implements dssk {
    public static final dgoq b;
    private static volatile dssr<dgoq> d;
    public dnqe a;
    private int c;

    static {
        dgoq dgoqVar = new dgoq();
        b = dgoqVar;
        dsqw.cc(dgoq.class, dgoqVar);
    }

    private dgoq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dgoq();
            }
            if (i2 == 4) {
                return new dgop();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgoq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgoq.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
