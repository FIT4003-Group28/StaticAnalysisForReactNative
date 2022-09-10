package defpackage;
/* compiled from: PG */
/* renamed from: dgmg  reason: default package */
/* loaded from: classes6.dex */
public final class dgmg extends dsqw<dgmg, dgmf> implements dssk {
    public static final dgmg f;
    private static volatile dssr<dgmg> g;
    public int a;
    public int b;
    public int c;
    public dgmi d;
    public dgbo e;

    static {
        dgmg dgmgVar = new dgmg();
        f = dgmgVar;
        dsqw.cc(dgmg.class, dgmgVar);
    }

    private dgmg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgmg();
            }
            if (i2 == 4) {
                return new dgmf();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgmg> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgmg.class) {
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
