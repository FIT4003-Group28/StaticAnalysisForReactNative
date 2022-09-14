package defpackage;
/* compiled from: PG */
/* renamed from: dkrv  reason: default package */
/* loaded from: classes.dex */
public final class dkrv extends dsqw<dkrv, dkru> implements dssk {
    public static final dkrv f;
    private static volatile dssr<dkrv> h;
    public boolean a;
    public boolean b;
    public int c;
    public boolean d;
    public boolean e;
    private int g;

    static {
        dkrv dkrvVar = new dkrv();
        f = dkrvVar;
        dsqw.cc(dkrv.class, dkrvVar);
    }

    private dkrv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0012\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0003\u0005င\u0004\tဇ\u0005\u0012ဇ\u0011", new Object[]{"g", "a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dkrv();
            }
            if (i2 == 4) {
                return new dkru();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkrv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dkrv.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
