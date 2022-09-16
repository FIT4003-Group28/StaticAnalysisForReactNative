package defpackage;
/* compiled from: PG */
/* renamed from: dlzi  reason: default package */
/* loaded from: classes6.dex */
public final class dlzi extends dsqw<dlzi, dlzh> implements dssk {
    public static final dlzi e;
    private static volatile dssr<dlzi> f;
    public dsrf a = dsqz.b;
    public dsrf b = dsqz.b;
    public dsrf c = dsqz.b;
    public dsrf d = dsqz.b;

    static {
        dlzi dlziVar = new dlzi();
        e = dlziVar;
        dsqw.cc(dlzi.class, dlziVar);
    }

    private dlzi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u0016\u0004\u0016", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlzi();
            }
            if (i2 == 4) {
                return new dlzh();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlzi> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlzi.class) {
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
