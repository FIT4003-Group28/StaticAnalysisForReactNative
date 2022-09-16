package defpackage;
/* compiled from: PG */
/* renamed from: dtbm  reason: default package */
/* loaded from: classes6.dex */
public final class dtbm extends dsqw<dtbm, dtbl> implements dssk {
    public static final dtbm c;
    private static volatile dssr<dtbm> e;
    public int a;
    public int b;
    private int d;

    static {
        dtbm dtbmVar = new dtbm();
        c = dtbmVar;
        dsqw.cc(dtbm.class, dtbmVar);
    }

    private dtbm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dtbm();
            }
            if (i2 == 4) {
                return new dtbl();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtbm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtbm.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
