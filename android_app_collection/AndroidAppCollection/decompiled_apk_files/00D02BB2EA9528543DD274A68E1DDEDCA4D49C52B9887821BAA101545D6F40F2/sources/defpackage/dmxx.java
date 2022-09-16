package defpackage;
/* compiled from: PG */
/* renamed from: dmxx  reason: default package */
/* loaded from: classes6.dex */
public final class dmxx extends dsqw<dmxx, dmxw> implements dssk {
    public static final dmxx d;
    private static volatile dssr<dmxx> g;
    public drsu a;
    public int b;
    private int e;
    private byte f = 2;
    public dsrf c = dsqz.b;

    static {
        dmxx dmxxVar = new dmxx();
        d = dmxxVar;
        dsqw.cc(dmxx.class, dmxxVar);
    }

    private dmxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0001\u0002ᐉ\u0001\u0003င\u0002\u0004\u0016", new Object[]{"e", "a", "b", "c"});
            }
            if (i2 == 3) {
                return new dmxx();
            }
            if (i2 == 4) {
                return new dmxw();
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
            dssr<dmxx> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmxx.class) {
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
