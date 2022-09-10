package defpackage;
/* compiled from: PG */
/* renamed from: dmgy  reason: default package */
/* loaded from: classes6.dex */
public final class dmgy extends dsqw<dmgy, dmgx> implements dssk {
    public static final dmgy b;
    public static final dsqv<dmfs, dmgy> c;
    private static volatile dssr<dmgy> e;
    public dspd a = dspd.b;
    private int d;

    static {
        dmgy dmgyVar = new dmgy();
        b = dmgyVar;
        dsqw.cc(dmgy.class, dmgyVar);
        c = dsqw.newSingularGeneratedExtension(dmfs.c, dmgyVar, dmgyVar, null, 1014, dsur.MESSAGE, dmgy.class);
    }

    private dmgy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "a"});
            }
            if (i2 == 3) {
                return new dmgy();
            }
            if (i2 == 4) {
                return new dmgx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmgy> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmgy.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
