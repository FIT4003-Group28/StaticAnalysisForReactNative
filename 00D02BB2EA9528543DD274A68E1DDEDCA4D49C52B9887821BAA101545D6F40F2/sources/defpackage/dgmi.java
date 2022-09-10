package defpackage;
/* compiled from: PG */
/* renamed from: dgmi  reason: default package */
/* loaded from: classes6.dex */
public final class dgmi extends dsqw<dgmi, dgmh> implements dssk {
    public static final dgmi f;
    private static volatile dssr<dgmi> g;
    public int a;
    public dgme b;
    public dgaq c;
    public boolean d;
    public dgma e;

    static {
        dgmi dgmiVar = new dgmi();
        f = dgmiVar;
        dsqw.cc(dgmi.class, dgmiVar);
    }

    private dgmi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgmi();
            }
            if (i2 == 4) {
                return new dgmh();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgmi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgmi.class) {
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
