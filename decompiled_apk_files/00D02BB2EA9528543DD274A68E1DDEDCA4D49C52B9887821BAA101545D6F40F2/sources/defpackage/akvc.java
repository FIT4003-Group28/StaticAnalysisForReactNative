package defpackage;
/* compiled from: PG */
/* renamed from: akvc  reason: default package */
/* loaded from: classes2.dex */
public final class akvc extends dsqw<akvc, akvb> implements dssk {
    public static final akvc c;
    private static volatile dssr<akvc> d;
    public int a;
    public boolean b;

    static {
        akvc akvcVar = new akvc();
        c = akvcVar;
        dsqw.cc(akvc.class, akvcVar);
    }

    private akvc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new akvc();
            }
            if (i2 == 4) {
                return new akvb();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<akvc> dssrVar = d;
            if (dssrVar == null) {
                synchronized (akvc.class) {
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
