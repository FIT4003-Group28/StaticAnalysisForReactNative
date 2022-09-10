package defpackage;
/* compiled from: PG */
/* renamed from: doem  reason: default package */
/* loaded from: classes6.dex */
public final class doem extends dsqw<doem, doel> implements dssk {
    public static final doem f;
    private static volatile dssr<doem> g;
    public int a;
    public String b = "";
    public int c = 2;
    public int d;
    public int e;

    static {
        doem doemVar = new doem();
        f = doemVar;
        dsqw.cc(doem.class, doemVar);
    }

    private doem() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဌ\u0001\u0004ဋ\u0002\u0005ဋ\u0003", new Object[]{"a", "b", "c", doen.a, "d", "e"});
            }
            if (i2 == 3) {
                return new doem();
            }
            if (i2 == 4) {
                return new doel();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doem> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doem.class) {
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
