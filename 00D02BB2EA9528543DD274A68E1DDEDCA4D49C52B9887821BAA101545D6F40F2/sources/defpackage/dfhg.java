package defpackage;
/* compiled from: PG */
/* renamed from: dfhg  reason: default package */
/* loaded from: classes6.dex */
public final class dfhg extends dsqw<dfhg, dfhd> implements dssk {
    public static final dfhg f;
    private static volatile dssr<dfhg> h;
    public int a;
    public dfgo b;
    public dgrh c;
    public dpmd d;
    public dfhf e;
    private byte g = 2;

    static {
        dfhg dfhgVar = new dfhg();
        f = dfhgVar;
        dsqw.cc(dfhg.class, dfhgVar);
    }

    private dfhg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfhg();
            }
            if (i2 == 4) {
                return new dfhd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dfhg> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dfhg.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
