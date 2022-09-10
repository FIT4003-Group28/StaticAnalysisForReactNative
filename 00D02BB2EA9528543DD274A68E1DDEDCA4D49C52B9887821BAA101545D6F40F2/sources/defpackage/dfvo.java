package defpackage;
/* compiled from: PG */
/* renamed from: dfvo  reason: default package */
/* loaded from: classes6.dex */
public final class dfvo extends dsqw<dfvo, dfvn> implements dssk {
    public static final dfvo b;
    private static volatile dssr<dfvo> d;
    public String a = "";
    private int c;

    static {
        dfvo dfvoVar = new dfvo();
        b = dfvoVar;
        dsqw.cc(dfvo.class, dfvoVar);
    }

    private dfvo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dfvo();
            }
            if (i2 == 4) {
                return new dfvn();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dfvo> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dfvo.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
