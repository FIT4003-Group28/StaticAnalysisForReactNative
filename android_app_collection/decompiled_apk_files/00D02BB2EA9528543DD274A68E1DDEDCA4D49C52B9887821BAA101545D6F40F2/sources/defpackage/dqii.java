package defpackage;
/* compiled from: PG */
/* renamed from: dqii  reason: default package */
/* loaded from: classes.dex */
public final class dqii extends dsqw<dqii, dqih> implements dssk {
    public static final dqii e;
    private static volatile dssr<dqii> f;
    public int a;
    public dgfs c;
    public String b = "";
    public String d = "";

    static {
        dqii dqiiVar = new dqii();
        e = dqiiVar;
        dsqw.cc(dqii.class, dqiiVar);
    }

    private dqii() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0003\u0004ဉ\u0002", new Object[]{"a", "b", "d", "c"});
            }
            if (i2 == 3) {
                return new dqii();
            }
            if (i2 == 4) {
                return new dqih();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqii> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqii.class) {
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
