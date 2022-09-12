package defpackage;
/* compiled from: PG */
/* renamed from: dvue  reason: default package */
/* loaded from: classes.dex */
public final class dvue extends dsqw<dvue, dvtx> implements dssk {
    public static final dvue A;
    private static volatile dssr<dvue> D;
    private int B;
    private int C;
    public boolean a;
    public boolean b;
    public int d;
    public boolean e;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public long y;
    public long c = 900000;
    public int f = 75000;
    public int g = 150000;
    public long z = 300;

    static {
        dvue dvueVar = new dvue();
        A = dvueVar;
        dsqw.cc(dvue.class, dvueVar);
    }

    private dvue() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(A, "\u0001\u001a\u0000\u0002\u0007G\u001a\u0000\u0000\u0000\u0007ဇ\u0001\u0019ဇ\u0015\u001dဂ\u0016\u001eဌ\u0017\u001fဇ\u0018 င\u0019%င\u001b'ဇ\u001c)ဇ\u001e*ဇ\u001f+ဇ .ဇ$1ဌ(2ဇ)3ဇ*6ဇ,7ဇ.;ဇ1<ဇ2>ဇ4@ဇ5Aဇ6Bဌ7Cဂ8Eဂ9Gဇ!", new Object[]{"B", "C", "a", "b", "c", "d", dvty.a, "e", "f", "g", "h", "i", "j", "k", "m", "n", dvua.a, "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", dvuc.a, "y", "z", "l"});
            }
            if (i2 == 3) {
                return new dvue();
            }
            if (i2 == 4) {
                return new dvtx();
            }
            if (i2 == 5) {
                return A;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvue> dssrVar = D;
            if (dssrVar == null) {
                synchronized (dvue.class) {
                    dssrVar = D;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(A);
                        D = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
