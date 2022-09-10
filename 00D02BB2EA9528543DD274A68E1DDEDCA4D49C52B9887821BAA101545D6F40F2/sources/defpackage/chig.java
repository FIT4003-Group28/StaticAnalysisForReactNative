package defpackage;
/* compiled from: PG */
/* renamed from: chig  reason: default package */
/* loaded from: classes4.dex */
public final class chig extends dsqw<chig, chhz> implements dssk {
    public static final chig f;
    private static volatile dssr<chig> h;
    public int a;
    public djfl b;
    public chid c;
    public chib d;
    public chif e;
    private byte g = 2;

    static {
        chig chigVar = new chig();
        f = chigVar;
        dsqw.cc(chig.class, chigVar);
    }

    private chig() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new chig();
            }
            if (i2 == 4) {
                return new chhz();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<chig> dssrVar = h;
            if (dssrVar == null) {
                synchronized (chig.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
