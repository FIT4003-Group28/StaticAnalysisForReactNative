package defpackage;
/* compiled from: PG */
/* renamed from: djcb  reason: default package */
/* loaded from: classes6.dex */
public final class djcb extends dsqw<djcb, djbp> implements dssk {
    public static final djcb e;
    private static volatile dssr<djcb> h;
    public Object b;
    public dvyw c;
    private int f;
    public int a = 0;
    private byte g = 2;
    public String d = "";

    static {
        djcb djcbVar = new djcb();
        e = djcbVar;
        dsqw.cc(djcb.class, djcbVar);
    }

    private djcb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ဈ\u0004\u0005ြ\u0000", new Object[]{"b", "a", "f", "c", djby.class, djbv.class, "d", djca.class});
            }
            if (i2 == 3) {
                return new djcb();
            }
            if (i2 == 4) {
                return new djbp();
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
            dssr<djcb> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djcb.class) {
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
