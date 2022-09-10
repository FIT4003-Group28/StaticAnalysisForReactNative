package defpackage;
/* compiled from: PG */
/* renamed from: dppv  reason: default package */
/* loaded from: classes6.dex */
public final class dppv extends dsqw<dppv, dppu> implements dssk {
    public static final dppv g;
    private static volatile dssr<dppv> h;
    public int a;
    public dpsn b;
    public dpum c;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        dppv dppvVar = new dppv();
        g = dppvVar;
        dsqw.cc(dppv.class, dppvVar);
    }

    private dppv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0000\u0003ဈ\u0002\u0005ဈ\u0003\u0006ဉ\u0001\u0007ဉ\u0000\bဈ\u0004", new Object[]{"a", "d", "e", "c", "b", "f"});
            }
            if (i2 == 3) {
                return new dppv();
            }
            if (i2 == 4) {
                return new dppu();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dppv> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dppv.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
