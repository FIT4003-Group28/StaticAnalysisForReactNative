package defpackage;
/* compiled from: PG */
/* renamed from: ddsj  reason: default package */
/* loaded from: classes6.dex */
public final class ddsj extends dsqw<ddsj, ddsi> implements dssk {
    public static final ddsj k;
    private static volatile dssr<ddsj> m;
    public int a;
    public int b;
    public int c;
    public deab d;
    public ddsw f;
    public ddhk g;
    public long h;
    public boolean i;
    public ddev j;
    private byte l = 2;
    public String e = "";

    static {
        ddsj ddsjVar = new ddsj();
        k = ddsjVar;
        dsqw.cc(ddsj.class, ddsjVar);
    }

    private ddsj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0002\u0012\t\u0000\u0000\u0003\u0002ᐉ\u0006\u0003ဈ\u0004\u0004ᐉ\u0005\u0006ဌ\u0001\u0007ဌ\u0002\bဉ\u0003\u0010ᐉ\t\u0011ဂ\u0007\u0012ဇ\b", new Object[]{"a", "g", "e", "f", "b", deaf.c(), "c", dead.c(), "d", "j", "h", "i"});
            }
            if (i2 == 3) {
                return new ddsj();
            }
            if (i2 == 4) {
                return new ddsi();
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
            dssr<ddsj> dssrVar = m;
            if (dssrVar == null) {
                synchronized (ddsj.class) {
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
