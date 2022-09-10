package defpackage;
/* compiled from: PG */
/* renamed from: djsu  reason: default package */
/* loaded from: classes6.dex */
public final class djsu extends dsqw<djsu, djst> implements dssk {
    public static final djsu e;
    private static volatile dssr<djsu> f;
    public int a;
    public String b = "";
    public String c = "";
    public int d;

    static {
        djsu djsuVar = new djsu();
        e = djsuVar;
        dsqw.cc(djsu.class, djsuVar);
    }

    private djsu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", dray.a});
            }
            if (i2 == 3) {
                return new djsu();
            }
            if (i2 == 4) {
                return new djst();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djsu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djsu.class) {
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
