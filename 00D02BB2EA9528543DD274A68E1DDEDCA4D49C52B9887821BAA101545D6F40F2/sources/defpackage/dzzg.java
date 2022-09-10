package defpackage;
/* compiled from: PG */
/* renamed from: dzzg  reason: default package */
/* loaded from: classes.dex */
public final class dzzg extends dsqw<dzzg, dzzf> implements dssk {
    private static volatile dssr<dzzg> A;
    public static final dzzg z;
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
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;

    static {
        dzzg dzzgVar = new dzzg();
        z = dzzgVar;
        dsqw.cc(dzzg.class, dzzgVar);
    }

    private dzzg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(z, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0007\bင\b\tင\t\nင\n\u000bင\u000b\fင\f\rင\r\u000eင\u000e\u000fင\u000f\u0010င\u0010\u0011င\u0011\u0012င\u0012\u0013င\u0006\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "h", "u", "v", "w", "x", "y"});
            }
            if (i2 == 3) {
                return new dzzg();
            }
            if (i2 == 4) {
                return new dzzf();
            }
            if (i2 == 5) {
                return z;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dzzg> dssrVar = A;
            if (dssrVar == null) {
                synchronized (dzzg.class) {
                    dssrVar = A;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(z);
                        A = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
