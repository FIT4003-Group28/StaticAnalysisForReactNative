package defpackage;
/* compiled from: PG */
/* renamed from: dzys  reason: default package */
/* loaded from: classes6.dex */
public final class dzys extends dsqw<dzys, dzyr> implements dssk {
    public static final dzys e;
    private static volatile dssr<dzys> f;
    public int a;
    public int b;
    public long c;
    public dzyi d;

    static {
        dzys dzysVar = new dzys();
        e = dzysVar;
        dsqw.cc(dzys.class, dzysVar);
    }

    private dzys() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dzys();
            }
            if (i2 == 4) {
                return new dzyr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzys> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dzys.class) {
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
