package defpackage;
/* compiled from: PG */
/* renamed from: csjb  reason: default package */
/* loaded from: classes5.dex */
public final class csjb extends dsqw<csjb, csja> implements dssk {
    public static final csjb c;
    private static volatile dssr<csjb> d;
    public int a;
    public long b;

    static {
        csjb csjbVar = new csjb();
        c = csjbVar;
        dsqw.cc(csjb.class, csjbVar);
    }

    private csjb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new csjb();
            }
            if (i2 == 4) {
                return new csja();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<csjb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (csjb.class) {
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
