package defpackage;
/* compiled from: PG */
/* renamed from: djhs  reason: default package */
/* loaded from: classes6.dex */
public final class djhs extends dsqw<djhs, djhr> implements dssk {
    public static final djhs d;
    private static volatile dssr<djhs> f;
    public int a;
    public djgl b;
    public djgj c;
    private byte e = 2;

    static {
        djhs djhsVar = new djhs();
        d = djhsVar;
        dsqw.cc(djhs.class, djhsVar);
    }

    private djhs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new djhs();
            }
            if (i2 == 4) {
                return new djhr();
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
            dssr<djhs> dssrVar = f;
            if (dssrVar == null) {
                synchronized (djhs.class) {
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
