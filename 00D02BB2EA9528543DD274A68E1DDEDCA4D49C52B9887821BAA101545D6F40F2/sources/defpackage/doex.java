package defpackage;
/* compiled from: PG */
/* renamed from: doex  reason: default package */
/* loaded from: classes6.dex */
public final class doex extends dsqw<doex, does> implements dssk {
    public static final doex f;
    private static volatile dssr<doex> g;
    public int a;
    public String b = "";
    public dsrj<dngk> c = dssu.b;
    public String d = "";
    public dsrj<doew> e = dssu.b;

    static {
        doex doexVar = new doex();
        f = doexVar;
        dsqw.cc(doex.class, doexVar);
    }

    private doex() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0003\u001b\u0004ဈ\u0002\u0005\u001b", new Object[]{"a", "b", "c", dngk.class, "d", "e", doew.class});
            }
            if (i2 == 3) {
                return new doex();
            }
            if (i2 == 4) {
                return new does();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doex> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doex.class) {
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
