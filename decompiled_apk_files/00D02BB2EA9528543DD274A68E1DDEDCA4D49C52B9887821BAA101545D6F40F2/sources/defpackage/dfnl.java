package defpackage;
/* compiled from: PG */
/* renamed from: dfnl  reason: default package */
/* loaded from: classes6.dex */
public final class dfnl extends dsqw<dfnl, dfnj> implements dssk {
    public static final dfnl n;
    private static volatile dssr<dfnl> o;
    public int a;
    public long b;
    public long c;
    public int d;
    public double e;
    public double f;
    public double g;
    public double h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;

    static {
        dfnl dfnlVar = new dfnl();
        n = dfnlVar;
        dsqw.cc(dfnl.class, dfnlVar);
    }

    private dfnl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007က\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b", new Object[]{"a", "b", "c", "d", dfnk.a, "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            }
            if (i2 == 3) {
                return new dfnl();
            }
            if (i2 == 4) {
                return new dfnj();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfnl> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dfnl.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
