package defpackage;
/* compiled from: PG */
/* renamed from: djae  reason: default package */
/* loaded from: classes6.dex */
public final class djae extends dsqw<djae, djab> implements dssk {
    public static final djae e;
    private static volatile dssr<djae> g;
    public int a;
    public int b;
    public dnwb c;
    public djgl d;
    private byte f = 2;

    static {
        djae djaeVar = new djae();
        e = djaeVar;
        dsqw.cc(djae.class, djaeVar);
    }

    private djae() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0004ᐉ\u0003", new Object[]{"a", "b", djac.a, "c", "d"});
            }
            if (i2 == 3) {
                return new djae();
            }
            if (i2 == 4) {
                return new djab();
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
            dssr<djae> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djae.class) {
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
