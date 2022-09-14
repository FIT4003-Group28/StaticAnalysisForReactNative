package defpackage;
/* compiled from: PG */
/* renamed from: dozg  reason: default package */
/* loaded from: classes6.dex */
public final class dozg extends dsqw<dozg, dozf> implements dssk {
    public static final dozg b;
    private static volatile dssr<dozg> d;
    public boolean a;
    private int c;

    static {
        dozg dozgVar = new dozg();
        b = dozgVar;
        dsqw.cc(dozg.class, dozgVar);
    }

    private dozg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dozg();
            }
            if (i2 == 4) {
                return new dozf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dozg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dozg.class) {
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
