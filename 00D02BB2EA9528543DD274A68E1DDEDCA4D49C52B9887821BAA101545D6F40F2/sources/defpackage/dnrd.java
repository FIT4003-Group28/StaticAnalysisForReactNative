package defpackage;
/* compiled from: PG */
/* renamed from: dnrd  reason: default package */
/* loaded from: classes6.dex */
public final class dnrd extends dsqw<dnrd, dnrc> implements dssk {
    public static final dnrd b;
    private static volatile dssr<dnrd> c;
    public dsrj<dniu> a = dssu.b;

    static {
        dnrd dnrdVar = new dnrd();
        b = dnrdVar;
        dsqw.cc(dnrd.class, dnrdVar);
    }

    private dnrd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dniu.class});
            }
            if (i2 == 3) {
                return new dnrd();
            }
            if (i2 == 4) {
                return new dnrc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnrd> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dnrd.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
