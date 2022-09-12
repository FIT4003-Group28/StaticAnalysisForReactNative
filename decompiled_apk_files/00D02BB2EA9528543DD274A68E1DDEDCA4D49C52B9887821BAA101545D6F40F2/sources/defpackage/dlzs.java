package defpackage;
/* compiled from: PG */
/* renamed from: dlzs  reason: default package */
/* loaded from: classes6.dex */
public final class dlzs extends dsqw<dlzs, dlzn> implements dssk {
    public static final dlzs c;
    private static volatile dssr<dlzs> g;
    public Object b;
    private int d;
    private dnqh e;
    public int a = 0;
    private byte f = 2;

    static {
        dlzs dlzsVar = new dlzs();
        c = dlzsVar;
        dsqw.cc(dlzs.class, dlzsVar);
    }

    private dlzs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ြ\u0000\u0003ြ\u0000\u0004ᐉ\u0001", new Object[]{"b", "a", "d", dlzp.class, dmaa.class, "e"});
            }
            if (i2 == 3) {
                return new dlzs();
            }
            if (i2 == 4) {
                return new dlzn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dlzs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlzs.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
