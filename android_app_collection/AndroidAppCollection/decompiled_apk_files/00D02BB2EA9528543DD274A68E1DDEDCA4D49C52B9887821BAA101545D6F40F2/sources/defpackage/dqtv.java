package defpackage;
/* compiled from: PG */
/* renamed from: dqtv  reason: default package */
/* loaded from: classes.dex */
public final class dqtv extends dsqw<dqtv, dqtq> implements dssk {
    public static final dqtv d;
    private static volatile dssr<dqtv> e;
    public int a;
    public dsrj<dqts> b = dssu.b;
    public dqtu c;

    static {
        dqtv dqtvVar = new dqtv();
        d = dqtvVar;
        dsqw.cc(dqtv.class, dqtvVar);
    }

    private dqtv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", dqts.class, "c"});
            }
            if (i2 == 3) {
                return new dqtv();
            }
            if (i2 == 4) {
                return new dqtq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqtv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqtv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
