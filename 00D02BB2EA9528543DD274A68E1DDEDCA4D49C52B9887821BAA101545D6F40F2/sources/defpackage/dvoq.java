package defpackage;
/* compiled from: PG */
/* renamed from: dvoq  reason: default package */
/* loaded from: classes6.dex */
public final class dvoq extends dsqw<dvoq, dvop> implements dssk {
    public static final dvoq c;
    private static volatile dssr<dvoq> d;
    public int a;
    public long b;

    static {
        dvoq dvoqVar = new dvoq();
        c = dvoqVar;
        dsqw.cc(dvoq.class, dvoqVar);
    }

    private dvoq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001စ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvoq();
            }
            if (i2 == 4) {
                return new dvop();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvoq> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvoq.class) {
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
