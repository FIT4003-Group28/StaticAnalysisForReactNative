package defpackage;
/* compiled from: PG */
/* renamed from: dwkb  reason: default package */
/* loaded from: classes.dex */
public final class dwkb extends dsqw<dwkb, dwka> implements dssk {
    public static final dwkb e;
    private static volatile dssr<dwkb> g;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        dwkb dwkbVar = new dwkb();
        e = dwkbVar;
        dsqw.cc(dwkb.class, dwkbVar);
    }

    private dwkb() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\b\u000f\u0004\u0000\u0000\u0000\bဇ\u0002\fဇ\u0005\u000eဇ\u0007\u000fဇ\b", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dwkb();
            }
            if (i2 == 4) {
                return new dwka();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwkb> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dwkb.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
