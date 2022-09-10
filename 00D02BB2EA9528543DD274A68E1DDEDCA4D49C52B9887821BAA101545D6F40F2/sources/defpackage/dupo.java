package defpackage;
/* compiled from: PG */
/* renamed from: dupo  reason: default package */
/* loaded from: classes.dex */
public final class dupo extends dsqw<dupo, dupl> implements dssk {
    public static final dupo b;
    private static volatile dssr<dupo> c;
    public dsrj<dupn> a = dssu.b;

    static {
        dupo dupoVar = new dupo();
        b = dupoVar;
        dsqw.cc(dupo.class, dupoVar);
    }

    private dupo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dupn.class});
            }
            if (i2 == 3) {
                return new dupo();
            }
            if (i2 == 4) {
                return new dupl();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dupo> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dupo.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
