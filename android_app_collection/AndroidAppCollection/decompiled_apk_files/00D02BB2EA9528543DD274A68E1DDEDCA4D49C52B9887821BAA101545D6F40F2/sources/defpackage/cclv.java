package defpackage;
/* compiled from: PG */
/* renamed from: cclv  reason: default package */
/* loaded from: classes4.dex */
public final class cclv extends dsqw<cclv, cclu> implements dssk {
    public static final cclv d;
    private static volatile dssr<cclv> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        cclv cclvVar = new cclv();
        d = cclvVar;
        dsqw.cc(cclv.class, cclvVar);
    }

    private cclv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cclv();
            }
            if (i2 == 4) {
                return new cclu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cclv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cclv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
