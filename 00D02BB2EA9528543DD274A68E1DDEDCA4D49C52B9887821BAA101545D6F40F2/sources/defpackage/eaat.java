package defpackage;
/* compiled from: PG */
/* renamed from: eaat  reason: default package */
/* loaded from: classes.dex */
public final class eaat extends dsqw<eaat, eaas> implements dssk {
    public static final eaat f;
    private static volatile dssr<eaat> g;
    public int a;
    public long b;
    public boolean c;
    public int d;
    public String e = "";

    static {
        eaat eaatVar = new eaat();
        f = eaatVar;
        dsqw.cc(eaat.class, eaatVar);
    }

    private eaat() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new eaat();
            }
            if (i2 == 4) {
                return new eaas();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaat> dssrVar = g;
            if (dssrVar == null) {
                synchronized (eaat.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
