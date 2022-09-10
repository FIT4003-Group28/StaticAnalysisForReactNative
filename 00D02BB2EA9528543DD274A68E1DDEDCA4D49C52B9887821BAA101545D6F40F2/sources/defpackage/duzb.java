package defpackage;
/* compiled from: PG */
/* renamed from: duzb  reason: default package */
/* loaded from: classes6.dex */
public final class duzb extends dsqw<duzb, duys> implements dssk {
    public static final duzb e;
    private static volatile dssr<duzb> f;
    public int a;
    public boolean b;
    public duyy c;
    public duyu d;

    static {
        duzb duzbVar = new duzb();
        e = duzbVar;
        dsqw.cc(duzb.class, duzbVar);
    }

    private duzb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duzb();
            }
            if (i2 == 4) {
                return new duys();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duzb> dssrVar = f;
            if (dssrVar == null) {
                synchronized (duzb.class) {
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
