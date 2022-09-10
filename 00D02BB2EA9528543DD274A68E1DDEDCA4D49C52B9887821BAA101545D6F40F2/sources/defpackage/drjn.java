package defpackage;
/* compiled from: PG */
/* renamed from: drjn  reason: default package */
/* loaded from: classes6.dex */
public final class drjn extends dsqw<drjn, drjm> implements dssk {
    public static final drjn b;
    private static volatile dssr<drjn> d;
    public String a = "";
    private int c;

    static {
        drjn drjnVar = new drjn();
        b = drjnVar;
        dsqw.cc(drjn.class, drjnVar);
    }

    private drjn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drjn();
            }
            if (i2 == 4) {
                return new drjm();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drjn> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drjn.class) {
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
