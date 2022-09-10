package defpackage;
/* compiled from: PG */
/* renamed from: dovg  reason: default package */
/* loaded from: classes6.dex */
public final class dovg extends dsqw<dovg, dovf> implements dssk {
    public static final dovg b;
    private static volatile dssr<dovg> d;
    public int a;
    private int c;

    static {
        dovg dovgVar = new dovg();
        b = dovgVar;
        dsqw.cc(dovg.class, dovgVar);
    }

    private dovg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dovg();
            }
            if (i2 == 4) {
                return new dovf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dovg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dovg.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
