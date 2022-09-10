package defpackage;
/* compiled from: PG */
/* renamed from: drbe  reason: default package */
/* loaded from: classes6.dex */
public final class drbe extends dsqw<drbe, drbd> implements dssk {
    public static final drbe f;
    private static volatile dssr<drbe> h;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    private int g;

    static {
        drbe drbeVar = new drbe();
        f = drbeVar;
        dsqw.cc(drbe.class, drbeVar);
    }

    private drbe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0001\u0006ဈ\u0005", new Object[]{"g", "a", "c", "d", "b", "e"});
            }
            if (i2 == 3) {
                return new drbe();
            }
            if (i2 == 4) {
                return new drbd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drbe> dssrVar = h;
            if (dssrVar == null) {
                synchronized (drbe.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
