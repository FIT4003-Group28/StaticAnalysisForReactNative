package defpackage;
/* compiled from: PG */
/* renamed from: dqlt  reason: default package */
/* loaded from: classes6.dex */
public final class dqlt extends dsqw<dqlt, dqls> implements dssk {
    public static final dqlt c;
    private static volatile dssr<dqlt> d;
    public int a;
    public dspd b = dspd.b;

    static {
        dqlt dqltVar = new dqlt();
        c = dqltVar;
        dsqw.cc(dqlt.class, dqltVar);
    }

    private dqlt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqlt();
            }
            if (i2 == 4) {
                return new dqls();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqlt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqlt.class) {
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
