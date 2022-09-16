package defpackage;
/* compiled from: PG */
/* renamed from: dtzp  reason: default package */
/* loaded from: classes6.dex */
public final class dtzp extends dsqw<dtzp, dtze> implements dssk {
    public static final dtzp c;
    private static volatile dssr<dtzp> d;
    public dtzl a;
    public dtzo b;

    static {
        dtzp dtzpVar = new dtzp();
        c = dtzpVar;
        dsqw.cc(dtzp.class, dtzpVar);
    }

    private dtzp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtzp();
            }
            if (i2 == 4) {
                return new dtze();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtzp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtzp.class) {
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
