package defpackage;
/* compiled from: PG */
/* renamed from: djua  reason: default package */
/* loaded from: classes6.dex */
public final class djua extends dsqw<djua, djtt> implements dssk {
    public static final djua c;
    private static volatile dssr<djua> e;
    public String a = "";
    public djtz b;
    private int d;

    static {
        djua djuaVar = new djua();
        c = djuaVar;
        dsqw.cc(djua.class, djuaVar);
    }

    private djua() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djua();
            }
            if (i2 == 4) {
                return new djtt();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djua> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djua.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
