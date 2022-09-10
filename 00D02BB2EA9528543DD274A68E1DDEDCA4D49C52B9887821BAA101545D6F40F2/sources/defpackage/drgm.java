package defpackage;
/* compiled from: PG */
/* renamed from: drgm  reason: default package */
/* loaded from: classes6.dex */
public final class drgm extends dsqw<drgm, drgl> implements dssk {
    public static final drgm e;
    private static volatile dssr<drgm> f;
    public int a;
    public drgj b;
    public drgp c;
    public String d = "";

    static {
        drgm drgmVar = new drgm();
        e = drgmVar;
        dsqw.cc(drgm.class, drgmVar);
    }

    private drgm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new drgm();
            }
            if (i2 == 4) {
                return new drgl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgm> dssrVar = f;
            if (dssrVar == null) {
                synchronized (drgm.class) {
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
