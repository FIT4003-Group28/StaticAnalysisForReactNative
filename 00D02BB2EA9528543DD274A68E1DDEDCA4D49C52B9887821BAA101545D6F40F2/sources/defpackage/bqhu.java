package defpackage;
/* compiled from: PG */
/* renamed from: bqhu  reason: default package */
/* loaded from: classes4.dex */
public final class bqhu extends dsqw<bqhu, bqhs> implements dssk {
    public static final bqhu f;
    private static volatile dssr<bqhu> g;
    public int a;
    public int b = 0;
    public Object c;
    public dpum d;
    public long e;

    static {
        bqhu bqhuVar = new bqhu();
        f = bqhuVar;
        dsqw.cc(bqhu.class, bqhuVar);
    }

    private bqhu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002စ\u0001\u0003း\u0000\u0004ြ\u0000", new Object[]{"c", "b", "a", "d", "e", bqhr.class});
            }
            if (i2 == 3) {
                return new bqhu();
            }
            if (i2 == 4) {
                return new bqhs();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bqhu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bqhu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
