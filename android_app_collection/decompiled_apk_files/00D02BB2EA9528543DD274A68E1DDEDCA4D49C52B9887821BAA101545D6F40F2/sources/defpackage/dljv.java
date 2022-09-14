package defpackage;
/* compiled from: PG */
/* renamed from: dljv  reason: default package */
/* loaded from: classes6.dex */
public final class dljv extends dsqw<dljv, dljs> implements dssk {
    public static final dljv f;
    private static volatile dssr<dljv> g;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        dljv dljvVar = new dljv();
        f = dljvVar;
        dsqw.cc(dljv.class, dljvVar);
    }

    private dljv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0001", new Object[]{"a", "b", dlju.c(), "d", "e", "c"});
            }
            if (i2 == 3) {
                return new dljv();
            }
            if (i2 == 4) {
                return new dljs();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dljv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dljv.class) {
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
