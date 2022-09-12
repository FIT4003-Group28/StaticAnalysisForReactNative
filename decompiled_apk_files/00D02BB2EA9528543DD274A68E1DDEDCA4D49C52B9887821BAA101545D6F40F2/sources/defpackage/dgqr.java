package defpackage;
/* compiled from: PG */
/* renamed from: dgqr  reason: default package */
/* loaded from: classes6.dex */
public final class dgqr extends dsqw<dgqr, dgqq> implements dssk {
    public static final dgqr a;
    private static volatile dssr<dgqr> g;
    private int b;
    private int c;
    private dgrh d;
    private dgrh e;
    private byte f = 2;

    static {
        dgqr dgqrVar = new dgqr();
        a = dgqrVar;
        dsqw.cc(dgqr.class, dgqrVar);
    }

    private dgqr() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgqr();
            }
            if (i2 == 4) {
                return new dgqq();
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
            dssr<dgqr> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgqr.class) {
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
