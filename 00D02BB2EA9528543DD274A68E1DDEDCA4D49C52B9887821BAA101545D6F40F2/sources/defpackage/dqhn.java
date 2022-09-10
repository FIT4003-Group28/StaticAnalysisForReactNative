package defpackage;
/* compiled from: PG */
/* renamed from: dqhn  reason: default package */
/* loaded from: classes6.dex */
public final class dqhn extends dsqw<dqhn, dqhk> implements dssk {
    public static final dqhn f;
    private static volatile dssr<dqhn> g;
    public int a;
    public dqhm b;
    public dptm c;
    public String d = "";
    public dpna e;

    static {
        dqhn dqhnVar = new dqhn();
        f = dqhnVar;
        dsqw.cc(dqhn.class, dqhnVar);
    }

    private dqhn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqhn();
            }
            if (i2 == 4) {
                return new dqhk();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqhn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqhn.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
