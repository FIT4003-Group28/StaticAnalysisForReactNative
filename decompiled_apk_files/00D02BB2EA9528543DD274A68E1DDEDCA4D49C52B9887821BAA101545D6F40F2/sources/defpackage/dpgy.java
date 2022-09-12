package defpackage;
/* compiled from: PG */
/* renamed from: dpgy  reason: default package */
/* loaded from: classes6.dex */
public final class dpgy extends dsqw<dpgy, dpgx> implements dssk {
    public static final dpgy c;
    private static volatile dssr<dpgy> f;
    public int a;
    private int d;
    private byte e = 2;
    public dsrj<dpgh> b = dssu.b;

    static {
        dpgy dpgyVar = new dpgy();
        c = dpgyVar;
        dsqw.cc(dpgy.class, dpgyVar);
    }

    private dpgy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0001\u0000\u0003င\u0002\u0005\u001b", new Object[]{"d", "a", "b", dpgh.class});
            }
            if (i2 == 3) {
                return new dpgy();
            }
            if (i2 == 4) {
                return new dpgx();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dpgy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpgy.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
