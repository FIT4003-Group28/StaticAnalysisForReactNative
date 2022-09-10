package defpackage;
/* compiled from: PG */
/* renamed from: dukr  reason: default package */
/* loaded from: classes.dex */
public final class dukr extends dsqw<dukr, dukq> implements dssk {
    public static final dukr b;
    private static volatile dssr<dukr> d;
    public boolean a;
    private int c;

    static {
        dukr dukrVar = new dukr();
        b = dukrVar;
        dsqw.cc(dukr.class, dukrVar);
    }

    private dukr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dukr();
            }
            if (i2 == 4) {
                return new dukq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dukr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dukr.class) {
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
