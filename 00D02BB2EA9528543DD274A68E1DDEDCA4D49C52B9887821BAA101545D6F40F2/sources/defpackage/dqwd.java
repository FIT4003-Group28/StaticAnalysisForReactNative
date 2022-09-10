package defpackage;
/* compiled from: PG */
/* renamed from: dqwd  reason: default package */
/* loaded from: classes6.dex */
public final class dqwd extends dsqw<dqwd, dqwc> implements dssk {
    public static final dqwd b;
    private static volatile dssr<dqwd> d;
    public int a;
    private int c;

    static {
        dqwd dqwdVar = new dqwd();
        b = dqwdVar;
        dsqw.cc(dqwd.class, dqwdVar);
    }

    private dqwd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dqwd();
            }
            if (i2 == 4) {
                return new dqwc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqwd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqwd.class) {
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
