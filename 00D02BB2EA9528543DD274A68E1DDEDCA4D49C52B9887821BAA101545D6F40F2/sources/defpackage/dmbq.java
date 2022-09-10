package defpackage;
/* compiled from: PG */
/* renamed from: dmbq  reason: default package */
/* loaded from: classes6.dex */
public final class dmbq extends dsqw<dmbq, dmbp> implements dssk {
    public static final dmbq f;
    private static volatile dssr<dmbq> g;
    public int a;
    public dmas b;
    public dmau c;
    public boolean d;
    public dmbo e;

    static {
        dmbq dmbqVar = new dmbq();
        f = dmbqVar;
        dsqw.cc(dmbq.class, dmbqVar);
    }

    private dmbq() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0004\u0005ဉ\u0006", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dmbq();
            }
            if (i2 == 4) {
                return new dmbp();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmbq> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmbq.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
