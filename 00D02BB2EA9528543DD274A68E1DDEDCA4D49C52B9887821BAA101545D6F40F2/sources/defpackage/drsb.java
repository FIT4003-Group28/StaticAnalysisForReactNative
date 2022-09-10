package defpackage;
/* compiled from: PG */
/* renamed from: drsb  reason: default package */
/* loaded from: classes6.dex */
public final class drsb extends dsqw<drsb, drsa> implements dssk {
    public static final drsb c;
    private static volatile dssr<drsb> d;
    public int a;
    public dspd b = dspd.b;

    static {
        drsb drsbVar = new drsb();
        c = drsbVar;
        dsqw.cc(drsb.class, drsbVar);
    }

    private drsb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new drsb();
            }
            if (i2 == 4) {
                return new drsa();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drsb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drsb.class) {
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
