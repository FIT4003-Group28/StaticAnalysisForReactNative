package defpackage;
/* compiled from: PG */
/* renamed from: dfvg  reason: default package */
/* loaded from: classes6.dex */
public final class dfvg extends dsqw<dfvg, dfvf> implements dssk {
    public static final dfvg c;
    private static volatile dssr<dfvg> d;
    public int a;
    public int b;

    static {
        dfvg dfvgVar = new dfvg();
        c = dfvgVar;
        dsqw.cc(dfvg.class, dfvgVar);
    }

    private dfvg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dfvg();
            }
            if (i2 == 4) {
                return new dfvf();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfvg.class) {
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
