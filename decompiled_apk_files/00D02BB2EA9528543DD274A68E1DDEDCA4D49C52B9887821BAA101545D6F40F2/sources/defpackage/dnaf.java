package defpackage;
/* compiled from: PG */
/* renamed from: dnaf  reason: default package */
/* loaded from: classes6.dex */
public final class dnaf extends dsqw<dnaf, dnae> implements dssk {
    public static final dnaf d;
    private static volatile dssr<dnaf> e;
    public int a;
    public dsrj<dnaj> b = dssu.b;
    public int c;

    static {
        dnaf dnafVar = new dnaf();
        d = dnafVar;
        dsqw.cc(dnaf.class, dnafVar);
    }

    private dnaf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"a", "b", dnaj.class, "c"});
            }
            if (i2 == 3) {
                return new dnaf();
            }
            if (i2 == 4) {
                return new dnae();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnaf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnaf.class) {
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
