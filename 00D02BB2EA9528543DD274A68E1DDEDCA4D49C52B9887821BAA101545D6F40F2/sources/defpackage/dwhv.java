package defpackage;
/* compiled from: PG */
/* renamed from: dwhv  reason: default package */
/* loaded from: classes6.dex */
public final class dwhv extends dsqw<dwhv, dwhq> implements dssk {
    public static final dwhv H;
    private static volatile dssr<dwhv> K;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    private boolean I;
    private boolean J;
    public int a;
    public int b;
    public boolean c;
    public doed d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public dwhs y;
    public dwhu z;

    static {
        dwhv dwhvVar = new dwhv();
        H = dwhvVar;
        dsqw.cc(dwhv.class, dwhvVar);
    }

    private dwhv() {
    }

    public static /* synthetic */ void c(dwhv dwhvVar) {
        dwhvVar.a |= 1;
        dwhvVar.I = true;
    }

    public static /* synthetic */ void e(dwhv dwhvVar) {
        dwhvVar.a |= 2048;
        dwhvVar.J = true;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(H, "\u0001!\u0000\u0002\u0001'!\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u000b\tဇ\u0006\nဇ\u0007\u000bဇ\n\fဇ\f\rဇ\r\u000eဇ\u000e\u000fဇ\u000f\u0011ဇ\u0010\u0012ဇ\u0011\u0014ဇ\u0015\u0015ဇ\b\u0016ဇ\u0016\u0017ဉ\u0019\u0018ဇ\u0017\u0019ဇ\u0013\u001aဉ\u001a\u001bဇ\u001b\u001cဇ\u001d\u001eဇ\u0018\u001fဇ\u001e!ဇ \"ဇ\u0014#ဇ!%ဇ\"&ဇ#'ဇ\t", new Object[]{"a", "b", "I", "c", "d", "e", "f", "g", "J", "h", "i", "l", "m", "n", "o", "p", "q", "r", "u", "j", "v", "y", "w", "s", "z", "A", "B", "x", "C", "D", "t", "E", "F", "G", "k"});
            }
            if (i2 == 3) {
                return new dwhv();
            }
            if (i2 == 4) {
                return new dwhq();
            }
            if (i2 == 5) {
                return H;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwhv> dssrVar = K;
            if (dssrVar == null) {
                synchronized (dwhv.class) {
                    dssrVar = K;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(H);
                        K = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
