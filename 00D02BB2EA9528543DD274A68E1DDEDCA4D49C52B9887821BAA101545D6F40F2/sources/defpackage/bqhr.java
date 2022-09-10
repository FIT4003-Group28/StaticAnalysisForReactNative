package defpackage;
/* compiled from: PG */
/* renamed from: bqhr  reason: default package */
/* loaded from: classes4.dex */
public final class bqhr extends dsqw<bqhr, bqhq> implements dssk {
    public static final bqhr c;
    private static volatile dssr<bqhr> d;
    public int a;
    public int b;

    static {
        bqhr bqhrVar = new bqhr();
        c = bqhrVar;
        dsqw.cc(bqhr.class, bqhrVar);
    }

    private bqhr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဆ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new bqhr();
            }
            if (i2 == 4) {
                return new bqhq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bqhr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bqhr.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
