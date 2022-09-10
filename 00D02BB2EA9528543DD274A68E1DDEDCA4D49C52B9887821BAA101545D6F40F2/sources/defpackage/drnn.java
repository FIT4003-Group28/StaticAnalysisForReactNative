package defpackage;
/* compiled from: PG */
/* renamed from: drnn  reason: default package */
/* loaded from: classes6.dex */
public final class drnn extends dsqw<drnn, drnm> implements dssk {
    public static final drnn d;
    private static volatile dssr<drnn> e;
    public int a;
    public String b = "";
    public String c = "";

    static {
        drnn drnnVar = new drnn();
        d = drnnVar;
        dsqw.cc(drnn.class, drnnVar);
    }

    private drnn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဈ\u0000\u0004ဈ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new drnn();
            }
            if (i2 == 4) {
                return new drnm();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drnn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drnn.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
