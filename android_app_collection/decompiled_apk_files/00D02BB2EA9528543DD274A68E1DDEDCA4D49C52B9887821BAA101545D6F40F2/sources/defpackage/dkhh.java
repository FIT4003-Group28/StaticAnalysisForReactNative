package defpackage;
/* compiled from: PG */
/* renamed from: dkhh  reason: default package */
/* loaded from: classes.dex */
public final class dkhh extends dsqw<dkhh, dkhg> implements dssk {
    public static final dkhh c;
    private static volatile dssr<dkhh> e;
    public boolean a;
    public boolean b;
    private int d;

    static {
        dkhh dkhhVar = new dkhh();
        c = dkhhVar;
        dsqw.cc(dkhh.class, dkhhVar);
    }

    private dkhh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkhh();
            }
            if (i2 == 4) {
                return new dkhg();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkhh> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkhh.class) {
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
