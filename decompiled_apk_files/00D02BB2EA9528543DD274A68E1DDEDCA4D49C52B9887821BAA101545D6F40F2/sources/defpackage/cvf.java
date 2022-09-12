package defpackage;
/* compiled from: PG */
/* renamed from: cvf  reason: default package */
/* loaded from: classes5.dex */
public final class cvf extends dsqw<cvf, cve> implements dssk {
    public static final cvf d;
    private static volatile dssr<cvf> e;
    public int a;
    public int b;
    public int c;

    static {
        cvf cvfVar = new cvf();
        d = cvfVar;
        dsqw.cc(cvf.class, cvfVar);
    }

    private cvf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cvf();
            }
            if (i2 == 4) {
                return new cve();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cvf.class) {
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
