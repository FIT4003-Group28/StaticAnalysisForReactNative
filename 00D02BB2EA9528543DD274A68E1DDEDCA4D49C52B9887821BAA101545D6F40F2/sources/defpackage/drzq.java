package defpackage;
/* compiled from: PG */
/* renamed from: drzq  reason: default package */
/* loaded from: classes6.dex */
public final class drzq extends dsqw<drzq, drzp> implements dssk {
    public static final drzq e;
    private static volatile dssr<drzq> f;
    public int a;
    public String b = "";
    public dsrj<dsae> c = dssu.b;
    public dsay d;

    static {
        drzq drzqVar = new drzq();
        e = drzqVar;
        dsqw.cc(drzq.class, drzqVar);
    }

    private drzq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0004ဉ\u0002", new Object[]{"a", "b", "c", dsae.class, "d"});
            }
            if (i2 == 3) {
                return new drzq();
            }
            if (i2 == 4) {
                return new drzp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drzq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drzq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
