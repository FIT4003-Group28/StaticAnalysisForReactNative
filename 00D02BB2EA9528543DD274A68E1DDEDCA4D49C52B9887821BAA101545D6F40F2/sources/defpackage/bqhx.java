package defpackage;
/* compiled from: PG */
/* renamed from: bqhx  reason: default package */
/* loaded from: classes4.dex */
public final class bqhx extends dsqw<bqhx, bqhw> implements dssk {
    public static final bqhx d;
    private static volatile dssr<bqhx> e;
    public int a;
    public bqhv b;
    public int c;

    static {
        bqhx bqhxVar = new bqhx();
        d = bqhxVar;
        dsqw.cc(bqhx.class, bqhxVar);
    }

    private bqhx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bqhx();
            }
            if (i2 == 4) {
                return new bqhw();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bqhx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bqhx.class) {
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
