package defpackage;
/* compiled from: PG */
/* renamed from: eaxn  reason: default package */
/* loaded from: classes6.dex */
public final class eaxn extends dsqw<eaxn, eaxm> implements dssk {
    public static final eaxn f;
    private static volatile dssr<eaxn> g;
    public int a;
    public boolean b;
    public long c;
    public long d;
    public boolean e;

    static {
        eaxn eaxnVar = new eaxn();
        f = eaxnVar;
        dsqw.cc(eaxn.class, eaxnVar);
    }

    private eaxn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new eaxn();
            }
            if (i2 == 4) {
                return new eaxm();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eaxn> dssrVar = g;
            if (dssrVar == null) {
                synchronized (eaxn.class) {
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
