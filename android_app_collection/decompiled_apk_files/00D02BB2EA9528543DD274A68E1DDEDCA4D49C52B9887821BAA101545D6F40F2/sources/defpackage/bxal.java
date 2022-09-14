package defpackage;
/* compiled from: PG */
/* renamed from: bxal  reason: default package */
/* loaded from: classes4.dex */
public final class bxal extends dsqw<bxal, bxai> implements dssk {
    public static final bxal b;
    private static volatile dssr<bxal> d;
    public bxak a;
    private int c;

    static {
        bxal bxalVar = new bxal();
        b = bxalVar;
        dsqw.cc(bxal.class, bxalVar);
    }

    private bxal() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new bxal();
            }
            if (i2 == 4) {
                return new bxai();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bxal> dssrVar = d;
            if (dssrVar == null) {
                synchronized (bxal.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
