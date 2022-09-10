package defpackage;
/* compiled from: PG */
/* renamed from: djyk  reason: default package */
/* loaded from: classes6.dex */
public final class djyk extends dsqw<djyk, djyj> implements dssk {
    public static final djyk f;
    private static volatile dssr<djyk> h;
    public int a;
    public douj c;
    private byte g = 2;
    public dsrj<dpce> b = dssu.b;
    public dsrj<dpce> d = dssu.b;
    public dsrj<djzg> e = dssu.b;

    static {
        djyk djykVar = new djyk();
        f = djykVar;
        dsqw.cc(djyk.class, djykVar);
    }

    private djyk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0003\u0004\u0001Л\u0002Л\u0003Л\u0005ᐉ\u0003", new Object[]{"a", "b", dpce.class, "e", djzg.class, "d", dpce.class, "c"});
            }
            if (i2 == 3) {
                return new djyk();
            }
            if (i2 == 4) {
                return new djyj();
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
            dssr<djyk> dssrVar = h;
            if (dssrVar == null) {
                synchronized (djyk.class) {
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
