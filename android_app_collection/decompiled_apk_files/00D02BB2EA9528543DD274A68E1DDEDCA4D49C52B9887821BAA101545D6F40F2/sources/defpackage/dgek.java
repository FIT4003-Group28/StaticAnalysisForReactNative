package defpackage;
/* compiled from: PG */
/* renamed from: dgek  reason: default package */
/* loaded from: classes6.dex */
public final class dgek extends dsqw<dgek, dgej> implements dssk {
    public static final dgek c;
    private static volatile dssr<dgek> d;
    public int a;
    public String b = "";

    static {
        dgek dgekVar = new dgek();
        c = dgekVar;
        dsqw.cc(dgek.class, dgekVar);
    }

    private dgek() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgek();
            }
            if (i2 == 4) {
                return new dgej();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgek> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgek.class) {
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
