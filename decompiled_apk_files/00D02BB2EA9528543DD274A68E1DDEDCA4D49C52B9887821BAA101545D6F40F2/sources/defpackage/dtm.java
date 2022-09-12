package defpackage;
/* compiled from: PG */
/* renamed from: dtm  reason: default package */
/* loaded from: classes6.dex */
public final class dtm extends dsqw<dtm, dtl> implements dssk {
    public static final dtm g;
    private static volatile dssr<dtm> h;
    public int a;
    public dte b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;

    static {
        dtm dtmVar = new dtm();
        g = dtmVar;
        dsqw.cc(dtm.class, dtmVar);
    }

    private dtm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\b\f\u0005\u0000\u0000\u0000\bဉ\u0000\tဇ\u0001\nဇ\u0002\u000bဇ\u0003\fဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new dtm();
            }
            if (i2 == 4) {
                return new dtl();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dtm> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dtm.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
