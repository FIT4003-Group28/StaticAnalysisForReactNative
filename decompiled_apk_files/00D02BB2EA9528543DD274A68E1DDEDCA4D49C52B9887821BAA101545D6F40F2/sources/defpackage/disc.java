package defpackage;
/* compiled from: PG */
/* renamed from: disc  reason: default package */
/* loaded from: classes6.dex */
public final class disc extends dsqw<disc, dirt> implements dssk {
    public static final disc j;
    private static volatile dssr<disc> l;
    public int a;
    public long b;
    public long c;
    public long d;
    public dirv e;
    public dirz g;
    public int h;
    public disb i;
    private byte k = 2;
    public String f = "";

    static {
        disc discVar = new disc();
        j = discVar;
        dsqw.cc(disc.class, discVar);
    }

    private disc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(j, "\u0001\u0007\u0000\u0001\u0002\u000b\u0007\u0000\u0000\u0001\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0007ဈ\u0006\bစ\u0000\nင\b\u000bᐉ\t", new Object[]{"a", "c", "d", "e", "f", "b", "h", "i"});
            }
            if (i2 == 3) {
                return new disc();
            }
            if (i2 == 4) {
                return new dirt();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.k = b;
                return null;
            }
            dssr<disc> dssrVar = l;
            if (dssrVar == null) {
                synchronized (disc.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.k);
    }
}
