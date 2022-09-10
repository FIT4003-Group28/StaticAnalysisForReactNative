package defpackage;
/* compiled from: PG */
/* renamed from: drqf  reason: default package */
/* loaded from: classes6.dex */
public final class drqf extends dsqw<drqf, drqe> implements dssk {
    public static final drqf b;
    private static volatile dssr<drqf> d;
    public String a = "";
    private int c;

    static {
        drqf drqfVar = new drqf();
        b = drqfVar;
        dsqw.cc(drqf.class, drqfVar);
    }

    private drqf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new drqf();
            }
            if (i2 == 4) {
                return new drqe();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drqf> dssrVar = d;
            if (dssrVar == null) {
                synchronized (drqf.class) {
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
