package defpackage;
/* compiled from: PG */
/* renamed from: dgzf  reason: default package */
/* loaded from: classes6.dex */
public final class dgzf extends dsqw<dgzf, dgze> implements dssk {
    public static final dgzf d;
    private static volatile dssr<dgzf> e;
    public int a;
    public int b;
    public dgzh c;

    static {
        dgzf dgzfVar = new dgzf();
        d = dgzfVar;
        dsqw.cc(dgzf.class, dgzfVar);
    }

    private dgzf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", dgxt.a, "c"});
            }
            if (i2 == 3) {
                return new dgzf();
            }
            if (i2 == 4) {
                return new dgze();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgzf> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dgzf.class) {
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
