package defpackage;
/* compiled from: PG */
/* renamed from: dgqz  reason: default package */
/* loaded from: classes6.dex */
public final class dgqz extends dsqw<dgqz, dgqy> implements dssk {
    public static final dgqz a;
    private static volatile dssr<dgqz> g;
    private int b;
    private int c;
    private int d;
    private dtro e;
    private byte f = 2;

    static {
        dgqz dgqzVar = new dgqz();
        a = dgqzVar;
        dsqw.cc(dgqz.class, dgqzVar);
    }

    private dgqz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dgqz();
            }
            if (i2 == 4) {
                return new dgqy();
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
            dssr<dgqz> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dgqz.class) {
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
