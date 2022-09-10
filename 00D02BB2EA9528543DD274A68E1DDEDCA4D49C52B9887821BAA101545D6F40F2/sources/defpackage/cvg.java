package defpackage;
/* compiled from: PG */
/* renamed from: cvg  reason: default package */
/* loaded from: classes5.dex */
public final class cvg extends dsqw<cvg, cvd> implements dssk {
    public static final cvg f;
    private static volatile dssr<cvg> g;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public cvf e;

    static {
        cvg cvgVar = new cvg();
        f = cvgVar;
        dsqw.cc(cvg.class, cvgVar);
    }

    private cvg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u000bဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new cvg();
            }
            if (i2 == 4) {
                return new cvd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (cvg.class) {
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
