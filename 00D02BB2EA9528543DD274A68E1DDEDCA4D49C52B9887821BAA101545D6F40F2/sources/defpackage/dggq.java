package defpackage;
/* compiled from: PG */
/* renamed from: dggq  reason: default package */
/* loaded from: classes6.dex */
public final class dggq extends dsqw<dggq, dggp> implements dssk {
    public static final dggq d;
    private static volatile dssr<dggq> f;
    public String a = "";
    public dggg b;
    public int c;
    private int e;

    static {
        dggq dggqVar = new dggq();
        d = dggqVar;
        dsqw.cc(dggq.class, dggqVar);
    }

    private dggq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0004ဌ\u0004", new Object[]{"e", "a", "b", "c", dggc.c()});
            }
            if (i2 == 3) {
                return new dggq();
            }
            if (i2 == 4) {
                return new dggp();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dggq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dggq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
