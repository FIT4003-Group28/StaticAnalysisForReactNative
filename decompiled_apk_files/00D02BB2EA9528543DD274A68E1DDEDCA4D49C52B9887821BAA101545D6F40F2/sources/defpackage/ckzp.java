package defpackage;
/* compiled from: PG */
/* renamed from: ckzp  reason: default package */
/* loaded from: classes5.dex */
public final class ckzp extends dsqw<ckzp, ckzo> implements dssk {
    public static final ckzp f;
    private static volatile dssr<ckzp> g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ckzp ckzpVar = new ckzp();
        f = ckzpVar;
        dsqw.cc(ckzp.class, ckzpVar);
    }

    private ckzp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new ckzp();
            }
            if (i2 == 4) {
                return new ckzo();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzp> dssrVar = g;
            if (dssrVar == null) {
                synchronized (ckzp.class) {
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
