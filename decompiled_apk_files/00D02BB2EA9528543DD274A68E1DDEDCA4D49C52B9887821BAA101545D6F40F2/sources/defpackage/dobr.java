package defpackage;
/* compiled from: PG */
/* renamed from: dobr  reason: default package */
/* loaded from: classes.dex */
public final class dobr extends dsqw<dobr, dobg> implements dssk {
    public static final dobr g;
    private static volatile dssr<dobr> i;
    public int c;
    public boolean d;
    private int h;
    public dsrj<dobf> a = dssu.b;
    public dsrj<dnvs> b = dssu.b;
    public dsrj<dobq> e = dssu.b;
    public dsrj<dobk> f = dssu.b;

    static {
        dobr dobrVar = new dobr();
        g = dobrVar;
        dsqw.cc(dobr.class, dobrVar);
    }

    private dobr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003ဌ\u0000\u0004ဇ\u0001\u0006\u001b\u0007\u001b", new Object[]{"h", "a", dobf.class, "b", dnvs.class, "c", doay.c(), "d", "e", dobq.class, "f", dobk.class});
            }
            if (i3 == 3) {
                return new dobr();
            }
            if (i3 == 4) {
                return new dobg();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dobr> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dobr.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
