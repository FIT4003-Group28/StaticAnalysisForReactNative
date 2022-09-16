package defpackage;
/* compiled from: PG */
/* renamed from: dlzx  reason: default package */
/* loaded from: classes6.dex */
public final class dlzx extends dsqw<dlzx, dlzw> implements dssk {
    public static final dlzx e;
    private static volatile dssr<dlzx> h;
    public dmam a;
    public douj c;
    private int f;
    private byte g = 2;
    public String b = "";
    public String d = "";

    static {
        dlzx dlzxVar = new dlzx();
        e = dlzxVar;
        dsqw.cc(dlzx.class, dlzxVar);
    }

    private dlzx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlzx();
            }
            if (i2 == 4) {
                return new dlzw();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dlzx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlzx.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
