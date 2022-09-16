package defpackage;
/* compiled from: PG */
/* renamed from: dsbc  reason: default package */
/* loaded from: classes6.dex */
public final class dsbc extends dsqw<dsbc, dsbb> implements dssk {
    public static final dsbc e;
    private static volatile dssr<dsbc> f;
    public int a;
    public String b = "";
    public long c;
    public long d;

    static {
        dsbc dsbcVar = new dsbc();
        e = dsbcVar;
        dsqw.cc(dsbc.class, dsbcVar);
    }

    private dsbc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဂ\u0001\u0004ဈ\u0000\u0005ဂ\u0002", new Object[]{"a", "c", "b", "d"});
            }
            if (i2 == 3) {
                return new dsbc();
            }
            if (i2 == 4) {
                return new dsbb();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsbc> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dsbc.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
