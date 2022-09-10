package defpackage;
/* compiled from: PG */
/* renamed from: dkic  reason: default package */
/* loaded from: classes.dex */
public final class dkic extends dsqw<dkic, dkhz> implements dssk {
    public static final dkic d;
    private static volatile dssr<dkic> f;
    public boolean a;
    public int b = 100;
    public int c;
    private int e;

    static {
        dkic dkicVar = new dkic();
        d = dkicVar;
        dsqw.cc(dkic.class, dkicVar);
    }

    private dkic() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", "c", dkia.a});
            }
            if (i2 == 3) {
                return new dkic();
            }
            if (i2 == 4) {
                return new dkhz();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkic> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkic.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
