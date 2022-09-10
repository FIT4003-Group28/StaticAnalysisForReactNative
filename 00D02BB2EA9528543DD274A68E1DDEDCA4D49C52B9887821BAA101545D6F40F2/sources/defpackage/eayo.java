package defpackage;
/* compiled from: PG */
/* renamed from: eayo  reason: default package */
/* loaded from: classes6.dex */
public final class eayo extends dsqw<eayo, eaxs> implements dssk {
    public static final eayo f;
    private static volatile dssr<eayo> g;
    public int a;
    public int b;
    public dsrj<eaxz> c = dssu.b;
    public eayn d;
    public eaxx e;

    static {
        eayo eayoVar = new eayo();
        f = eayoVar;
        dsqw.cc(eayo.class, eayoVar);
    }

    private eayo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", eayl.a, "c", eaxz.class, "d", "e"});
            }
            if (i2 == 3) {
                return new eayo();
            }
            if (i2 == 4) {
                return new eaxs();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<eayo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (eayo.class) {
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
