package defpackage;
/* compiled from: PG */
/* renamed from: djnr  reason: default package */
/* loaded from: classes6.dex */
public final class djnr extends dsqw<djnr, djnp> implements dssk {
    public static final djnr c;
    private static volatile dssr<djnr> d;
    public int a;
    public int b;

    static {
        djnr djnrVar = new djnr();
        c = djnrVar;
        dsqw.cc(djnr.class, djnrVar);
    }

    private djnr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", djnq.a});
            }
            if (i2 == 3) {
                return new djnr();
            }
            if (i2 == 4) {
                return new djnp();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djnr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (djnr.class) {
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
