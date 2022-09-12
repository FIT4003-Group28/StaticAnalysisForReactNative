package defpackage;
/* compiled from: PG */
/* renamed from: durt  reason: default package */
/* loaded from: classes6.dex */
public final class durt extends dsqw<durt, durs> implements dssk {
    public static final durt b;
    private static volatile dssr<durt> d;
    public dibq a;
    private int c;

    static {
        durt durtVar = new durt();
        b = durtVar;
        dsqw.cc(durt.class, durtVar);
    }

    private durt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new durt();
            }
            if (i2 == 4) {
                return new durs();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<durt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (durt.class) {
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
