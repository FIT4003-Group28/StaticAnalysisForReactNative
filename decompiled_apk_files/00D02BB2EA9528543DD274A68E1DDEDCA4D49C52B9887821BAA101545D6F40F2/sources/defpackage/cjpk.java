package defpackage;
/* compiled from: PG */
/* renamed from: cjpk  reason: default package */
/* loaded from: classes4.dex */
public final class cjpk extends dsqw<cjpk, cjpj> implements dssk {
    public static final cjpk e;
    private static volatile dssr<cjpk> f;
    public int a;
    public String b = "";
    public boolean c;
    public cjpq d;

    static {
        cjpk cjpkVar = new cjpk();
        e = cjpkVar;
        dsqw.cc(cjpk.class, cjpkVar);
    }

    private cjpk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new cjpk();
            }
            if (i2 == 4) {
                return new cjpj();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cjpk> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cjpk.class) {
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
