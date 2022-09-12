package defpackage;
/* compiled from: PG */
/* renamed from: dfhj  reason: default package */
/* loaded from: classes6.dex */
public final class dfhj extends dsqw<dfhj, dfhh> implements dssk {
    public static final dfhj d;
    private static volatile dssr<dfhj> f;
    public int a;
    public dfhg b;
    public int c;
    private byte e = 2;

    static {
        dfhj dfhjVar = new dfhj();
        d = dfhjVar;
        dsqw.cc(dfhj.class, dfhjVar);
    }

    private dfhj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဌ\u0003", new Object[]{"a", "b", "c", dfhi.a});
            }
            if (i2 == 3) {
                return new dfhj();
            }
            if (i2 == 4) {
                return new dfhh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dfhj> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dfhj.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
