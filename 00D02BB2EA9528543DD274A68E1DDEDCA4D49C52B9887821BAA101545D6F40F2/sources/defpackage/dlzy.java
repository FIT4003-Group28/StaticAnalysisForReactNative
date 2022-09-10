package defpackage;
/* compiled from: PG */
/* renamed from: dlzy  reason: default package */
/* loaded from: classes6.dex */
public final class dlzy extends dsqw<dlzy, dlzv> implements dssk {
    public static final dlzy b;
    private static volatile dssr<dlzy> f;
    public dsrj<dlzx> a;
    private int c;
    private dnqh d;
    private byte e = 2;

    static {
        dlzy dlzyVar = new dlzy();
        b = dlzyVar;
        dsqw.cc(dlzy.class, dlzyVar);
    }

    private dlzy() {
        dssu<Object> dssuVar = dssu.b;
        this.a = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0002\u0003ᐉ\u0001\u0004Л", new Object[]{"c", "d", "a", dlzx.class});
            }
            if (i2 == 3) {
                return new dlzy();
            }
            if (i2 == 4) {
                return new dlzv();
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
            dssr<dlzy> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlzy.class) {
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
