package defpackage;
/* compiled from: PG */
/* renamed from: dlmh  reason: default package */
/* loaded from: classes6.dex */
public final class dlmh extends dsqw<dlmh, dlme> implements dssk {
    public static final dlmh d;
    private static volatile dssr<dlmh> f;
    public dspd a = dspd.b;
    public String b = "";
    public int c;
    private int e;

    static {
        dlmh dlmhVar = new dlmh();
        d = dlmhVar;
        dsqw.cc(dlmh.class, dlmhVar);
    }

    private dlmh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", dlmf.a});
            }
            if (i2 == 3) {
                return new dlmh();
            }
            if (i2 == 4) {
                return new dlme();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlmh> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlmh.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
