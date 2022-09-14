package defpackage;
/* compiled from: PG */
/* renamed from: ckwv  reason: default package */
/* loaded from: classes5.dex */
public final class ckwv extends dsqw<ckwv, ckwu> implements dssk {
    public static final ckwv d;
    private static volatile dssr<ckwv> e;
    public int a;
    public long b;
    public ckwt c;

    static {
        ckwv ckwvVar = new ckwv();
        d = ckwvVar;
        dsqw.cc(ckwv.class, ckwvVar);
    }

    private ckwv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new ckwv();
            }
            if (i2 == 4) {
                return new ckwu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckwv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (ckwv.class) {
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
