package defpackage;
/* compiled from: PG */
/* renamed from: dvfu  reason: default package */
/* loaded from: classes6.dex */
public final class dvfu extends dsqw<dvfu, dvft> implements dssk {
    public static final dvfu c;
    private static volatile dssr<dvfu> d;
    public int a;
    public long b;

    static {
        dvfu dvfuVar = new dvfu();
        c = dvfuVar;
        dsqw.cc(dvfu.class, dvfuVar);
    }

    private dvfu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dvfu();
            }
            if (i2 == 4) {
                return new dvft();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvfu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dvfu.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
