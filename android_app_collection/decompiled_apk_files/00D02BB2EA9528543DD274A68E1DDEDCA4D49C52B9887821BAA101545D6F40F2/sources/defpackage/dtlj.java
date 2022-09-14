package defpackage;
/* compiled from: PG */
/* renamed from: dtlj  reason: default package */
/* loaded from: classes6.dex */
public final class dtlj extends dsqs<dtlj, dtli> implements dsqt {
    public static final dtlj b;
    private static volatile dssr<dtlj> d;
    private byte c = 2;
    public dsrj<dtku> a = dssu.b;

    static {
        dtlj dtljVar = new dtlj();
        b = dtljVar;
        dsqw.cc(dtlj.class, dtljVar);
    }

    private dtlj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", dtku.class});
            }
            if (i2 == 3) {
                return new dtlj();
            }
            if (i2 == 4) {
                return new dtli();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.c = b2;
                return null;
            }
            dssr<dtlj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtlj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
