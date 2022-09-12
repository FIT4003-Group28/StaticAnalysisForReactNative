package defpackage;
/* compiled from: PG */
/* renamed from: dkfu  reason: default package */
/* loaded from: classes6.dex */
public final class dkfu extends dsqw<dkfu, dkft> implements dssk {
    public static final dkfu b;
    private static volatile dssr<dkfu> d;
    public String a = "";
    private int c;

    static {
        dkfu dkfuVar = new dkfu();
        b = dkfuVar;
        dsqw.cc(dkfu.class, dkfuVar);
    }

    private dkfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkfu();
            }
            if (i2 == 4) {
                return new dkft();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkfu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkfu.class) {
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
