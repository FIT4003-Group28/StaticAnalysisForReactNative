package defpackage;
/* compiled from: PG */
/* renamed from: doys  reason: default package */
/* loaded from: classes6.dex */
public final class doys extends dsqw<doys, doyr> implements dssk {
    public static final doys c;
    private static volatile dssr<doys> e;
    public String a = "";
    public String b = "";
    private int d;

    static {
        doys doysVar = new doys();
        c = doysVar;
        dsqw.cc(doys.class, doysVar);
    }

    private doys() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new doys();
            }
            if (i2 == 4) {
                return new doyr();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doys> dssrVar = e;
            if (dssrVar == null) {
                synchronized (doys.class) {
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
