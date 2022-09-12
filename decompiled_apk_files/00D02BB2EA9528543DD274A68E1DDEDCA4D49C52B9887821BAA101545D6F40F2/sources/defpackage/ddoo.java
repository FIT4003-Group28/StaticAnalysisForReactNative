package defpackage;
/* compiled from: PG */
/* renamed from: ddoo  reason: default package */
/* loaded from: classes.dex */
public final class ddoo extends dsqw<ddoo, ddon> implements dssk {
    public static final ddoo k;
    private static volatile dssr<ddoo> l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    static {
        ddoo ddooVar = new ddoo();
        k = ddooVar;
        dsqw.cc(ddoo.class, ddooVar);
    }

    private ddoo() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0007င\u0007\bင\b\tင\t\nင\n\u000bင\u000b\fင\f\rင\r", new Object[]{"a", "b", dvep.a, "c", dumb.a, "d", "e", "f", "g", "h", "i", "j"});
            }
            if (i2 == 3) {
                return new ddoo();
            }
            if (i2 == 4) {
                return new ddon();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddoo> dssrVar = l;
            if (dssrVar == null) {
                synchronized (ddoo.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
