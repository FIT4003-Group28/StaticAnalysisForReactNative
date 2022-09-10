package defpackage;
/* compiled from: PG */
/* renamed from: djqv  reason: default package */
/* loaded from: classes6.dex */
public final class djqv extends dsqw<djqv, djqu> implements dssk {
    public static final djqv c;
    private static volatile dssr<djqv> d;
    public int a;
    public int b;

    static {
        djqv djqvVar = new djqv();
        c = djqvVar;
        dsqw.cc(djqv.class, djqvVar);
    }

    private djqv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dqvh.c()});
            }
            if (i2 == 3) {
                return new djqv();
            }
            if (i2 == 4) {
                return new djqu();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djqv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djqv.class) {
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
