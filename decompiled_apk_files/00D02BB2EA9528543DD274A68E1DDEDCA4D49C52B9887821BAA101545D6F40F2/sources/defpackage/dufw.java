package defpackage;
/* compiled from: PG */
/* renamed from: dufw  reason: default package */
/* loaded from: classes6.dex */
public final class dufw extends dsqw<dufw, dufv> implements dssk {
    public static final dufw b;
    private static volatile dssr<dufw> d;
    public String a = "";
    private int c;

    static {
        dufw dufwVar = new dufw();
        b = dufwVar;
        dsqw.cc(dufw.class, dufwVar);
    }

    private dufw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dufw();
            }
            if (i2 == 4) {
                return new dufv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dufw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dufw.class) {
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
