package defpackage;
/* compiled from: PG */
/* renamed from: djhp  reason: default package */
/* loaded from: classes6.dex */
public final class djhp extends dsqw<djhp, djho> implements dssk {
    public static final djhp b;
    private static volatile dssr<djhp> c;
    public dsrj<djhf> a = dssu.b;

    static {
        djhp djhpVar = new djhp();
        b = djhpVar;
        dsqw.cc(djhp.class, djhpVar);
    }

    private djhp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", djhf.class});
            }
            if (i2 == 3) {
                return new djhp();
            }
            if (i2 == 4) {
                return new djho();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djhp> dssrVar = c;
            if (dssrVar == null) {
                synchronized (djhp.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
