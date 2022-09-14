package defpackage;
/* compiled from: PG */
/* renamed from: dwrp  reason: default package */
/* loaded from: classes6.dex */
public final class dwrp extends dsqw<dwrp, dwrn> implements dssk {
    public static final dwrp c;
    private static volatile dssr<dwrp> d;
    public int a;
    public int b;

    static {
        dwrp dwrpVar = new dwrp();
        c = dwrpVar;
        dsqw.cc(dwrp.class, dwrpVar);
    }

    private dwrp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dwro.a});
            }
            if (i2 == 3) {
                return new dwrp();
            }
            if (i2 == 4) {
                return new dwrn();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwrp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwrp.class) {
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
