package defpackage;
/* compiled from: PG */
/* renamed from: djfl  reason: default package */
/* loaded from: classes6.dex */
public final class djfl extends dsqw<djfl, djfa> implements dssk {
    public static final djfl e;
    private static volatile dssr<djfl> g;
    public int a;
    public Object c;
    public djft d;
    public int b = 0;
    private byte f = 2;

    static {
        djfl djflVar = new djfl();
        e = djflVar;
        dsqw.cc(djfl.class, djflVar);
    }

    private djfl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"c", "b", "a", "d", djfk.class, djfi.class, djfg.class, djfc.class});
            }
            if (i2 == 3) {
                return new djfl();
            }
            if (i2 == 4) {
                return new djfa();
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
            dssr<djfl> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djfl.class) {
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
