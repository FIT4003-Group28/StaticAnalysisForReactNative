package defpackage;
/* compiled from: PG */
/* renamed from: dnaj  reason: default package */
/* loaded from: classes6.dex */
public final class dnaj extends dsqw<dnaj, dnai> implements dssk {
    public static final dnaj d;
    private static volatile dssr<dnaj> e;
    public int a;
    public dnad b;
    public dnad c;

    static {
        dnaj dnajVar = new dnaj();
        d = dnajVar;
        dsqw.cc(dnaj.class, dnajVar);
    }

    private dnaj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dnaj();
            }
            if (i2 == 4) {
                return new dnai();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnaj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnaj.class) {
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
