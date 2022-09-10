package defpackage;
/* compiled from: PG */
/* renamed from: eazc  reason: default package */
/* loaded from: classes6.dex */
public final class eazc extends dsqw<eazc, eazb> implements dssk {
    public static final eazc g;
    private static volatile dssr<eazc> h;
    public int a;
    public int b;
    public long c;
    public boolean d;
    public boolean e;
    public int f;

    static {
        eazc eazcVar = new eazc();
        g = eazcVar;
        dsqw.cc(eazc.class, eazcVar);
    }

    private eazc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new eazc();
            }
            if (i2 == 4) {
                return new eazb();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eazc> dssrVar = h;
            if (dssrVar == null) {
                synchronized (eazc.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
