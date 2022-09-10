package defpackage;
/* compiled from: PG */
/* renamed from: dwbm  reason: default package */
/* loaded from: classes6.dex */
public final class dwbm extends dsqw<dwbm, dwbl> implements dssk {
    public static final dwbm c;
    private static volatile dssr<dwbm> d;
    public int a;
    public int b = 1;

    static {
        dwbm dwbmVar = new dwbm();
        c = dwbmVar;
        dsqw.cc(dwbm.class, dwbmVar);
    }

    private dwbm() {
        dspd dspdVar = dspd.b;
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dore.c()});
            }
            if (i2 == 3) {
                return new dwbm();
            }
            if (i2 == 4) {
                return new dwbl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwbm> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwbm.class) {
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
