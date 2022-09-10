package defpackage;
/* compiled from: PG */
/* renamed from: dmay  reason: default package */
/* loaded from: classes6.dex */
public final class dmay extends dsqw<dmay, dmax> implements dssk {
    public static final dmay d;
    private static volatile dssr<dmay> e;
    public int a;
    public String b = "";
    public dwfl c;

    static {
        dmay dmayVar = new dmay();
        d = dmayVar;
        dsqw.cc(dmay.class, dmayVar);
    }

    private dmay() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0002\u0003ဈ\u0000", new Object[]{"a", "c", "b"});
            }
            if (i2 == 3) {
                return new dmay();
            }
            if (i2 == 4) {
                return new dmax();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmay> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dmay.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
