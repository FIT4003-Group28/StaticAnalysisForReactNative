package defpackage;
/* compiled from: PG */
/* renamed from: drri  reason: default package */
/* loaded from: classes6.dex */
public final class drri extends dsqw<drri, drrg> implements dssk {
    public static final drri e;
    private static volatile dssr<drri> f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;

    static {
        drri drriVar = new drri();
        e = drriVar;
        dsqw.cc(drri.class, drriVar);
    }

    private drri() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဌ\u0002\u0005ဈ\u0001", new Object[]{"a", "b", "d", drrh.a, "c"});
            }
            if (i2 == 3) {
                return new drri();
            }
            if (i2 == 4) {
                return new drrg();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drri> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drri.class) {
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
