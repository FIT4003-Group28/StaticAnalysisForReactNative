package defpackage;
/* compiled from: PG */
/* renamed from: dozl  reason: default package */
/* loaded from: classes6.dex */
public final class dozl extends dsqw<dozl, dozk> implements dssk {
    public static final dozl e;
    private static volatile dssr<dozl> f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        dozl dozlVar = new dozl();
        e = dozlVar;
        dsqw.cc(dozl.class, dozlVar);
    }

    private dozl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0005င\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dozl();
            }
            if (i2 == 4) {
                return new dozk();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dozl> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dozl.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
