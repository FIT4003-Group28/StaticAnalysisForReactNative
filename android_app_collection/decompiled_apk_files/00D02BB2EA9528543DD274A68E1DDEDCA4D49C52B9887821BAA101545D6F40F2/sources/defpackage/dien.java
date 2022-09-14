package defpackage;
/* compiled from: PG */
/* renamed from: dien  reason: default package */
/* loaded from: classes6.dex */
public final class dien extends dsqw<dien, diek> implements dssk {
    public static final dien d;
    private static volatile dssr<dien> e;
    public int a;
    public dspd b = dspd.b;
    public int c;

    static {
        dien dienVar = new dien();
        d = dienVar;
        dsqw.cc(dien.class, dienVar);
    }

    private dien() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", diem.c()});
            }
            if (i2 == 3) {
                return new dien();
            }
            if (i2 == 4) {
                return new diek();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dien> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dien.class) {
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
