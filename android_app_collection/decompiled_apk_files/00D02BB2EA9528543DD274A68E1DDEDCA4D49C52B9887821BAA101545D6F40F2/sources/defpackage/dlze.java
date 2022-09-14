package defpackage;
/* compiled from: PG */
/* renamed from: dlze  reason: default package */
/* loaded from: classes6.dex */
public final class dlze extends dsqw<dlze, dlzc> implements dssk {
    public static final dlze e;
    private static volatile dssr<dlze> f;
    public int a;
    public int c;
    public dssd<Long, dlzi> d = dssd.b;
    public long b = -1;

    static {
        dlze dlzeVar = new dlze();
        e = dlzeVar;
        dsqw.cc(dlze.class, dlzeVar);
    }

    private dlze() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဂ\u0000\u00022\u0003င\u0001", new Object[]{"a", "b", "d", dlzd.a, "c"});
            }
            if (i2 == 3) {
                return new dlze();
            }
            if (i2 == 4) {
                return new dlzc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlze> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlze.class) {
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
