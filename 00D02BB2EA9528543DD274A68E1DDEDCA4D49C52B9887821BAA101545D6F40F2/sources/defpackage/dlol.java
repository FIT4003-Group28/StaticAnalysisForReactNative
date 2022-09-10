package defpackage;
/* compiled from: PG */
/* renamed from: dlol  reason: default package */
/* loaded from: classes6.dex */
public final class dlol extends dsqw<dlol, dlok> implements dssk {
    public static final dlol d;
    private static volatile dssr<dlol> e;
    public int a;
    public dlsw b;
    public long c;

    static {
        dlol dlolVar = new dlol();
        d = dlolVar;
        dsqw.cc(dlol.class, dlolVar);
    }

    private dlol() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dlol();
            }
            if (i2 == 4) {
                return new dlok();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlol> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dlol.class) {
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
