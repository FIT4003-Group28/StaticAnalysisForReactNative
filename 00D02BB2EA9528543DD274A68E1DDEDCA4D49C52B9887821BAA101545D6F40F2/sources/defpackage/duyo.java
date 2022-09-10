package defpackage;
/* compiled from: PG */
/* renamed from: duyo  reason: default package */
/* loaded from: classes6.dex */
public final class duyo extends dsqw<duyo, duyn> implements dssk {
    public static final duyo e;
    private static volatile dssr<duyo> g;
    public int a;
    public dnsj b;
    public duls c;
    public dulh d;
    private byte f = 2;

    static {
        duyo duyoVar = new duyo();
        e = duyoVar;
        dsqw.cc(duyo.class, duyoVar);
    }

    private duyo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new duyo();
            }
            if (i2 == 4) {
                return new duyn();
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
            dssr<duyo> dssrVar = g;
            if (dssrVar == null) {
                synchronized (duyo.class) {
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
