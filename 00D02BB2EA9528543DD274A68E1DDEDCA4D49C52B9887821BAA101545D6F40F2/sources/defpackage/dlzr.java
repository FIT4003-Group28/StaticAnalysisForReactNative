package defpackage;
/* compiled from: PG */
/* renamed from: dlzr  reason: default package */
/* loaded from: classes6.dex */
public final class dlzr extends dsqw<dlzr, dlzq> implements dssk {
    public static final dlzr e;
    private static volatile dssr<dlzr> f;
    public int a;
    public String b = "";
    public dgas c;
    public dquj d;

    static {
        dlzr dlzrVar = new dlzr();
        e = dlzrVar;
        dsqw.cc(dlzr.class, dlzrVar);
    }

    private dlzr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlzr();
            }
            if (i2 == 4) {
                return new dlzq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlzr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlzr.class) {
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
