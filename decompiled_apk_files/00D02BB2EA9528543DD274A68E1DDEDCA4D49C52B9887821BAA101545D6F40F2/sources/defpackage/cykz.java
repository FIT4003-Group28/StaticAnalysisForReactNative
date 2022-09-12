package defpackage;
/* compiled from: PG */
/* renamed from: cykz  reason: default package */
/* loaded from: classes5.dex */
public final class cykz extends dsqw<cykz, cykx> implements dssk {
    public static final cykz d;
    private static volatile dssr<cykz> e;
    public int a;
    public double b;
    public double c;

    static {
        cykz cykzVar = new cykz();
        d = cykzVar;
        dsqw.cc(cykz.class, cykzVar);
    }

    private cykz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0000", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new cykz();
            }
            if (i2 == 4) {
                return new cykx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cykz> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cykz.class) {
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
