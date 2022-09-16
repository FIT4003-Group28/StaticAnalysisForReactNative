package defpackage;
/* compiled from: PG */
/* renamed from: dnwx  reason: default package */
/* loaded from: classes6.dex */
public final class dnwx extends dsqw<dnwx, dnww> implements dssk {
    public static final dnwx f;
    private static volatile dssr<dnwx> h;
    public int a;
    public int b;
    public dsrj<dnwz> c;
    public dnxb d;
    public dnxf e;
    private byte g = 2;

    static {
        dnwx dnwxVar = new dnwx();
        f = dnwxVar;
        dsqw.cc(dnwx.class, dnwxVar);
    }

    private dnwx() {
        dssu<Object> dssuVar = dssu.b;
        this.c = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0001\u0001ဌ\u0002\u0003\u001b\u0006ᐉ\u0006\nဉ\u0005", new Object[]{"a", "b", dnwv.c(), "c", dnwz.class, "e", "d"});
            }
            if (i2 == 3) {
                return new dnwx();
            }
            if (i2 == 4) {
                return new dnww();
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
            dssr<dnwx> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dnwx.class) {
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
