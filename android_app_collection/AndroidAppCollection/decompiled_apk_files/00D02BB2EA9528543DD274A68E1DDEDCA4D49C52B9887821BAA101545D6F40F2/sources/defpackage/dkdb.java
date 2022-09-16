package defpackage;
/* compiled from: PG */
/* renamed from: dkdb  reason: default package */
/* loaded from: classes6.dex */
public final class dkdb extends dsqw<dkdb, dkda> implements dssk {
    public static final dkdb c;
    private static volatile dssr<dkdb> d;
    public int a;
    public boolean b;

    static {
        dkdb dkdbVar = new dkdb();
        c = dkdbVar;
        dsqw.cc(dkdb.class, dkdbVar);
    }

    private dkdb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkdb();
            }
            if (i2 == 4) {
                return new dkda();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkdb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkdb.class) {
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
