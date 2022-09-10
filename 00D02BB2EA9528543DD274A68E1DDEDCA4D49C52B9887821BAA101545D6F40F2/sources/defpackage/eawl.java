package defpackage;
/* compiled from: PG */
/* renamed from: eawl  reason: default package */
/* loaded from: classes6.dex */
public final class eawl extends dsqw<eawl, eawk> implements dssk {
    public static final eawl d;
    private static volatile dssr<eawl> e;
    public int a;
    public int b;
    public long c = 1;

    static {
        eawl eawlVar = new eawl();
        d = eawlVar;
        dsqw.cc(eawl.class, eawlVar);
    }

    private eawl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဂ\u0002\u0004ဌ\u0001", new Object[]{"a", "c", "b", eaxd.a});
            }
            if (i2 == 3) {
                return new eawl();
            }
            if (i2 == 4) {
                return new eawk();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eawl> dssrVar = e;
            if (dssrVar == null) {
                synchronized (eawl.class) {
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
