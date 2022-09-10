package defpackage;
/* compiled from: PG */
/* renamed from: csry  reason: default package */
/* loaded from: classes5.dex */
public final class csry extends dsqw<csry, csrv> implements dssk {
    public static final csry c;
    private static volatile dssr<csry> f;
    public dhdi a;
    public csrx b;
    private int d;
    private byte e = 2;

    static {
        csry csryVar = new csry();
        c = csryVar;
        dsqw.cc(csry.class, csryVar);
    }

    private csry() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            }
            if (i2 == 3) {
                return new csry();
            }
            if (i2 == 4) {
                return new csrv();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.e = b;
                return null;
            }
            dssr<csry> dssrVar = f;
            if (dssrVar == null) {
                synchronized (csry.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.e);
    }
}
