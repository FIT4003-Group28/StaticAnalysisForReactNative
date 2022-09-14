package defpackage;
/* compiled from: PG */
/* renamed from: dfmg  reason: default package */
/* loaded from: classes6.dex */
public final class dfmg extends dsqw<dfmg, dfmd> implements dssk {
    public static final dfmg c;
    private static volatile dssr<dfmg> e;
    public dfmz a;
    public int b;
    private int d;

    static {
        dfmg dfmgVar = new dfmg();
        c = dfmgVar;
        dsqw.cc(dfmg.class, dfmgVar);
    }

    private dfmg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", dfmf.c()});
            }
            if (i2 == 3) {
                return new dfmg();
            }
            if (i2 == 4) {
                return new dfmd();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfmg> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfmg.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
