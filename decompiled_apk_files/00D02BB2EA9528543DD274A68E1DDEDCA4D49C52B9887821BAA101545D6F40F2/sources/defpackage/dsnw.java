package defpackage;
/* compiled from: PG */
/* renamed from: dsnw  reason: default package */
/* loaded from: classes6.dex */
public final class dsnw extends dsqw<dsnw, dsnv> implements dssk {
    public static final dsnw c;
    private static volatile dssr<dsnw> d;
    public int a;
    public String b = "";

    static {
        dsnw dsnwVar = new dsnw();
        c = dsnwVar;
        dsqw.cc(dsnw.class, dsnwVar);
    }

    private dsnw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dsnw();
            }
            if (i2 == 4) {
                return new dsnv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dsnw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dsnw.class) {
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
