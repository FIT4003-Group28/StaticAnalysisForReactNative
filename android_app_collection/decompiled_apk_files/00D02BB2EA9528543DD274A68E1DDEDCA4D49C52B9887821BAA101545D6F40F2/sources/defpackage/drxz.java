package defpackage;
/* compiled from: PG */
/* renamed from: drxz  reason: default package */
/* loaded from: classes6.dex */
public final class drxz extends dsqw<drxz, drxy> implements dssk {
    public static final drxz f;
    private static volatile dssr<drxz> g;
    public int a;
    public long c;
    public long e;
    public String b = "";
    public String d = "";

    static {
        drxz drxzVar = new drxz();
        f = drxzVar;
        dsqw.cc(drxz.class, drxzVar);
    }

    private drxz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004", new Object[]{"a", "b", "d", "c", "e"});
            }
            if (i2 == 3) {
                return new drxz();
            }
            if (i2 == 4) {
                return new drxy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drxz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (drxz.class) {
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
