package defpackage;
/* compiled from: PG */
/* renamed from: dqgd  reason: default package */
/* loaded from: classes6.dex */
public final class dqgd extends dsqw<dqgd, dqgc> implements dssk {
    public static final dqgd c;
    private static volatile dssr<dqgd> e;
    public int a;
    public dsrj<dqgf> b;
    private int d;

    static {
        dqgd dqgdVar = new dqgd();
        c = dqgdVar;
        dsqw.cc(dqgd.class, dqgdVar);
    }

    private dqgd() {
        dssu<Object> dssuVar = dssu.b;
        this.b = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001င\u0000\u0003\u001b", new Object[]{"d", "a", "b", dqgf.class});
            }
            if (i2 == 3) {
                return new dqgd();
            }
            if (i2 == 4) {
                return new dqgc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqgd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqgd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
