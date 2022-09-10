package defpackage;
/* compiled from: PG */
/* renamed from: dhep  reason: default package */
/* loaded from: classes6.dex */
public final class dhep extends dsqw<dhep, dhel> implements dssk {
    public static final dhep c;
    private static volatile dssr<dhep> d;
    public dssd<String, dufk> b = dssd.b;
    public dsrj<dhen> a = dssu.b;

    static {
        dhep dhepVar = new dhep();
        c = dhepVar;
        dsqw.cc(dhep.class, dhepVar);
    }

    private dhep() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u001b\u00022", new Object[]{"a", dhen.class, "b", dheo.a});
            }
            if (i2 == 3) {
                return new dhep();
            }
            if (i2 == 4) {
                return new dhel();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhep> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dhep.class) {
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
