package defpackage;
/* compiled from: PG */
/* renamed from: djia  reason: default package */
/* loaded from: classes6.dex */
public final class djia extends dsqw<djia, djhx> implements dssk {
    public static final djia d;
    private static volatile dssr<djia> f;
    public int a;
    public int b;
    public dpyc c;
    private int e;

    static {
        djia djiaVar = new djia();
        d = djiaVar;
        dsqw.cc(djia.class, djiaVar);
    }

    private djia() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0000\u0003င\u0002\u0004ဌ\u0003\u0006ဉ\u0005", new Object[]{"e", "a", "b", djhy.a, "c"});
            }
            if (i2 == 3) {
                return new djia();
            }
            if (i2 == 4) {
                return new djhx();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djia> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djia.class) {
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
