package defpackage;
/* compiled from: PG */
/* renamed from: dlzl  reason: default package */
/* loaded from: classes6.dex */
public final class dlzl extends dsqw<dlzl, dlzk> implements dssk {
    public static final dlzl c;
    private static volatile dssr<dlzl> d;
    public int a;
    public String b = "";

    static {
        dlzl dlzlVar = new dlzl();
        c = dlzlVar;
        dsqw.cc(dlzl.class, dlzlVar);
    }

    private dlzl() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlzl();
            }
            if (i2 == 4) {
                return new dlzk();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlzl> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlzl.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
