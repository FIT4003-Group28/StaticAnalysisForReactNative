package defpackage;
/* compiled from: PG */
/* renamed from: dnej  reason: default package */
/* loaded from: classes6.dex */
public final class dnej extends dsqw<dnej, dnei> implements dssk {
    public static final dnej b;
    private static volatile dssr<dnej> d;
    public long a;
    private int c;

    static {
        dnej dnejVar = new dnej();
        b = dnejVar;
        dsqw.cc(dnej.class, dnejVar);
    }

    private dnej() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dnej();
            }
            if (i2 == 4) {
                return new dnei();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnej> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnej.class) {
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
