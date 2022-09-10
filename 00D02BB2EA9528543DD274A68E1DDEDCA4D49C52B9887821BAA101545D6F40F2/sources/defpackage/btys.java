package defpackage;
/* compiled from: PG */
/* renamed from: btys  reason: default package */
/* loaded from: classes.dex */
public final class btys extends dsqw<btys, btyr> implements dssk {
    public static final btys f;
    private static volatile dssr<btys> g;
    public int a;
    public int b = 100;
    public int c = 3;
    public long d = 30000;
    public int e;

    static {
        btys btysVar = new btys();
        f = btysVar;
        dsqw.cc(btys.class, btysVar);
    }

    private btys() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new btys();
            }
            if (i2 == 4) {
                return new btyr();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<btys> dssrVar = g;
            if (dssrVar == null) {
                synchronized (btys.class) {
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
