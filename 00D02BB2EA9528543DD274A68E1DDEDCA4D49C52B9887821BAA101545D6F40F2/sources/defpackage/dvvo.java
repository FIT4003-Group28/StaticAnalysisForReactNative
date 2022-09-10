package defpackage;
/* compiled from: PG */
/* renamed from: dvvo  reason: default package */
/* loaded from: classes.dex */
public final class dvvo extends dsqw<dvvo, dvvn> implements dssk {
    public static final dvvo e;
    private static volatile dssr<dvvo> f;
    public int a;
    public dsrj<dvvq> b = dssu.b;
    public String c = "";
    public dvvs d;

    static {
        dvvo dvvoVar = new dvvo();
        e = dvvoVar;
        dsqw.cc(dvvo.class, dvvoVar);
    }

    private dvvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", dvvq.class, "c", "d"});
            }
            if (i2 == 3) {
                return new dvvo();
            }
            if (i2 == 4) {
                return new dvvn();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvvo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvvo.class) {
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
