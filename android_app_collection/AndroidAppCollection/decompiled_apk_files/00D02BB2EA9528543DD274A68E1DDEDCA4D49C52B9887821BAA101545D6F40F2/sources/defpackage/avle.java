package defpackage;
/* compiled from: PG */
/* renamed from: avle  reason: default package */
/* loaded from: classes3.dex */
public final class avle extends dsqw<avle, avld> implements dssk {
    public static final avle d;
    private static volatile dssr<avle> f;
    public int a;
    public long b;
    public dlug c;
    private byte e = 2;

    static {
        avle avleVar = new avle();
        d = avleVar;
        dsqw.cc(avle.class, avleVar);
    }

    private avle() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဂ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new avle();
            }
            if (i2 == 4) {
                return new avld();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<avle> dssrVar = f;
            if (dssrVar == null) {
                synchronized (avle.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
