package defpackage;
/* compiled from: PG */
/* renamed from: dtsu  reason: default package */
/* loaded from: classes6.dex */
public final class dtsu extends dsqw<dtsu, dtss> implements dssk {
    public static final dtsu e;
    private static volatile dssr<dtsu> f;
    public int a;
    public String b = "";
    public dsrf c = dsqz.b;
    public int d;

    static {
        dtsu dtsuVar = new dtsu();
        e = dtsuVar;
        dsqw.cc(dtsu.class, dtsuVar);
    }

    private dtsu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003,\u0004\u0004", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtsu();
            }
            if (i2 == 4) {
                return new dtss();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtsu> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtsu.class) {
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
