package defpackage;
/* compiled from: PG */
/* renamed from: domf  reason: default package */
/* loaded from: classes.dex */
public final class domf extends dsqw<domf, dome> implements dssk {
    public static final domf d;
    private static volatile dssr<domf> e;
    public int a;
    public long b;
    public int c;

    static {
        domf domfVar = new domf();
        d = domfVar;
        dsqw.cc(domf.class, domfVar);
    }

    private domf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", dqkc.c()});
            }
            if (i2 == 3) {
                return new domf();
            }
            if (i2 == 4) {
                return new dome();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<domf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (domf.class) {
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
