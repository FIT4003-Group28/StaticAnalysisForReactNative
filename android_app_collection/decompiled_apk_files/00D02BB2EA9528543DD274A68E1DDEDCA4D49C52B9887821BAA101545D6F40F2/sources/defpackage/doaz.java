package defpackage;
/* compiled from: PG */
/* renamed from: doaz  reason: default package */
/* loaded from: classes.dex */
public final class doaz extends dsqw<doaz, doaw> implements dssk {
    public static final doaz k;
    private static volatile dssr<doaz> l;
    public int a;
    public int b;
    public String c = "";
    public dnoh d;
    public dodc e;
    public dnzv f;
    public dntg g;
    public dopm h;
    public dnnc i;
    public dnjb j;

    static {
        doaz doazVar = new doaz();
        k = doazVar;
        dsqw.cc(doaz.class, doazVar);
    }

    private doaz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0005\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\u0002\bဉ\t\nဉ\n", new Object[]{"a", "b", doay.c(), "c", "e", "f", "g", "h", "d", "i", "j"});
            }
            if (i2 == 3) {
                return new doaz();
            }
            if (i2 == 4) {
                return new doaw();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doaz> dssrVar = l;
            if (dssrVar == null) {
                synchronized (doaz.class) {
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
