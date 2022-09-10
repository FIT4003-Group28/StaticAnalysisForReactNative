package defpackage;
/* compiled from: PG */
/* renamed from: dfyz  reason: default package */
/* loaded from: classes6.dex */
public final class dfyz extends dsqw<dfyz, dfyy> implements dssk {
    public static final dfyz f;
    private static volatile dssr<dfyz> g;
    public int a;
    public dgbo c;
    public dsrj<dfyx> b = dssu.b;
    public String d = "";
    public String e = "";

    static {
        dfyz dfyzVar = new dfyz();
        f = dfyzVar;
        dsqw.cc(dfyz.class, dfyzVar);
    }

    private dfyz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0004ဈ\u0002\u0005ဈ\u0001", new Object[]{"a", "b", dfyx.class, "c", "e", "d"});
            }
            if (i2 == 3) {
                return new dfyz();
            }
            if (i2 == 4) {
                return new dfyy();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfyz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dfyz.class) {
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
