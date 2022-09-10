package defpackage;
/* compiled from: PG */
/* renamed from: dmwj  reason: default package */
/* loaded from: classes.dex */
public final class dmwj extends dsqw<dmwj, dmwi> implements dssk {
    public static final dmwj c;
    private static volatile dssr<dmwj> e;
    public int a;
    public int b;
    private int d;

    static {
        dmwj dmwjVar = new dmwj();
        c = dmwjVar;
        dsqw.cc(dmwj.class, dmwjVar);
    }

    private dmwj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmwj();
            }
            if (i2 == 4) {
                return new dmwi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmwj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmwj.class) {
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
