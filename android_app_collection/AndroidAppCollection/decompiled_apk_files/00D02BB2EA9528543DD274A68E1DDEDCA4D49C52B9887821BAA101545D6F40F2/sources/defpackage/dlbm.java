package defpackage;
/* compiled from: PG */
/* renamed from: dlbm  reason: default package */
/* loaded from: classes6.dex */
public final class dlbm extends dsqw<dlbm, dlbl> implements dssk {
    public static final dlbm a;
    private static volatile dssr<dlbm> e;
    private int b;
    private dnqh c;
    private byte d = 2;

    static {
        dlbm dlbmVar = new dlbm();
        a = dlbmVar;
        dsqw.cc(dlbm.class, dlbmVar);
    }

    private dlbm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dlbm();
            }
            if (i2 == 4) {
                return new dlbl();
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
            dssr<dlbm> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlbm.class) {
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
