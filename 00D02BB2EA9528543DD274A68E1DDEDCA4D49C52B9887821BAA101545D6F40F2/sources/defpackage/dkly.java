package defpackage;
/* compiled from: PG */
/* renamed from: dkly  reason: default package */
/* loaded from: classes.dex */
public final class dkly extends dsqw<dkly, dklv> implements dssk {
    public static final dkly d;
    private static volatile dssr<dkly> f;
    public boolean a;
    public int b;
    public boolean c;
    private int e;

    static {
        dkly dklyVar = new dkly();
        d = dklyVar;
        dsqw.cc(dkly.class, dklyVar);
    }

    private dkly() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဌ\u0002\u0005ဇ\u0004", new Object[]{"e", "a", "b", dklw.a, "c"});
            }
            if (i2 == 3) {
                return new dkly();
            }
            if (i2 == 4) {
                return new dklv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkly> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dkly.class) {
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
