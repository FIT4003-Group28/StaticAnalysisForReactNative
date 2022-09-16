package defpackage;
/* compiled from: PG */
/* renamed from: eacb  reason: default package */
/* loaded from: classes6.dex */
public final class eacb extends dsqw<eacb, eabz> implements dssk {
    public static final eacb c;
    private static volatile dssr<eacb> d;
    public int a;
    public int b;

    static {
        eacb eacbVar = new eacb();
        c = eacbVar;
        dsqw.cc(eacb.class, eacbVar);
    }

    private eacb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", eaca.a});
            }
            if (i2 == 3) {
                return new eacb();
            }
            if (i2 == 4) {
                return new eabz();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eacb> dssrVar = d;
            if (dssrVar == null) {
                synchronized (eacb.class) {
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
