package defpackage;
/* compiled from: PG */
/* renamed from: dqyy  reason: default package */
/* loaded from: classes.dex */
public final class dqyy extends dsqw<dqyy, dqyx> implements dssk {
    public static final dqyy c;
    private static volatile dssr<dqyy> e;
    public int a = 1000;
    public int b = 15000;
    private int d;

    static {
        dqyy dqyyVar = new dqyy();
        c = dqyyVar;
        dsqw.cc(dqyy.class, dqyyVar);
    }

    private dqyy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dqyy();
            }
            if (i2 == 4) {
                return new dqyx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqyy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqyy.class) {
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
