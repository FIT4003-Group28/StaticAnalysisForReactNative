package defpackage;
/* compiled from: PG */
/* renamed from: dtyr  reason: default package */
/* loaded from: classes6.dex */
public final class dtyr extends dsqw<dtyr, dtyq> implements dssk {
    public static final dtyr c;
    private static volatile dssr<dtyr> d;
    public duax a;
    public duch b;

    static {
        dtyr dtyrVar = new dtyr();
        c = dtyrVar;
        dsqw.cc(dtyr.class, dtyrVar);
    }

    private dtyr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dtyr();
            }
            if (i2 == 4) {
                return new dtyq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtyr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtyr.class) {
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
