package defpackage;
/* compiled from: PG */
/* renamed from: djoe  reason: default package */
/* loaded from: classes6.dex */
public final class djoe extends dsqw<djoe, djob> implements dssk {
    public static final djoe c;
    private static volatile dssr<djoe> d;
    public int a;
    public int b;

    static {
        djoe djoeVar = new djoe();
        c = djoeVar;
        dsqw.cc(djoe.class, djoeVar);
    }

    private djoe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", djoc.a});
            }
            if (i2 == 3) {
                return new djoe();
            }
            if (i2 == 4) {
                return new djob();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djoe> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djoe.class) {
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
