package defpackage;
/* compiled from: PG */
/* renamed from: dqxx  reason: default package */
/* loaded from: classes6.dex */
public final class dqxx extends dsqw<dqxx, dqxv> implements dssk {
    public static final dqxx h;
    private static volatile dssr<dqxx> i;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;

    static {
        dqxx dqxxVar = new dqxx();
        h = dqxxVar;
        dsqw.cc(dqxx.class, dqxxVar);
    }

    private dqxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", dqxw.a, "d", "e", "f", "g"});
            }
            if (i3 == 3) {
                return new dqxx();
            }
            if (i3 == 4) {
                return new dqxv();
            }
            if (i3 == 5) {
                return h;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dqxx> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dqxx.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
