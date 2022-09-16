package defpackage;
/* compiled from: PG */
/* renamed from: dmxp  reason: default package */
/* loaded from: classes.dex */
public final class dmxp extends dsqw<dmxp, dmxo> implements dssk {
    public static final dmxp c;
    private static volatile dssr<dmxp> f;
    public dmxh a;
    private int d;
    private byte e = 2;
    public dsrj<dmxj> b = dssu.b;

    static {
        dmxp dmxpVar = new dmxp();
        c = dmxpVar;
        dsqw.cc(dmxp.class, dmxpVar);
    }

    private dmxp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u000b\f\u0002\u0000\u0001\u0002\u000bᐉ\u0004\fЛ", new Object[]{"d", "a", "b", dmxj.class});
            }
            if (i2 == 3) {
                return new dmxp();
            }
            if (i2 == 4) {
                return new dmxo();
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
            dssr<dmxp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dmxp.class) {
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
