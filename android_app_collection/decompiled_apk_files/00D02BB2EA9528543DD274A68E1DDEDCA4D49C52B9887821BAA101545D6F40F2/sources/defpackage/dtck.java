package defpackage;
/* compiled from: PG */
/* renamed from: dtck  reason: default package */
/* loaded from: classes6.dex */
public final class dtck extends dsqw<dtck, dtcj> implements dssk {
    public static final dtck e;
    private static volatile dssr<dtck> f;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;
    public dsri c = dsrx.b;
    public dsrf d = dsqz.b;

    static {
        dtck dtckVar = new dtck();
        e = dtckVar;
        dsqw.cc(dtck.class, dtckVar);
    }

    private dtck() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001'\u0002%\u0003'\u0004'", new Object[]{"b", "c", "d", "a"});
            }
            if (i2 == 3) {
                return new dtck();
            }
            if (i2 == 4) {
                return new dtcj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtck> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtck.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
