package defpackage;
/* compiled from: PG */
/* renamed from: dlvu  reason: default package */
/* loaded from: classes6.dex */
public final class dlvu extends dsqw<dlvu, dlvl> implements dssk {
    public static final dlvu e;
    private static volatile dssr<dlvu> g;
    public dlvt a;
    public dlvr b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        dlvu dlvuVar = new dlvu();
        e = dlvuVar;
        dsqw.cc(dlvu.class, dlvuVar);
    }

    private dlvu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0005ဈ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlvu();
            }
            if (i2 == 4) {
                return new dlvl();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlvu> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlvu.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
