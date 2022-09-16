package defpackage;
/* compiled from: PG */
/* renamed from: dhjq  reason: default package */
/* loaded from: classes6.dex */
public final class dhjq extends dsqw<dhjq, dhjp> implements dssk {
    public static final dhjq b;
    private static volatile dssr<dhjq> c;
    public int a;

    static {
        dhjq dhjqVar = new dhjq();
        b = dhjqVar;
        dsqw.cc(dhjq.class, dhjqVar);
    }

    private dhjq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            }
            if (i2 == 3) {
                return new dhjq();
            }
            if (i2 == 4) {
                return new dhjp();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhjq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dhjq.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
