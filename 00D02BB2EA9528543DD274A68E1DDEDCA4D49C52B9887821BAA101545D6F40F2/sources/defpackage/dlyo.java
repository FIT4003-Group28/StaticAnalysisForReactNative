package defpackage;
/* compiled from: PG */
/* renamed from: dlyo  reason: default package */
/* loaded from: classes6.dex */
public final class dlyo extends dsqw<dlyo, dlyn> implements dssk {
    public static final dlyo d;
    private static volatile dssr<dlyo> f;
    public int a;
    public int b;
    public int c;
    private int e;

    static {
        dlyo dlyoVar = new dlyo();
        d = dlyoVar;
        dsqw.cc(dlyo.class, dlyoVar);
    }

    private dlyo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"e", "a", dlyp.a, "b", "c"});
            }
            if (i2 == 3) {
                return new dlyo();
            }
            if (i2 == 4) {
                return new dlyn();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlyo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dlyo.class) {
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