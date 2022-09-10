package defpackage;
/* compiled from: PG */
/* renamed from: djvf  reason: default package */
/* loaded from: classes6.dex */
public final class djvf extends dsqw<djvf, djve> implements dssk {
    public static final djvf d;
    private static volatile dssr<djvf> g;
    public int a;
    public dqjf b;
    public int c;
    private dnqh e;
    private byte f = 2;

    static {
        djvf djvfVar = new djvf();
        d = djvfVar;
        dsqw.cc(djvf.class, djvfVar);
    }

    private djvf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဌ\u0001\u0004ᐉ\u0004", new Object[]{"a", "b", "c", dqjh.c(), "e"});
            }
            if (i2 == 3) {
                return new djvf();
            }
            if (i2 == 4) {
                return new djve();
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
            dssr<djvf> dssrVar = g;
            if (dssrVar == null) {
                synchronized (djvf.class) {
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
