package defpackage;
/* compiled from: PG */
/* renamed from: djeo  reason: default package */
/* loaded from: classes6.dex */
public final class djeo extends dsqw<djeo, djen> implements dssk {
    public static final djeo d;
    private static volatile dssr<djeo> f;
    public int a;
    public dwlh b;
    public int c;
    private byte e = 2;

    static {
        djeo djeoVar = new djeo();
        d = djeoVar;
        dsqw.cc(djeo.class, djeoVar);
    }

    private djeo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new djeo();
            }
            if (i2 == 4) {
                return new djen();
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
            dssr<djeo> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djeo.class) {
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
