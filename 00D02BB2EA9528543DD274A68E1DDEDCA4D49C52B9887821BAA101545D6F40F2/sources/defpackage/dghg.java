package defpackage;
/* compiled from: PG */
/* renamed from: dghg  reason: default package */
/* loaded from: classes.dex */
public final class dghg extends dsqw<dghg, dghf> implements dssk {
    public static final dghg b;
    private static volatile dssr<dghg> d;
    public String a = "";
    private int c;

    static {
        dghg dghgVar = new dghg();
        b = dghgVar;
        dsqw.cc(dghg.class, dghgVar);
    }

    private dghg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dghg();
            }
            if (i2 == 4) {
                return new dghf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dghg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dghg.class) {
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
