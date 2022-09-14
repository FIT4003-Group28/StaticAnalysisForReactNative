package defpackage;
/* compiled from: PG */
/* renamed from: dtdr  reason: default package */
/* loaded from: classes6.dex */
public final class dtdr extends dsqw<dtdr, dtdq> implements dssk {
    public static final dtdr a;
    private static volatile dssr<dtdr> f;
    private int b;
    private dtdv c;
    private dtdv d;
    private byte e = 2;

    static {
        dtdr dtdrVar = new dtdr();
        a = dtdrVar;
        dsqw.cc(dtdr.class, dtdrVar);
    }

    private dtdr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtdr();
            }
            if (i2 == 4) {
                return new dtdq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<dtdr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtdr.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
