package defpackage;
/* compiled from: PG */
/* renamed from: dmod  reason: default package */
/* loaded from: classes6.dex */
public final class dmod extends dsqw<dmod, dmoc> implements dssk {
    public static final dmod d;
    private static volatile dssr<dmod> e;
    public dsrj<dmof> a = dssu.b;
    public dsrj<dmof> b = dssu.b;
    public dsrj<dmof> c = dssu.b;

    static {
        dmod dmodVar = new dmod();
        d = dmodVar;
        dsqw.cc(dmod.class, dmodVar);
    }

    private dmod() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new Object[]{"a", dmof.class, "b", dmof.class, "c", dmof.class});
            }
            if (i2 == 3) {
                return new dmod();
            }
            if (i2 == 4) {
                return new dmoc();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmod> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmod.class) {
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
