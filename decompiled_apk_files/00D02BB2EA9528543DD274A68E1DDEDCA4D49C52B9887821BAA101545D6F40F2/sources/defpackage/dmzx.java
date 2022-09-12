package defpackage;
/* compiled from: PG */
/* renamed from: dmzx  reason: default package */
/* loaded from: classes6.dex */
public final class dmzx extends dsqw<dmzx, dmzw> implements dssk {
    public static final dmzx c;
    private static volatile dssr<dmzx> e;
    public dspd a = dspd.b;
    public dsrf b = dsqz.b;
    private int d;

    static {
        dmzx dmzxVar = new dmzx();
        c = dmzxVar;
        dsqw.cc(dmzx.class, dmzxVar);
    }

    private dmzx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ည\u0000\u0002\u0016", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dmzx();
            }
            if (i2 == 4) {
                return new dmzw();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmzx> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmzx.class) {
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
