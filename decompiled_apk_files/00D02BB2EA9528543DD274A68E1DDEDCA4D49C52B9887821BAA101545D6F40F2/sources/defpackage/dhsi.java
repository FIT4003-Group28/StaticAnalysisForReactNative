package defpackage;
/* compiled from: PG */
/* renamed from: dhsi  reason: default package */
/* loaded from: classes6.dex */
public final class dhsi extends dsqw<dhsi, dhsh> implements dssk {
    public static final dhsi e;
    private static volatile dssr<dhsi> g;
    public int a;
    public dmbc b;
    public djgl d;
    private byte f = 2;
    public dsrj<dmba> c = dssu.b;

    static {
        dhsi dhsiVar = new dhsi();
        e = dhsiVar;
        dsqw.cc(dhsi.class, dhsiVar);
    }

    private dhsi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဉ\u0000\u0002\u001b\u0004ᐉ\u0001", new Object[]{"a", "b", "c", dmba.class, "d"});
            }
            if (i2 == 3) {
                return new dhsi();
            }
            if (i2 == 4) {
                return new dhsh();
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
            dssr<dhsi> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dhsi.class) {
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
