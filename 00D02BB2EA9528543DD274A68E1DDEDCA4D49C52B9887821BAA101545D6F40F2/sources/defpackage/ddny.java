package defpackage;
/* compiled from: PG */
/* renamed from: ddny  reason: default package */
/* loaded from: classes6.dex */
public final class ddny extends dsqw<ddny, ddnx> implements dssk {
    public static final ddny d;
    private static volatile dssr<ddny> e;
    public int a;
    public int b;
    public boolean c;

    static {
        ddny ddnyVar = new ddny();
        d = ddnyVar;
        dsqw.cc(ddny.class, ddnyVar);
    }

    private ddny() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", ddnk.c(), "c"});
            }
            if (i2 == 3) {
                return new ddny();
            }
            if (i2 == 4) {
                return new ddnx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddny> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ddny.class) {
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
