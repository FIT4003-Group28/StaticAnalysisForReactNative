package defpackage;
/* compiled from: PG */
/* renamed from: dpvg  reason: default package */
/* loaded from: classes.dex */
public final class dpvg extends dsqw<dpvg, dpvd> implements dssk {
    public static final dpvg d;
    private static volatile dssr<dpvg> e;
    public int a;
    public int b;
    public String c = "";

    static {
        dpvg dpvgVar = new dpvg();
        d = dpvgVar;
        dsqw.cc(dpvg.class, dpvgVar);
    }

    private dpvg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", dpvf.c(), "c"});
            }
            if (i2 == 3) {
                return new dpvg();
            }
            if (i2 == 4) {
                return new dpvd();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dpvg.class) {
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
