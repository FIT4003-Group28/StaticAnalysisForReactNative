package defpackage;
/* compiled from: PG */
/* renamed from: dstq  reason: default package */
/* loaded from: classes6.dex */
public final class dstq extends dsqw<dstq, dsto> implements dssk {
    public static final dstq a;
    private static volatile dssr<dstq> c;
    private dssd<String, dsuq> b = dssd.b;

    static {
        dstq dstqVar = new dstq();
        a = dstqVar;
        dsqw.cc(dstq.class, dstqVar);
    }

    private dstq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dstp.a});
            }
            if (i2 == 3) {
                return new dstq();
            }
            if (i2 == 4) {
                return new dsto();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dstq> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dstq.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
