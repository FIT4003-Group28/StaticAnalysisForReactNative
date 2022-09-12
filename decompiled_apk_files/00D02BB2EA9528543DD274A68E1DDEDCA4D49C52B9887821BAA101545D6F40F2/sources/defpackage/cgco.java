package defpackage;
/* compiled from: PG */
/* renamed from: cgco  reason: default package */
/* loaded from: classes4.dex */
public final class cgco extends dsqw<cgco, cgcn> implements dssk {
    public static final cgco d;
    private static volatile dssr<cgco> e;
    public int a;
    public int b;
    public int c;

    static {
        cgco cgcoVar = new cgco();
        d = cgcoVar;
        dsqw.cc(cgco.class, cgcoVar);
    }

    private cgco() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cgco();
            }
            if (i2 == 4) {
                return new cgcn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgco> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cgco.class) {
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
