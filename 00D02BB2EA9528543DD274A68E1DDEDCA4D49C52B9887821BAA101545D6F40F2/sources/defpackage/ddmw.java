package defpackage;
/* compiled from: PG */
/* renamed from: ddmw  reason: default package */
/* loaded from: classes.dex */
public final class ddmw extends dsqw<ddmw, ddmv> implements dssk {
    public static final ddmw l;
    private static volatile dssr<ddmw> m;
    public int a;
    public int b;
    public int c;
    public int d;
    public ddmg e;
    public ddmg f;
    public ddmi g;
    public float h;
    public int i;
    public int j;
    public dsrj<String> k = dssu.b;

    static {
        ddmw ddmwVar = new ddmw();
        l = ddmwVar;
        dsqw.cc(ddmw.class, ddmwVar);
    }

    private ddmw() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ခ\u0006\bဌ\u0007\tင\u000b\r\u001a", new Object[]{"a", "b", duxa.a, "c", duxa.a, "d", duxa.a, "e", "f", "g", "h", "i", ddmt.a, "j", "k"});
            }
            if (i2 == 3) {
                return new ddmw();
            }
            if (i2 == 4) {
                return new ddmv();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddmw> dssrVar = m;
            if (dssrVar == null) {
                synchronized (ddmw.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
