package defpackage;
/* compiled from: PG */
/* renamed from: dtrq  reason: default package */
/* loaded from: classes6.dex */
public final class dtrq extends dsqw<dtrq, dtrp> implements dssk {
    public static final dtrq a;
    private static volatile dssr<dtrq> e;
    private int b;
    private cku c;
    private cks d;

    static {
        dtrq dtrqVar = new dtrq();
        a = dtrqVar;
        dsqw.cc(dtrq.class, dtrqVar);
    }

    private dtrq() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0005\u0007\u0002\u0000\u0000\u0000\u0005ဉ\u0004\u0007ဉ\u0006", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtrq();
            }
            if (i2 == 4) {
                return new dtrp();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtrq> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtrq.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
