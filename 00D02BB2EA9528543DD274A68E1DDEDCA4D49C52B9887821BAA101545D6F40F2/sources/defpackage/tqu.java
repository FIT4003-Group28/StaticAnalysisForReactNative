package defpackage;
/* compiled from: PG */
/* renamed from: tqu  reason: default package */
/* loaded from: classes7.dex */
public final class tqu extends dsqw<tqu, tqf> implements dssk {
    public static final tqu g;
    private static volatile dssr<tqu> h;
    public int a;
    public tqn b;
    public tqr c;
    public tqj d;
    public tqt e;
    public tqh f;

    static {
        tqu tquVar = new tqu();
        g = tquVar;
        dsqw.cc(tqu.class, tquVar);
    }

    private tqu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0002\u0002ဉ\u0003\u0003ဉ\u0004\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "d", "e", "f", "b", "c"});
            }
            if (i2 == 3) {
                return new tqu();
            }
            if (i2 == 4) {
                return new tqf();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<tqu> dssrVar = h;
            if (dssrVar == null) {
                synchronized (tqu.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
