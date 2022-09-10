package defpackage;
/* compiled from: PG */
/* renamed from: dtza  reason: default package */
/* loaded from: classes.dex */
public final class dtza extends dsqw<dtza, dtyz> implements dssk {
    public static final dtza e;
    private static volatile dssr<dtza> f;
    public int a;
    public int b;
    public String c = "";
    public boolean d;

    static {
        dtza dtzaVar = new dtza();
        e = dtzaVar;
        dsqw.cc(dtza.class, dtzaVar);
    }

    private dtza() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ\u0004\u0007", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dtza();
            }
            if (i2 == 4) {
                return new dtyz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtza> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dtza.class) {
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
