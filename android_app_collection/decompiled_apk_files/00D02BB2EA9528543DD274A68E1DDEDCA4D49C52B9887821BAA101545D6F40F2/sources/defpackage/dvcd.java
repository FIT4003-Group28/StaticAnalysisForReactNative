package defpackage;
/* compiled from: PG */
/* renamed from: dvcd  reason: default package */
/* loaded from: classes6.dex */
public final class dvcd extends dsqw<dvcd, dvcc> implements dssk {
    public static final dvcd e;
    private static volatile dssr<dvcd> f;
    public int a;
    public String b = "";
    public dsrj<dvcb> c = dssu.b;
    public int d;

    static {
        dvcd dvcdVar = new dvcd();
        e = dvcdVar;
        dsqw.cc(dvcd.class, dvcdVar);
    }

    private dvcd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဌ\u0002", new Object[]{"a", "b", "c", dvcb.class, "d", dnjq.a});
            }
            if (i2 == 3) {
                return new dvcd();
            }
            if (i2 == 4) {
                return new dvcc();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvcd> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dvcd.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
