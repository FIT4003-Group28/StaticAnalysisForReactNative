package defpackage;
/* compiled from: PG */
/* renamed from: djkc  reason: default package */
/* loaded from: classes6.dex */
public final class djkc extends dsqw<djkc, djka> implements dssk {
    public static final djkc c;
    private static volatile dssr<djkc> d;
    public int a;
    public int b;

    static {
        djkc djkcVar = new djkc();
        c = djkcVar;
        dsqw.cc(djkc.class, djkcVar);
    }

    private djkc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", djkb.a});
            }
            if (i2 == 3) {
                return new djkc();
            }
            if (i2 == 4) {
                return new djka();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djkc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djkc.class) {
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
