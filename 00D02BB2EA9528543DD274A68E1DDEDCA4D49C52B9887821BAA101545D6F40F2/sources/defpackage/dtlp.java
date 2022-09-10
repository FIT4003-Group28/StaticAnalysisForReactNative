package defpackage;
/* compiled from: PG */
/* renamed from: dtlp  reason: default package */
/* loaded from: classes6.dex */
public final class dtlp extends dsqw<dtlp, dtlm> implements dssk {
    public static final dtlp b;
    private static volatile dssr<dtlp> f;
    public int a;
    private int c;
    private duyo d;
    private byte e = 2;

    static {
        dtlp dtlpVar = new dtlp();
        b = dtlpVar;
        dsqw.cc(dtlp.class, dtlpVar);
    }

    private dtlp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0005ဌ\u0002", new Object[]{"c", "d", "a", dtlo.c()});
            }
            if (i2 == 3) {
                return new dtlp();
            }
            if (i2 == 4) {
                return new dtlm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.e = b2;
                return null;
            }
            dssr<dtlp> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtlp.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
