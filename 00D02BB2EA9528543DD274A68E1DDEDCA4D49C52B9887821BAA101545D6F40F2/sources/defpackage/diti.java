package defpackage;
/* compiled from: PG */
/* renamed from: diti  reason: default package */
/* loaded from: classes6.dex */
public final class diti extends dsqw<diti, dith> implements dssk {
    public static final diti b;
    private static volatile dssr<diti> d;
    public dqzv a;
    private int c;

    static {
        diti ditiVar = new diti();
        b = ditiVar;
        dsqw.cc(diti.class, ditiVar);
    }

    private diti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new diti();
            }
            if (i2 == 4) {
                return new dith();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diti> dssrVar = d;
            if (dssrVar == null) {
                synchronized (diti.class) {
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
