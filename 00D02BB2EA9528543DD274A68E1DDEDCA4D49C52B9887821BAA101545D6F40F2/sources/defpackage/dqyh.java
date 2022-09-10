package defpackage;
/* compiled from: PG */
/* renamed from: dqyh  reason: default package */
/* loaded from: classes6.dex */
public final class dqyh extends dsqw<dqyh, dqyg> implements dssk {
    public static final dqyh e;
    private static volatile dssr<dqyh> f;
    public int a;
    public int b;
    public int c;
    public String d = "";

    static {
        dqyh dqyhVar = new dqyh();
        e = dqyhVar;
        dsqw.cc(dqyh.class, dqyhVar);
    }

    private dqyh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", dqjm.a, "c", dqjl.c(), "d"});
            }
            if (i2 == 3) {
                return new dqyh();
            }
            if (i2 == 4) {
                return new dqyg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqyh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
