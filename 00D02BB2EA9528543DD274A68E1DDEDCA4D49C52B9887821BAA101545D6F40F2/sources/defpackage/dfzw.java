package defpackage;
/* compiled from: PG */
/* renamed from: dfzw  reason: default package */
/* loaded from: classes6.dex */
public final class dfzw extends dsqw<dfzw, dfzv> implements dssk {
    public static final dfzw c;
    private static volatile dssr<dfzw> e;
    public int a;
    public int b;
    private int d;

    static {
        dfzw dfzwVar = new dfzw();
        c = dfzwVar;
        dsqw.cc(dfzw.class, dfzwVar);
    }

    private dfzw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new dfzw();
            }
            if (i2 == 4) {
                return new dfzv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfzw> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dfzw.class) {
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
