package defpackage;
/* compiled from: PG */
/* renamed from: dicg  reason: default package */
/* loaded from: classes6.dex */
public final class dicg extends dsqw<dicg, dicf> implements dssk {
    public static final dicg b;
    private static volatile dssr<dicg> e;
    public int a;
    private dnqh c;
    private byte d = 2;

    static {
        dicg dicgVar = new dicg();
        b = dicgVar;
        dsqw.cc(dicg.class, dicgVar);
    }

    private dicg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"a", "c"});
            }
            if (i2 == 3) {
                return new dicg();
            }
            if (i2 == 4) {
                return new dicf();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<dicg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dicg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
