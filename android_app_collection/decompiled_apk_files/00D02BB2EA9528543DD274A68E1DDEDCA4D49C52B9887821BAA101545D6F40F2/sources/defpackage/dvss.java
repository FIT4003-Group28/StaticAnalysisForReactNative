package defpackage;
/* compiled from: PG */
/* renamed from: dvss  reason: default package */
/* loaded from: classes6.dex */
public final class dvss extends dsqw<dvss, dvsr> implements dssk {
    public static final dvss a;
    private static volatile dssr<dvss> e;
    private int b;
    private dwco c;
    private byte d = 2;

    static {
        dvss dvssVar = new dvss();
        a = dvssVar;
        dsqw.cc(dvss.class, dvssVar);
    }

    private dvss() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new dvss();
            }
            if (i2 == 4) {
                return new dvsr();
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
            dssr<dvss> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dvss.class) {
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
