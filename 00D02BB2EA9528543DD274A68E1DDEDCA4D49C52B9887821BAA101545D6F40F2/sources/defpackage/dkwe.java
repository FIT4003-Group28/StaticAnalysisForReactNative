package defpackage;
/* compiled from: PG */
/* renamed from: dkwe  reason: default package */
/* loaded from: classes6.dex */
public final class dkwe extends dsqw<dkwe, dkwd> implements dssk {
    public static final dkwe b;
    private static volatile dssr<dkwe> d;
    public boolean a;
    private int c;

    static {
        dkwe dkweVar = new dkwe();
        b = dkweVar;
        dsqw.cc(dkwe.class, dkweVar);
    }

    private dkwe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkwe();
            }
            if (i2 == 4) {
                return new dkwd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkwe.class) {
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
