package defpackage;
/* compiled from: PG */
/* renamed from: dtce  reason: default package */
/* loaded from: classes6.dex */
public final class dtce extends dsqw<dtce, dtcd> implements dssk {
    public static final dtce c;
    private static volatile dssr<dtce> d;
    public dsri a = dsrx.b;
    public dsrf b = dsqz.b;

    static {
        dtce dtceVar = new dtce();
        c = dtceVar;
        dsqw.cc(dtce.class, dtceVar);
    }

    private dtce() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002'", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtce();
            }
            if (i2 == 4) {
                return new dtcd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtce> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtce.class) {
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
