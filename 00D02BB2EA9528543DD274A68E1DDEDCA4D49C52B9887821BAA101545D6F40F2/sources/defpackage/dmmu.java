package defpackage;
/* compiled from: PG */
/* renamed from: dmmu  reason: default package */
/* loaded from: classes.dex */
public final class dmmu extends dsqs<dmmu, dmmt> implements dsqt {
    public static final dmmu l;
    private static volatile dssr<dmmu> n;
    public int a;
    public dmrb b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int j;
    public int k;
    private byte m = 2;
    public int h = -1;
    public long i = -1;

    static {
        dmmu dmmuVar = new dmmu();
        l = dmmuVar;
        dsqw.cc(dmmu.class, dmmuVar);
    }

    private dmmu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0002\u0003င\u0007\u0004င\t\u0005ဆ\n\u0007ဇ\u0001\bဂ\b\u000bင\u0005\fင\u0006\rဌ\u0003", new Object[]{"a", "b", "d", "h", "j", "k", "c", "i", "f", "g", "e", dmom.a});
            }
            if (i2 == 3) {
                return new dmmu();
            }
            if (i2 == 4) {
                return new dmmt();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.m = b;
                return null;
            }
            dssr<dmmu> dssrVar = n;
            if (dssrVar == null) {
                synchronized (dmmu.class) {
                    dssrVar = n;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        n = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.m);
    }
}
