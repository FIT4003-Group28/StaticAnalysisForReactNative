package defpackage;
/* compiled from: PG */
/* renamed from: djav  reason: default package */
/* loaded from: classes6.dex */
public final class djav extends dsqw<djav, djas> implements dssk {
    public static final djav e;
    private static volatile dssr<djav> g;
    public int a;
    public int b;
    public dnwb c;
    public djgl d;
    private byte f = 2;

    static {
        djav djavVar = new djav();
        e = djavVar;
        dsqw.cc(djav.class, djavVar);
    }

    private djav() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0004ᐉ\u0003", new Object[]{"a", "b", djat.a, "c", "d"});
            }
            if (i2 == 3) {
                return new djav();
            }
            if (i2 == 4) {
                return new djas();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<djav> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djav.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
