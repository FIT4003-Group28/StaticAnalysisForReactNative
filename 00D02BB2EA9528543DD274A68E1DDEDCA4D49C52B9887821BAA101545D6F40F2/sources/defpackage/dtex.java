package defpackage;
/* compiled from: PG */
/* renamed from: dtex  reason: default package */
/* loaded from: classes6.dex */
public final class dtex extends dsqw<dtex, dtew> implements dssk {
    public static final dtex a;
    private static volatile dssr<dtex> e;
    private int b;
    private dtdh c;
    private byte d = 2;

    static {
        dtex dtexVar = new dtex();
        a = dtexVar;
        dsqw.cc(dtex.class, dtexVar);
    }

    private dtex() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0007", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dtex();
            }
            if (i2 == 4) {
                return new dtew();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<dtex> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dtex.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
