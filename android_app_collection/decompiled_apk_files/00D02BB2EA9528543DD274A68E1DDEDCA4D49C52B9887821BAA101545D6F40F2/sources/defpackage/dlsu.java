package defpackage;
/* compiled from: PG */
/* renamed from: dlsu  reason: default package */
/* loaded from: classes6.dex */
public final class dlsu extends dsqw<dlsu, dlst> implements dssk {
    public static final dlsu c;
    private static volatile dssr<dlsu> d;
    public int a;
    public ddpk b;

    static {
        dlsu dlsuVar = new dlsu();
        c = dlsuVar;
        dsqw.cc(dlsu.class, dlsuVar);
    }

    private dlsu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dlsu();
            }
            if (i2 == 4) {
                return new dlst();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlsu> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dlsu.class) {
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
