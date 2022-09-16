package defpackage;
/* compiled from: PG */
/* renamed from: dqxc  reason: default package */
/* loaded from: classes.dex */
public final class dqxc extends dsqw<dqxc, dqxb> implements dssk {
    public static final dqxc c;
    private static volatile dssr<dqxc> d;
    public int a;
    public int b;

    static {
        dqxc dqxcVar = new dqxc();
        c = dqxcVar;
        dsqw.cc(dqxc.class, dqxcVar);
    }

    private dqxc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqxc();
            }
            if (i2 == 4) {
                return new dqxb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqxc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqxc.class) {
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
