package defpackage;
/* compiled from: PG */
/* renamed from: dvcj  reason: default package */
/* loaded from: classes6.dex */
public final class dvcj extends dsqw<dvcj, dvci> implements dssk {
    public static final dvcj d;
    private static volatile dssr<dvcj> f;
    public String a = "";
    public dsrj<dvbr> b = dssu.b;
    public dsrj<dvbv> c = dssu.b;
    private int e;

    static {
        dvcj dvcjVar = new dvcj();
        d = dvcjVar;
        dsqw.cc(dvcj.class, dvcjVar);
    }

    private dvcj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0003\u001b\u0004\u001b", new Object[]{"e", "a", "b", dvbr.class, "c", dvbv.class});
            }
            if (i2 == 3) {
                return new dvcj();
            }
            if (i2 == 4) {
                return new dvci();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvcj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvcj.class) {
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
