package defpackage;
/* compiled from: PG */
/* renamed from: dlgr  reason: default package */
/* loaded from: classes6.dex */
public final class dlgr extends dsqw<dlgr, dlgq> implements dssk {
    public static final dlgr e;
    private static volatile dssr<dlgr> f;
    public int a;
    public dlgp b;
    public String c = "";
    public boolean d;

    static {
        dlgr dlgrVar = new dlgr();
        e = dlgrVar;
        dsqw.cc(dlgr.class, dlgrVar);
    }

    private dlgr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dlgr();
            }
            if (i2 == 4) {
                return new dlgq();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlgr> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlgr.class) {
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
