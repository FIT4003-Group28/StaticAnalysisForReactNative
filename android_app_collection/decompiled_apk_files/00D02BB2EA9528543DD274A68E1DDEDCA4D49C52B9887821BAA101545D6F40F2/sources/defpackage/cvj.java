package defpackage;
/* compiled from: PG */
/* renamed from: cvj  reason: default package */
/* loaded from: classes5.dex */
public final class cvj extends dsqw<cvj, cuw> implements dssk {
    public static final cvj q;
    private static volatile dssr<cvj> r;
    public int a;
    public Object c;
    public boolean e;
    public boolean f;
    public boolean h;
    public cvi i;
    public cvi j;
    public cuy k;
    public cvg l;
    public cvc m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int b = 0;
    public dsrj<djie> d = dssu.b;
    public int g = 16;

    static {
        cvj cvjVar = new cvj();
        q = cvjVar;
        dsqw.cc(cvj.class, cvjVar);
    }

    private cvj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u000f\u0001\u0001\u0001\u001c\u000f\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000\u0003ဇ\u0001\u0004င\u0002\u0005ဇ\u0003\u0006ဉ\u0004\u0007ြ\u0000\bြ\u0000\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u0005\rဇ\f\u000eဇ\r\u001cဇ\u000b", new Object[]{"c", "b", "a", "d", djie.class, "e", "f", "g", "h", "i", cva.class, cuv.class, "k", "l", "m", "j", "o", "p", "n"});
            }
            if (i2 == 3) {
                return new cvj();
            }
            if (i2 == 4) {
                return new cuw();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cvj> dssrVar = r;
            if (dssrVar == null) {
                synchronized (cvj.class) {
                    dssrVar = r;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        r = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
