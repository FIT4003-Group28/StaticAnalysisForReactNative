package defpackage;
/* compiled from: PG */
/* renamed from: drox  reason: default package */
/* loaded from: classes6.dex */
public final class drox extends dsqw<drox, drou> implements dssk {
    public static final drox f;
    private static volatile dssr<drox> g;
    public int a;
    public drow c;
    public int e;
    public dsrj<drsk> b = dssu.b;
    public int d = 6;

    static {
        drox droxVar = new drox();
        f = droxVar;
        dsqw.cc(drox.class, droxVar);
    }

    private drox() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဌ\u0001\u0005င\u0003", new Object[]{"a", "b", drsk.class, "c", "d", dqvj.d(), "e"});
            }
            if (i2 == 3) {
                return new drox();
            }
            if (i2 == 4) {
                return new drou();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drox> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drox.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
