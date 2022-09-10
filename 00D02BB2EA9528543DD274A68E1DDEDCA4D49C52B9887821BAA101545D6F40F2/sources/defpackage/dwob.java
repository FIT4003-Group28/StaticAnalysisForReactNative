package defpackage;
/* compiled from: PG */
/* renamed from: dwob  reason: default package */
/* loaded from: classes.dex */
public final class dwob extends dsqw<dwob, dwnw> implements dssk {
    public static final dwob B;
    private static volatile dssr<dwob> D;
    private int C;
    public boolean b;
    public boolean c;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public dwoa o;
    public boolean p;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean a = true;
    public boolean d = true;
    public int e = 60;
    public int f = 60;
    public boolean g = true;
    public boolean h = true;
    public int m = 60;
    public int n = 25;
    public boolean q = true;
    public int u = 50;
    public int z = 2;
    public int A = 1;

    static {
        dwob dwobVar = new dwob();
        B = dwobVar;
        dsqw.cc(dwob.class, dwobVar);
    }

    private dwob() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(B, "\u0001\u001b\u0000\u0001\u0001\u001f\u001b\u0000\u0000\u0000\u0001ဇ\u0003\u0002င\u0004\u0003င\u0005\u0004ဇ\u0006\u0005ဇ\u0007\u0007ဇ\t\bဇ\n\nဇ\f\fဇ\u0000\rဇ\u000e\u000eင\u000f\u000fင\u0010\u0010ဉ\u0011\u0011ဇ\u0001\u0012ဇ\u0012\u0013ဇ\u0013\u0014ဇ\u0014\u0015ဇ\u0015\u0016ဇ\u0016\u0018ဇ\u0002\u0019င\u0018\u001aဇ\u0019\u001bဇ\u001a\u001cဇ\u001b\u001dင\u001d\u001eဇ\u001c\u001fဌ\u001e", new Object[]{"C", "d", "e", "f", "g", "h", "i", "j", "k", "a", "l", "m", "n", "o", "b", "p", "q", "r", "s", "t", "c", "u", "v", "w", "x", "z", "y", "A", dwnx.a});
            }
            if (i2 == 3) {
                return new dwob();
            }
            if (i2 == 4) {
                return new dwnw();
            }
            if (i2 == 5) {
                return B;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwob> dssrVar = D;
            if (dssrVar == null) {
                synchronized (dwob.class) {
                    dssrVar = D;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(B);
                        D = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
