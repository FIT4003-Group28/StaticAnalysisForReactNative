package defpackage;
/* compiled from: PG */
/* renamed from: djwe  reason: default package */
/* loaded from: classes6.dex */
public final class djwe extends dsqw<djwe, djwb> implements dssk {
    public static final djwe d;
    private static volatile dssr<djwe> g;
    public int a;
    public djwd b;
    private dnqh e;
    private byte f = 2;
    public int c = 50;

    static {
        djwe djweVar = new djwe();
        d = djweVar;
        dsqw.cc(djwe.class, djweVar);
    }

    private djwe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဉ\u0002\u0004င\u0003", new Object[]{"a", "e", "b", "c"});
            }
            if (i2 == 3) {
                return new djwe();
            }
            if (i2 == 4) {
                return new djwb();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.f = b;
                return null;
            }
            dssr<djwe> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djwe.class) {
                    dssrVar = g;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        g = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.f);
    }
}
