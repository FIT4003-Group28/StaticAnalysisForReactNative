package defpackage;
/* compiled from: PG */
/* renamed from: bxak  reason: default package */
/* loaded from: classes4.dex */
public final class bxak extends dsqw<bxak, bxaj> implements dssk {
    public static final bxak d;
    private static volatile dssr<bxak> f;
    public boolean a;
    public boolean b;
    public boolean c;
    private int e;

    static {
        bxak bxakVar = new bxak();
        d = bxakVar;
        dsqw.cc(bxak.class, bxakVar);
    }

    private bxak() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new bxak();
            }
            if (i2 == 4) {
                return new bxaj();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<bxak> dssrVar = f;
            if (dssrVar == null) {
                synchronized (bxak.class) {
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
