package defpackage;
/* compiled from: PG */
/* renamed from: dvxn  reason: default package */
/* loaded from: classes.dex */
public final class dvxn extends dsqw<dvxn, dvxm> implements dssk {
    public static final dvxn e;
    private static volatile dssr<dvxn> f;
    public int a;
    public dwfl b;
    public String c = "";
    public int d;

    static {
        dvxn dvxnVar = new dvxn();
        e = dvxnVar;
        dsqw.cc(dvxn.class, dvxnVar);
    }

    private dvxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0005င\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dvxn();
            }
            if (i2 == 4) {
                return new dvxm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvxn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvxn.class) {
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
