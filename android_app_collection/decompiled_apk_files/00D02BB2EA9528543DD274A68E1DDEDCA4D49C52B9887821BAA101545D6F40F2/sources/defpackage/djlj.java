package defpackage;
/* compiled from: PG */
/* renamed from: djlj  reason: default package */
/* loaded from: classes6.dex */
public final class djlj extends dsqw<djlj, djli> implements dssk {
    public static final djlj a;
    private static volatile dssr<djlj> b;

    static {
        djlj djljVar = new djlj();
        a = djljVar;
        dsqw.cc(djlj.class, djljVar);
    }

    private djlj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djlj();
            }
            if (i2 == 4) {
                return new djli();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djlj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djlj.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
