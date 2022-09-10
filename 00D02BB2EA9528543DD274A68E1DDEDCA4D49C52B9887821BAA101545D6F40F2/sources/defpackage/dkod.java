package defpackage;
/* compiled from: PG */
/* renamed from: dkod  reason: default package */
/* loaded from: classes.dex */
public final class dkod extends dsqw<dkod, dkoc> implements dssk {
    public static final dkod c;
    private static volatile dssr<dkod> e;
    public int a = 15;
    public int b = 60;
    private int d;

    static {
        dkod dkodVar = new dkod();
        c = dkodVar;
        dsqw.cc(dkod.class, dkodVar);
    }

    private dkod() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dkod();
            }
            if (i2 == 4) {
                return new dkoc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkod> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dkod.class) {
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
