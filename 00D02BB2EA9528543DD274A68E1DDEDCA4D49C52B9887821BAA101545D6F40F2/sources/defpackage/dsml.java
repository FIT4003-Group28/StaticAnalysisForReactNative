package defpackage;
/* compiled from: PG */
/* renamed from: dsml  reason: default package */
/* loaded from: classes6.dex */
public final class dsml extends dsqw<dsml, dsmi> implements dssk {
    public static final dsml g;
    private static volatile dssr<dsml> h;
    public int a;
    public dsku c;
    public dsla e;
    public dsla f;
    public dsrj<dsmk> b = dssu.b;
    public dspd d = dspd.b;

    static {
        dsml dsmlVar = new dsml();
        g = dsmlVar;
        dsqw.cc(dsml.class, dsmlVar);
    }

    private dsml() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ည\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", dsmk.class, "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dsml();
            }
            if (i2 == 4) {
                return new dsmi();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsml> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dsml.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
