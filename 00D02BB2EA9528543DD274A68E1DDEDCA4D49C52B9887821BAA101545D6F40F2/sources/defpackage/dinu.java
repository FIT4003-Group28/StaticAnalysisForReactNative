package defpackage;
/* compiled from: PG */
/* renamed from: dinu  reason: default package */
/* loaded from: classes.dex */
public final class dinu extends dsqw<dinu, dint> implements dssk {
    public static final dinu c;
    private static volatile dssr<dinu> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dinu dinuVar = new dinu();
        c = dinuVar;
        dsqw.cc(dinu.class, dinuVar);
    }

    private dinu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dinu();
            }
            if (i2 == 4) {
                return new dint();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dinu> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dinu.class) {
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
