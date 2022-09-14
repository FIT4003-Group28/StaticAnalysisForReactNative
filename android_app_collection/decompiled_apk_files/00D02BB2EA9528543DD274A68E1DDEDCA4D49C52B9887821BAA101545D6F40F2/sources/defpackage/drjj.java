package defpackage;
/* compiled from: PG */
/* renamed from: drjj  reason: default package */
/* loaded from: classes6.dex */
public final class drjj extends dsqw<drjj, drji> implements dssk {
    public static final drjj c;
    private static volatile dssr<drjj> e;
    public drjh a;
    public String b = "";
    private int d;

    static {
        drjj drjjVar = new drjj();
        c = drjjVar;
        dsqw.cc(drjj.class, drjjVar);
    }

    private drjj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0004ဈ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new drjj();
            }
            if (i2 == 4) {
                return new drji();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (drjj.class) {
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
