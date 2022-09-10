package defpackage;
/* compiled from: PG */
/* renamed from: djcm  reason: default package */
/* loaded from: classes6.dex */
public final class djcm extends dsqw<djcm, djcl> implements dssk {
    public static final djcm b;
    private static volatile dssr<djcm> d;
    public long a;
    private int c;

    static {
        djcm djcmVar = new djcm();
        b = djcmVar;
        dsqw.cc(djcm.class, djcmVar);
    }

    private djcm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005ဂ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new djcm();
            }
            if (i2 == 4) {
                return new djcl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djcm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djcm.class) {
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
