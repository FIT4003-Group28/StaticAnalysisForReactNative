package defpackage;
/* compiled from: PG */
/* renamed from: dpvm  reason: default package */
/* loaded from: classes6.dex */
public final class dpvm extends dsqw<dpvm, dpvl> implements dssk {
    public static final dpvm c;
    private static volatile dssr<dpvm> d;
    public dsrj<dpnf> a = dssu.b;
    public dsrj<dpnc> b = dssu.b;

    static {
        dpvm dpvmVar = new dpvm();
        c = dpvmVar;
        dsqw.cc(dpvm.class, dpvmVar);
    }

    private dpvm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", dpnf.class, "b", dpnc.class});
            }
            if (i2 == 3) {
                return new dpvm();
            }
            if (i2 == 4) {
                return new dpvl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpvm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dpvm.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
