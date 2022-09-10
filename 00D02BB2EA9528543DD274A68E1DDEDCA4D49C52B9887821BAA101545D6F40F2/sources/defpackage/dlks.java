package defpackage;
/* compiled from: PG */
/* renamed from: dlks  reason: default package */
/* loaded from: classes6.dex */
public final class dlks extends dsqw<dlks, dlkr> implements dssk {
    public static final dlks e;
    private static volatile dssr<dlks> f;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<dlkq> d = dssu.b;

    static {
        dlks dlksVar = new dlks();
        e = dlksVar;
        dsqw.cc(dlks.class, dlksVar);
    }

    private dlks() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"a", "b", "d", dlkq.class, "c"});
            }
            if (i2 == 3) {
                return new dlks();
            }
            if (i2 == 4) {
                return new dlkr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlks> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlks.class) {
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
