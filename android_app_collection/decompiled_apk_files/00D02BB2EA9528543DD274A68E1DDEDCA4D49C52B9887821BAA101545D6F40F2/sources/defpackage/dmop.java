package defpackage;
/* compiled from: PG */
/* renamed from: dmop  reason: default package */
/* loaded from: classes.dex */
public final class dmop extends dsqs<dmop, dmoo> implements dsqt {
    public static final dmop h;
    private static volatile dssr<dmop> j;
    public int a;
    public int b;
    public dmne c;
    public dmpv d;
    public dmqk e;
    public dmtg f;
    public dmrr g;
    private byte i = 2;

    static {
        dmop dmopVar = new dmop();
        h = dmopVar;
        dsqw.cc(dmop.class, dmopVar);
    }

    private dmop() {
    }

    public static dmoo b() {
        return (dmoo) h.bZ();
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001င\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0006ဉ\u0005\bဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            }
            if (i2 == 3) {
                return new dmop();
            }
            if (i2 == 4) {
                return new dmoo();
            }
            if (i2 == 5) {
                return h;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.i = b;
                return null;
            }
            dssr<dmop> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dmop.class) {
                    dssrVar = j;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(h);
                        j = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.i);
    }
}
