package defpackage;
/* compiled from: PG */
/* renamed from: djsh  reason: default package */
/* loaded from: classes6.dex */
public final class djsh extends dsqw<djsh, djsg> implements dssk {
    public static final djsh e;
    private static volatile dssr<djsh> g;
    public djsj a;
    public int b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        djsh djshVar = new djsh();
        e = djshVar;
        dsqw.cc(djsh.class, djshVar);
    }

    private djsh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new djsh();
            }
            if (i2 == 4) {
                return new djsg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsh> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djsh.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
