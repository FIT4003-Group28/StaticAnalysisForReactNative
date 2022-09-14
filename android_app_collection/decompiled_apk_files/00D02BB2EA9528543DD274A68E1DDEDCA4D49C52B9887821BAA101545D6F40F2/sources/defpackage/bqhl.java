package defpackage;
/* compiled from: PG */
/* renamed from: bqhl  reason: default package */
/* loaded from: classes4.dex */
public final class bqhl extends dsqw<bqhl, bqhk> implements dssk {
    public static final bqhl d;
    private static volatile dssr<bqhl> e;
    public int a;
    public bqhv b;
    public dpum c;

    static {
        bqhl bqhlVar = new bqhl();
        d = bqhlVar;
        dsqw.cc(bqhl.class, bqhlVar);
    }

    private bqhl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new bqhl();
            }
            if (i2 == 4) {
                return new bqhk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bqhl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (bqhl.class) {
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
