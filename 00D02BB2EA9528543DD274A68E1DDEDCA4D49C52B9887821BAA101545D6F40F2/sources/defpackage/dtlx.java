package defpackage;
/* compiled from: PG */
/* renamed from: dtlx  reason: default package */
/* loaded from: classes6.dex */
public final class dtlx extends dsqw<dtlx, dtlw> implements dssk {
    public static final dtlx a;
    private static volatile dssr<dtlx> f;
    private int b;
    private dico c;
    private dgrh d;
    private byte e = 2;

    static {
        dtlx dtlxVar = new dtlx();
        a = dtlxVar;
        dsqw.cc(dtlx.class, dtlxVar);
    }

    private dtlx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtlx();
            }
            if (i2 == 4) {
                return new dtlw();
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
            dssr<dtlx> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtlx.class) {
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
