package defpackage;
/* compiled from: PG */
/* renamed from: dbnw  reason: default package */
/* loaded from: classes5.dex */
public final class dbnw extends dsqw<dbnw, dbnv> implements dssk {
    public static final dbnw b;
    private static volatile dssr<dbnw> d;
    public String a = "";
    private int c;

    static {
        dbnw dbnwVar = new dbnw();
        b = dbnwVar;
        dsqw.cc(dbnw.class, dbnwVar);
    }

    private dbnw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dbnw();
            }
            if (i2 == 4) {
                return new dbnv();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dbnw> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dbnw.class) {
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
