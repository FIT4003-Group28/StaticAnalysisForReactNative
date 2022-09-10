package defpackage;
/* compiled from: PG */
/* renamed from: dvvi  reason: default package */
/* loaded from: classes6.dex */
public final class dvvi extends dsqw<dvvi, dvvh> implements dssk {
    public static final dvvi k;
    private static volatile dssr<dvvi> n;
    public int a;
    public int b;
    public dvvc c;
    public dvve d;
    public int h;
    public int j;
    private dnqh l;
    private byte m = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        dvvi dvviVar = new dvvi();
        k = dvviVar;
        dsqw.cc(dvvi.class, dvviVar);
    }

    private dvvi() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(k, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0005\u0006ဋ\u0006\bᐉ\n\tဈ\u0007\nဈ\u0004\u000bင\t", new Object[]{"a", "b", dvvf.a, "c", "d", "e", "g", "h", "l", "i", "f", "j"});
            }
            if (i2 == 3) {
                return new dvvi();
            }
            if (i2 == 4) {
                return new dvvh();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<dvvi> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dvvi.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
