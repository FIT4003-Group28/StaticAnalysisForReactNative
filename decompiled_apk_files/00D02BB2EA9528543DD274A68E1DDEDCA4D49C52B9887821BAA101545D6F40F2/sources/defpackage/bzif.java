package defpackage;
/* compiled from: PG */
/* renamed from: bzif  reason: default package */
/* loaded from: classes4.dex */
public final class bzif extends dsqw<bzif, bzic> implements dssk {
    public static final bzif f;
    private static volatile dssr<bzif> g;
    public int a;
    public bzie b;
    public boolean c = true;
    public int d = 240;
    public boolean e = true;

    static {
        bzif bzifVar = new bzif();
        f = bzifVar;
        dsqw.cc(bzif.class, bzifVar);
    }

    private bzif() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new bzif();
            }
            if (i2 == 4) {
                return new bzic();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bzif> dssrVar = g;
            if (dssrVar == null) {
                synchronized (bzif.class) {
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
