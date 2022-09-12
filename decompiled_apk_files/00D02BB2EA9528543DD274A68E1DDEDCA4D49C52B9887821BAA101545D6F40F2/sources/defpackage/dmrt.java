package defpackage;
/* compiled from: PG */
/* renamed from: dmrt  reason: default package */
/* loaded from: classes.dex */
public final class dmrt extends dsqs<dmrt, dmrs> implements dsqt {
    public static final dmrt k;
    private static volatile dssr<dmrt> m;
    public int a;
    public dmrz b;
    public dmot c;
    public dmrv d;
    public long e;
    public dndz f;
    public dndz g;
    public int h;
    public int i;
    public boolean j;
    private byte l = 2;

    static {
        dmrt dmrtVar = new dmrt();
        k = dmrtVar;
        dsqw.cc(dmrt.class, dmrtVar);
    }

    private dmrt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004စ\u0003\u0005ဉ\u0004\u0007ဉ\u0005\bင\u0007\tင\b\nဇ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new dmrt();
            }
            if (i2 == 4) {
                return new dmrs();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.l = b;
                return null;
            }
            dssr<dmrt> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dmrt.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.l);
    }
}
