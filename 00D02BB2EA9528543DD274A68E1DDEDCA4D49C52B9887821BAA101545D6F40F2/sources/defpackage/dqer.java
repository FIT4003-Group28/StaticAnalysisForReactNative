package defpackage;
/* compiled from: PG */
/* renamed from: dqer  reason: default package */
/* loaded from: classes.dex */
public final class dqer extends dsqw<dqer, dqeq> implements dssk {
    public static final dqer c;
    private static volatile dssr<dqer> d;
    public int a;
    public String b = "";

    static {
        dqer dqerVar = new dqer();
        c = dqerVar;
        dsqw.cc(dqer.class, dqerVar);
    }

    private dqer() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dqer();
            }
            if (i2 == 4) {
                return new dqeq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqer> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dqer.class) {
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
