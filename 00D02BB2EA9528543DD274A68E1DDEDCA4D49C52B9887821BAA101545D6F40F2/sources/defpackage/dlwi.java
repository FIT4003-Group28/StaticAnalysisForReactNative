package defpackage;
/* compiled from: PG */
/* renamed from: dlwi  reason: default package */
/* loaded from: classes.dex */
public final class dlwi extends dsqw<dlwi, dlwh> implements dssk {
    public static final dlwi f;
    private static volatile dssr<dlwi> g;
    public int a;
    public dpum b;
    public dlwe c;
    public dhkb d;
    public dlwg e;

    static {
        dlwi dlwiVar = new dlwi();
        f = dlwiVar;
        dsqw.cc(dlwi.class, dlwiVar);
    }

    private dlwi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dlwi();
            }
            if (i2 == 4) {
                return new dlwh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlwi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dlwi.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
