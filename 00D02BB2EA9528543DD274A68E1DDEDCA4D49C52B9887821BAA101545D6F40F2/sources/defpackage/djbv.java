package defpackage;
/* compiled from: PG */
/* renamed from: djbv  reason: default package */
/* loaded from: classes6.dex */
public final class djbv extends dsqw<djbv, djbu> implements dssk {
    public static final djbv c;
    private static volatile dssr<djbv> e;
    public djbo a;
    public djbr b;
    private int d;

    static {
        djbv djbvVar = new djbv();
        c = djbvVar;
        dsqw.cc(djbv.class, djbvVar);
    }

    private djbv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new djbv();
            }
            if (i2 == 4) {
                return new djbu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djbv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (djbv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
