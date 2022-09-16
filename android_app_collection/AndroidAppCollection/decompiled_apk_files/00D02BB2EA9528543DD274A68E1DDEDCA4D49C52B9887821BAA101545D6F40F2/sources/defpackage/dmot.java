package defpackage;
/* compiled from: PG */
/* renamed from: dmot  reason: default package */
/* loaded from: classes.dex */
public final class dmot extends dsqw<dmot, dmos> implements dssk {
    public static final dmot f;
    private static volatile dssr<dmot> h;
    public int a;
    public int b;
    public dmov c;
    public dmmo d;
    public dmor e;
    private byte g = 2;

    static {
        dmot dmotVar = new dmot();
        f = dmotVar;
        dsqw.cc(dmot.class, dmotVar);
    }

    private dmot() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            }
            if (i2 == 3) {
                return new dmot();
            }
            if (i2 == 4) {
                return new dmos();
            }
            if (i2 == 5) {
                return f;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<dmot> dssrVar = h;
            if (dssrVar == null) {
                synchronized (dmot.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(f);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
