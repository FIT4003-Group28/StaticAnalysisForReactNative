package defpackage;
/* compiled from: PG */
/* renamed from: dgeo  reason: default package */
/* loaded from: classes6.dex */
public final class dgeo extends dsqw<dgeo, dgen> implements dssk {
    public static final dgeo c;
    private static volatile dssr<dgeo> d;
    public int a;
    public String b = "";

    static {
        dgeo dgeoVar = new dgeo();
        c = dgeoVar;
        dsqw.cc(dgeo.class, dgeoVar);
    }

    private dgeo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgeo();
            }
            if (i2 == 4) {
                return new dgen();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgeo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgeo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
