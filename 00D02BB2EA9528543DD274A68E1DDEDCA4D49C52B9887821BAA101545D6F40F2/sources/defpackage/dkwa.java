package defpackage;
/* compiled from: PG */
/* renamed from: dkwa  reason: default package */
/* loaded from: classes.dex */
public final class dkwa extends dsqw<dkwa, dkvz> implements dssk {
    public static final dkwa e;
    private static volatile dssr<dkwa> g;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    private int f;

    static {
        dkwa dkwaVar = new dkwa();
        e = dkwaVar;
        dsqw.cc(dkwa.class, dkwaVar);
    }

    private dkwa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"f", "a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dkwa();
            }
            if (i2 == 4) {
                return new dkvz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkwa> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dkwa.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
