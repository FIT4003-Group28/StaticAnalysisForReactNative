package defpackage;
/* compiled from: PG */
/* renamed from: dkld  reason: default package */
/* loaded from: classes.dex */
public final class dkld extends dsqw<dkld, dklc> implements dssk {
    public static final dkld b;
    private static volatile dssr<dkld> d;
    public boolean a;
    private int c;

    static {
        dkld dkldVar = new dkld();
        b = dkldVar;
        dsqw.cc(dkld.class, dkldVar);
    }

    private dkld() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dkld();
            }
            if (i2 == 4) {
                return new dklc();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkld> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkld.class) {
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
