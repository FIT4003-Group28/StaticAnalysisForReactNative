package defpackage;
/* compiled from: PG */
/* renamed from: dukd  reason: default package */
/* loaded from: classes6.dex */
public final class dukd extends dsqw<dukd, dukc> implements dssk {
    public static final dukd b;
    private static volatile dssr<dukd> d;
    public int a;
    private int c;

    static {
        dukd dukdVar = new dukd();
        b = dukdVar;
        dsqw.cc(dukd.class, dukdVar);
    }

    private dukd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dukd();
            }
            if (i2 == 4) {
                return new dukc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dukd> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dukd.class) {
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
