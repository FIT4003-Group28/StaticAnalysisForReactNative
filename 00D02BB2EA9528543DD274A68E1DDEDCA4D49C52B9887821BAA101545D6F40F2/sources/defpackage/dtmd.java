package defpackage;
/* compiled from: PG */
/* renamed from: dtmd  reason: default package */
/* loaded from: classes6.dex */
public final class dtmd extends dsqw<dtmd, dtmc> implements dssk {
    public static final dtmd c;
    private static volatile dssr<dtmd> e;
    public int a;
    public djyo b;
    private byte d = 2;

    static {
        dtmd dtmdVar = new dtmd();
        c = dtmdVar;
        dsqw.cc(dtmd.class, dtmdVar);
    }

    private dtmd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtmd();
            }
            if (i2 == 4) {
                return new dtmc();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dtmd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtmd.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
