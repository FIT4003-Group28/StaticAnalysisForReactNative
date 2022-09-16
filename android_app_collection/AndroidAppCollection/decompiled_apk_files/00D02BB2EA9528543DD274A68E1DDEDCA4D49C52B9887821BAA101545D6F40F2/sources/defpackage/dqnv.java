package defpackage;
/* compiled from: PG */
/* renamed from: dqnv  reason: default package */
/* loaded from: classes6.dex */
public final class dqnv extends dsqw<dqnv, dqnu> implements dssk {
    public static final dqnv f;
    private static volatile dssr<dqnv> g;
    public int a;
    public String b = "";
    public String c;
    public String d;
    public String e;

    static {
        dqnv dqnvVar = new dqnv();
        f = dqnvVar;
        dsqw.cc(dqnv.class, dqnvVar);
    }

    private dqnv() {
        dssu<Object> dssuVar = dssu.b;
        this.c = "";
        this.d = "";
        this.e = "";
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0004ဈ\u0002\u0006ဈ\u0004\u0007ဈ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dqnv();
            }
            if (i2 == 4) {
                return new dqnu();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqnv> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dqnv.class) {
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
