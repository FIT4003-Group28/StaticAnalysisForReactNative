package defpackage;
/* compiled from: PG */
/* renamed from: dgpk  reason: default package */
/* loaded from: classes6.dex */
public final class dgpk extends dsqw<dgpk, dgpj> implements dssk {
    public static final dgpk c;
    private static volatile dssr<dgpk> d;
    public int a;
    public int b;

    static {
        dgpk dgpkVar = new dgpk();
        c = dgpkVar;
        dsqw.cc(dgpk.class, dgpkVar);
    }

    private dgpk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dgpk();
            }
            if (i2 == 4) {
                return new dgpj();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgpk> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dgpk.class) {
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
