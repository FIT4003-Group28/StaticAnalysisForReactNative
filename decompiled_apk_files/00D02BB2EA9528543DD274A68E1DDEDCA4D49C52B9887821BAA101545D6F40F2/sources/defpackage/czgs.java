package defpackage;
/* compiled from: PG */
/* renamed from: czgs  reason: default package */
/* loaded from: classes5.dex */
public final class czgs extends dsqw<czgs, czgr> implements dssk {
    public static final czgs b;
    private static volatile dssr<czgs> d;
    public String a = "";
    private int c;

    static {
        czgs czgsVar = new czgs();
        b = czgsVar;
        dsqw.cc(czgs.class, czgsVar);
    }

    private czgs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new czgs();
            }
            if (i2 == 4) {
                return new czgr();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<czgs> dssrVar = d;
            if (dssrVar == null) {
                synchronized (czgs.class) {
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