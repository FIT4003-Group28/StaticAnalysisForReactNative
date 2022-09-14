package defpackage;
/* compiled from: PG */
/* renamed from: dqzn  reason: default package */
/* loaded from: classes6.dex */
public final class dqzn extends dsqw<dqzn, dqzm> implements dssk {
    public static final dqzn c;
    private static volatile dssr<dqzn> e;
    public String a = "";
    public doek b;
    private int d;

    static {
        dqzn dqznVar = new dqzn();
        c = dqznVar;
        dsqw.cc(dqzn.class, dqznVar);
    }

    private dqzn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqzn();
            }
            if (i2 == 4) {
                return new dqzm();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqzn.class) {
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
