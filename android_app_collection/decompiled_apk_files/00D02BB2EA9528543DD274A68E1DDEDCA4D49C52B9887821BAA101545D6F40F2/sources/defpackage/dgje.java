package defpackage;
/* compiled from: PG */
/* renamed from: dgje  reason: default package */
/* loaded from: classes6.dex */
public final class dgje extends dsqw<dgje, dgjd> implements dssk {
    public static final dgje f;
    private static volatile dssr<dgje> g;
    public int a;
    public dgjc b;
    public dgio c;
    public dgjm d;
    public int e;

    static {
        dgje dgjeVar = new dgje();
        f = dgjeVar;
        dsqw.cc(dgje.class, dgjeVar);
    }

    private dgje() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", "e", dgiz.a});
            }
            if (i2 == 3) {
                return new dgje();
            }
            if (i2 == 4) {
                return new dgjd();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dgje> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgje.class) {
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
