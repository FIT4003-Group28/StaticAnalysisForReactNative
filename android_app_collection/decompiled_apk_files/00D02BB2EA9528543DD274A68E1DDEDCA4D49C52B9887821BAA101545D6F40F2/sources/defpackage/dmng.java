package defpackage;
/* compiled from: PG */
/* renamed from: dmng  reason: default package */
/* loaded from: classes.dex */
public final class dmng extends dsqw<dmng, dmnf> implements dssk {
    public static final dmng e;
    private static volatile dssr<dmng> g;
    public int a;
    public float b;
    public boolean c;
    public dgrn d;
    private byte f = 2;

    static {
        dmng dmngVar = new dmng();
        e = dmngVar;
        dsqw.cc(dmng.class, dmngVar);
    }

    private dmng() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ခ\u0000\u0002ဇ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dmng();
            }
            if (i2 == 4) {
                return new dmnf();
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
            dssr<dmng> dssrVar = g;
            if (dssrVar == null) {
                synchronized (dmng.class) {
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
