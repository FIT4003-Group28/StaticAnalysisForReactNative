package defpackage;
/* compiled from: PG */
/* renamed from: dvwp  reason: default package */
/* loaded from: classes6.dex */
public final class dvwp extends dsqw<dvwp, dvwo> implements dssk {
    public static final dvwp h;
    private static volatile dssr<dvwp> j;
    public int a;
    public Object c;
    public boolean e;
    public int f;
    public int b = 0;
    private byte i = 2;
    public int d = -1;
    public String g = "";

    static {
        dvwp dvwpVar = new dvwp();
        h = dvwpVar;
        dsqw.cc(dvwp.class, dvwpVar);
    }

    private dvwp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(h, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0000\u0002\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004င\u0006\u0005ဇ\u0007\u0006ြ\u0000\u0007ᐼ\u0000\bᐼ\u0000\tဌ\b\nဈ\t", new Object[]{"c", "b", "a", dvwz.class, dqie.class, dqii.class, "d", "e", dhtg.class, dghq.class, dghq.class, "f", drci.c(), "g"});
            }
            if (i2 == 3) {
                return new dvwp();
            }
            if (i2 == 4) {
                return new dvwo();
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
            dssr<dvwp> dssrVar = j;
            if (dssrVar == null) {
                synchronized (dvwp.class) {
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
