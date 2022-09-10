package defpackage;
/* compiled from: PG */
/* renamed from: dlnv  reason: default package */
/* loaded from: classes6.dex */
public final class dlnv extends dsqw<dlnv, dlns> implements dssk {
    public static final dlnv f;
    private static volatile dssr<dlnv> g;
    public int a;
    public Object c;
    public int e;
    public int b = 0;
    public String d = "";

    static {
        dlnv dlnvVar = new dlnv();
        f = dlnvVar;
        dsqw.cc(dlnv.class, dlnvVar);
    }

    private dlnv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ြ\u0000", new Object[]{"c", "b", "a", "d", "e", dlnq.a, dlnu.class});
            }
            if (i2 == 3) {
                return new dlnv();
            }
            if (i2 == 4) {
                return new dlns();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlnv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlnv.class) {
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
