package defpackage;
/* compiled from: PG */
/* renamed from: dkua  reason: default package */
/* loaded from: classes.dex */
public final class dkua extends dsqw<dkua, dktz> implements dssk {
    public static final dkua b;
    private static volatile dssr<dkua> d;
    public boolean a;
    private int c;

    static {
        dkua dkuaVar = new dkua();
        b = dkuaVar;
        dsqw.cc(dkua.class, dkuaVar);
    }

    private dkua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkua();
            }
            if (i2 == 4) {
                return new dktz();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkua> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkua.class) {
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
