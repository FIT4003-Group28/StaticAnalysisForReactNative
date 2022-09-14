package defpackage;
/* compiled from: PG */
/* renamed from: dlzm  reason: default package */
/* loaded from: classes6.dex */
public final class dlzm extends dsqw<dlzm, dlzj> implements dssk {
    public static final dlzm e;
    private static volatile dssr<dlzm> h;
    public int a;
    public dmag b;
    public dmac c;
    private dnqh f;
    private byte g = 2;
    public dsrj<dlzl> d = dssu.b;

    static {
        dlzm dlzmVar = new dlzm();
        e = dlzmVar;
        dsqw.cc(dlzm.class, dlzmVar);
    }

    private dlzm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004\u001b\u0005ᐉ\u0001", new Object[]{"a", "b", "c", "d", dlzl.class, "f"});
            }
            if (i2 == 3) {
                return new dlzm();
            }
            if (i2 == 4) {
                return new dlzj();
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
            dssr<dlzm> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dlzm.class) {
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
