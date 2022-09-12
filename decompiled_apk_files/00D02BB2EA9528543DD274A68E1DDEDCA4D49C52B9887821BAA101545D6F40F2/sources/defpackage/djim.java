package defpackage;
/* compiled from: PG */
/* renamed from: djim  reason: default package */
/* loaded from: classes6.dex */
public final class djim extends dsqw<djim, djih> implements dssk {
    public static final djim C;
    private static volatile dssr<djim> E;
    public boolean A;
    public boolean B;
    private int D;
    public int a;
    public float b;
    public int c;
    public boolean d;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean k;
    public float l;
    public int m;
    public djil n;
    public djil o;
    public djig p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public djij x;
    public boolean y;
    public boolean z;
    public String e = "";
    public String j = "";

    static {
        djim djimVar = new djim();
        C = djimVar;
        dsqw.cc(djim.class, djimVar);
    }

    private djim() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(C, "\u0001\u001b\u0000\u0002\u0001 \u001b\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003ဇ\u0002\u0005ဈ\u0004\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဈ\n\rဇ\f\u000eခ\r\u000fင\u000f\u0010ဉ\u0010\u0011ဉ\u0012\u0012ဇ\u0013\u0013ဇ\u0014\u0014ဇ\u0015\u0015ဇ\u0017\u0017င\u0019\u0018င\u001a\u0019ဉ\u001b\u001aဉ\u0011\u001cဇ\u001d\u001dဇ\u001e\u001eဇ\u001f\u001fဇ  ဇ\u0016", new Object[]{"a", "D", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "p", "q", "r", "s", "u", "v", "w", "x", "o", "y", "z", "A", "B", "t"});
            }
            if (i2 == 3) {
                return new djim();
            }
            if (i2 == 4) {
                return new djih();
            }
            if (i2 == 5) {
                return C;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djim> dssrVar = E;
            if (dssrVar == null) {
                synchronized (djim.class) {
                    dssrVar = E;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(C);
                        E = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
