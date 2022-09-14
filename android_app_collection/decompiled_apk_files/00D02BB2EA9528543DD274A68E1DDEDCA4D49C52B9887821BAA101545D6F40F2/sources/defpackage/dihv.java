package defpackage;
/* compiled from: PG */
/* renamed from: dihv  reason: default package */
/* loaded from: classes6.dex */
public final class dihv extends dsqw<dihv, dihu> implements dssk {
    public static final dihv b;
    private static volatile dssr<dihv> d;
    public String a = "";
    private int c;

    static {
        dihv dihvVar = new dihv();
        b = dihvVar;
        dsqw.cc(dihv.class, dihvVar);
    }

    private dihv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dihv();
            }
            if (i2 == 4) {
                return new dihu();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dihv> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dihv.class) {
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
