package defpackage;
/* compiled from: PG */
/* renamed from: cgcg  reason: default package */
/* loaded from: classes4.dex */
public final class cgcg extends dsqw<cgcg, cgcd> implements dssk {
    public static final cgcg e;
    private static volatile dssr<cgcg> f;
    public int a;
    public String b = "";
    public String c = "";
    public dsrj<cgcf> d = dssu.b;

    static {
        cgcg cgcgVar = new cgcg();
        e = cgcgVar;
        dsqw.cc(cgcg.class, cgcgVar);
    }

    private cgcg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"a", "d", cgcf.class, "b", "c"});
            }
            if (i2 == 3) {
                return new cgcg();
            }
            if (i2 == 4) {
                return new cgcd();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cgcg> dssrVar = f;
            if (dssrVar == null) {
                synchronized (cgcg.class) {
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
