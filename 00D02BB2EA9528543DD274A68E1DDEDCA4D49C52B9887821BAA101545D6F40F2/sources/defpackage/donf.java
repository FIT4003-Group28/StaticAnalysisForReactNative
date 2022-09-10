package defpackage;
/* compiled from: PG */
/* renamed from: donf  reason: default package */
/* loaded from: classes6.dex */
public final class donf extends dsqw<donf, doms> implements dssk {
    public static final donf j;
    private static volatile dssr<donf> k;
    public int a;
    public done b;
    public done c;
    public boolean d;
    public int f;
    public int h;
    public int i;
    public boolean e = true;
    public boolean g = true;

    static {
        donf donfVar = new donf();
        j = donfVar;
        dsqw.cc(donf.class, donfVar);
    }

    private donf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0002\u0003ဉ\u0001\u0004ဌ\u0004\u0005ဇ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\bဇ\u0003", new Object[]{"a", "b", "d", "c", "f", domw.c(), "g", "h", domt.a, "i", domt.a, "e"});
            }
            if (i2 == 3) {
                return new donf();
            }
            if (i2 == 4) {
                return new doms();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<donf> dssrVar = k;
            if (dssrVar == null) {
                synchronized (donf.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
