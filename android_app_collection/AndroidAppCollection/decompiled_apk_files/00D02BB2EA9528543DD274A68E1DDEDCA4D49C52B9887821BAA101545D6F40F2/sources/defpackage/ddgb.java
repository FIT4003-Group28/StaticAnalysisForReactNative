package defpackage;
/* compiled from: PG */
/* renamed from: ddgb  reason: default package */
/* loaded from: classes5.dex */
public final class ddgb extends dsqw<ddgb, ddga> implements dssk {
    public static final ddgb d;
    private static volatile dssr<ddgb> e;
    public int a;
    public boolean b;
    public boolean c;

    static {
        ddgb ddgbVar = new ddgb();
        d = ddgbVar;
        dsqw.cc(ddgb.class, ddgbVar);
    }

    private ddgb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ddgb();
            }
            if (i2 == 4) {
                return new ddga();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddgb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddgb.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
