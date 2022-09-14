package defpackage;
/* compiled from: PG */
/* renamed from: csfl  reason: default package */
/* loaded from: classes5.dex */
public final class csfl extends dsqw<csfl, csfi> implements dssk {
    public static final csfl f;
    private static volatile dssr<csfl> g;
    public int a;
    public String b = "";
    public String c = "";
    public int d = -1;
    public int e = -1;

    static {
        csfl csflVar = new csfl();
        f = csflVar;
        dsqw.cc(csfl.class, csflVar);
    }

    private csfl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", csfj.a, "e", csfj.a});
            }
            if (i2 == 3) {
                return new csfl();
            }
            if (i2 == 4) {
                return new csfi();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csfl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (csfl.class) {
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
