package defpackage;
/* compiled from: PG */
/* renamed from: doyy  reason: default package */
/* loaded from: classes6.dex */
public final class doyy extends dsqw<doyy, doyv> implements dssk {
    public static final doyy d;
    private static volatile dssr<doyy> g;
    public dowb a;
    public doyx b;
    public dpce c;
    private int e;
    private byte f = 2;

    static {
        doyy doyyVar = new doyy();
        d = doyyVar;
        dsqw.cc(doyy.class, doyyVar);
    }

    private doyy() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new doyy();
            }
            if (i2 == 4) {
                return new doyv();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<doyy> dssrVar = g;
            if (dssrVar == null) {
                synchronized (doyy.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
