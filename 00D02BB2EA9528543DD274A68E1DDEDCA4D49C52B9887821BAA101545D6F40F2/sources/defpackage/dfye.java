package defpackage;
/* compiled from: PG */
/* renamed from: dfye  reason: default package */
/* loaded from: classes6.dex */
public final class dfye extends dsqw<dfye, dfyd> implements dssk {
    public static final dfye f;
    private static volatile dssr<dfye> g;
    public int a;
    public dfwp b;
    public dfvy c;
    public dfxb d;
    public dfwg e;

    static {
        dfye dfyeVar = new dfye();
        f = dfyeVar;
        dsqw.cc(dfye.class, dfyeVar);
    }

    private dfye() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dfye();
            }
            if (i2 == 4) {
                return new dfyd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfye> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfye.class) {
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
