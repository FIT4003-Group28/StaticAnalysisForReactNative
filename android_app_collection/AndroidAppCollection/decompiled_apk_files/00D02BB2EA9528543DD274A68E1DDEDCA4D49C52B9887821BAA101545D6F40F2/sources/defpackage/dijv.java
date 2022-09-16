package defpackage;
/* compiled from: PG */
/* renamed from: dijv  reason: default package */
/* loaded from: classes6.dex */
public final class dijv extends dsqw<dijv, diju> implements dssk {
    public static final dijv c;
    private static volatile dssr<dijv> f;
    public int a;
    public int b;
    private dnqh d;
    private byte e = 2;

    static {
        dijv dijvVar = new dijv();
        c = dijvVar;
        dsqw.cc(dijv.class, dijvVar);
    }

    private dijv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "d", "b"});
            }
            if (i2 == 3) {
                return new dijv();
            }
            if (i2 == 4) {
                return new diju();
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
            dssr<dijv> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dijv.class) {
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
