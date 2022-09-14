package defpackage;
/* compiled from: PG */
/* renamed from: dibs  reason: default package */
/* loaded from: classes6.dex */
public final class dibs extends dsqw<dibs, dibr> implements dssk {
    public static final dibs e;
    private static volatile dssr<dibs> g;
    public int a;
    public dpum b;
    public dnqh c;
    public dprr d;
    private byte f = 2;

    static {
        dibs dibsVar = new dibs();
        e = dibsVar;
        dsqw.cc(dibs.class, dibsVar);
    }

    private dibs() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dibs();
            }
            if (i2 == 4) {
                return new dibr();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<dibs> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dibs.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
