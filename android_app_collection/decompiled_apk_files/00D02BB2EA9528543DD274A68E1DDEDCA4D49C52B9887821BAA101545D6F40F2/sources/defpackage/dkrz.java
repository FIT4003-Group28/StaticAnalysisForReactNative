package defpackage;
/* compiled from: PG */
/* renamed from: dkrz  reason: default package */
/* loaded from: classes.dex */
public final class dkrz extends dsqw<dkrz, dkry> implements dssk {
    public static final dkrz b;
    private static volatile dssr<dkrz> d;
    public boolean a;
    private int c;

    static {
        dkrz dkrzVar = new dkrz();
        b = dkrzVar;
        dsqw.cc(dkrz.class, dkrzVar);
    }

    private dkrz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkrz();
            }
            if (i2 == 4) {
                return new dkry();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkrz> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkrz.class) {
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
