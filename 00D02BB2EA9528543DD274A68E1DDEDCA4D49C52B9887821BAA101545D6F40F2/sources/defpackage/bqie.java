package defpackage;
/* compiled from: PG */
/* renamed from: bqie  reason: default package */
/* loaded from: classes4.dex */
public final class bqie extends dsqw<bqie, bqib> implements dssk {
    public static final bqie e;
    private static volatile dssr<bqie> f;
    public int a;
    public bqhv b;
    public int c = -1;
    public int d;

    static {
        bqie bqieVar = new bqie();
        e = bqieVar;
        dsqw.cc(bqie.class, bqieVar);
    }

    private bqie() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", bqic.a});
            }
            if (i2 == 3) {
                return new bqie();
            }
            if (i2 == 4) {
                return new bqib();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bqie> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bqie.class) {
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
