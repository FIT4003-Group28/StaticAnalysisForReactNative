package defpackage;
/* compiled from: PG */
/* renamed from: dwyj  reason: default package */
/* loaded from: classes6.dex */
public final class dwyj extends dsqw<dwyj, dwyh> implements dssk {
    public static final dwyj d;
    private static volatile dssr<dwyj> e;
    public int a;
    public dspd b = dspd.b;
    public int c;

    static {
        dwyj dwyjVar = new dwyj();
        d = dwyjVar;
        dsqw.cc(dwyj.class, dwyjVar);
    }

    private dwyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dwyi.a});
            }
            if (i2 == 3) {
                return new dwyj();
            }
            if (i2 == 4) {
                return new dwyh();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwyj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dwyj.class) {
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
