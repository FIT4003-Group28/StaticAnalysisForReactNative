package defpackage;
/* compiled from: PG */
/* renamed from: dndv  reason: default package */
/* loaded from: classes.dex */
public final class dndv extends dsqw<dndv, dndu> implements dssk {
    public static final dndv d;
    private static volatile dssr<dndv> e;
    public int a;
    public dsrj<dndt> b = dssu.b;
    public dspd c = dspd.b;

    static {
        dndv dndvVar = new dndv();
        d = dndvVar;
        dsqw.cc(dndv.class, dndvVar);
    }

    private dndv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ည\u0000", new Object[]{"a", "b", dndt.class, "c"});
            }
            if (i2 == 3) {
                return new dndv();
            }
            if (i2 == 4) {
                return new dndu();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dndv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dndv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
