package defpackage;
/* compiled from: PG */
/* renamed from: csjj  reason: default package */
/* loaded from: classes5.dex */
public final class csjj extends dsqw<csjj, csji> implements dssk {
    public static final csjj b;
    private static volatile dssr<csjj> d;
    public int a;
    private int c;

    static {
        csjj csjjVar = new csjj();
        b = csjjVar;
        dsqw.cc(csjj.class, csjjVar);
    }

    private csjj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new csjj();
            }
            if (i2 == 4) {
                return new csji();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csjj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (csjj.class) {
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
