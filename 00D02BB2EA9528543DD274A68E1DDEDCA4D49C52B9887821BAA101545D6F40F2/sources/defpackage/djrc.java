package defpackage;
/* compiled from: PG */
/* renamed from: djrc  reason: default package */
/* loaded from: classes6.dex */
public final class djrc extends dsqs<djrc, djqz> implements dsqt {
    public static final djrc e;
    private static volatile dssr<djrc> g;
    public int a;
    public dqhj b;
    public dnqh d;
    private byte f = 2;
    public dsrj<djrb> c = dssu.b;

    static {
        djrc djrcVar = new djrc();
        e = djrcVar;
        dsqw.cc(djrc.class, djrcVar);
    }

    private djrc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ᐉ\u0001\u0003ဉ\u0000\u0004\u001b", new Object[]{"a", "d", "b", "c", djrb.class});
            }
            if (i2 == 3) {
                return new djrc();
            }
            if (i2 == 4) {
                return new djqz();
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
            dssr<djrc> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djrc.class) {
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
