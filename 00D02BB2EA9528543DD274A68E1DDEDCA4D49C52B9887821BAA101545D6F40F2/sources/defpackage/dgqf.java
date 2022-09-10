package defpackage;
/* compiled from: PG */
/* renamed from: dgqf  reason: default package */
/* loaded from: classes6.dex */
public final class dgqf extends dsqw<dgqf, dgqe> implements dssk {
    public static final dgqf a;
    private static volatile dssr<dgqf> g;
    private int b;
    private dgrh c;
    private dgrh d;
    private dgrh e;
    private byte f = 2;

    static {
        dgqf dgqfVar = new dgqf();
        a = dgqfVar;
        dsqw.cc(dgqf.class, dgqfVar);
    }

    private dgqf() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgqf();
            }
            if (i2 == 4) {
                return new dgqe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dgqf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgqf.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
