package defpackage;
/* compiled from: PG */
/* renamed from: dnvk  reason: default package */
/* loaded from: classes6.dex */
public final class dnvk extends dsqw<dnvk, dnvb> implements dssk {
    public static final dnvk e;
    private static volatile dssr<dnvk> g;
    public int a;
    public dqpe b;
    public dpjx c;
    public dnvj d;
    private byte f = 2;

    static {
        dnvk dnvkVar = new dnvk();
        e = dnvkVar;
        dsqw.cc(dnvk.class, dnvkVar);
    }

    private dnvk() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0001\u0001ဉ\u0001\u0002ဉ\u0002\u0006ᐉ\u0005", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dnvk();
            }
            if (i2 == 4) {
                return new dnvb();
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
            dssr<dnvk> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dnvk.class) {
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
