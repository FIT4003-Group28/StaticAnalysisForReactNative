package defpackage;
/* compiled from: PG */
/* renamed from: djhw  reason: default package */
/* loaded from: classes6.dex */
public final class djhw extends dsqw<djhw, djhv> implements dssk {
    public static final djhw e;
    private static volatile dssr<djhw> h;
    public Object b;
    private int f;
    public int a = 0;
    private byte g = 2;
    public dsrj<djvd> c = dssu.b;
    public String d = "";

    static {
        djhw djhwVar = new djhw();
        e = djhwVar;
        dsqw.cc(djhw.class, djhwVar);
    }

    private djhw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0004\u0001\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001\u001b\u0002ᐼ\u0000\u0004ဈ\u0002\u0005ᐼ\u0000", new Object[]{"b", "a", "f", "c", djvd.class, djeo.class, "d", djds.class});
            }
            if (i2 == 3) {
                return new djhw();
            }
            if (i2 == 4) {
                return new djhv();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<djhw> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djhw.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
