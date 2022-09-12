package defpackage;
/* compiled from: PG */
/* renamed from: dwwr  reason: default package */
/* loaded from: classes.dex */
public final class dwwr extends dsqw<dwwr, dwwh> implements dssk {
    public static final dwwr D;
    private static volatile dssr<dwwr> I;
    public static final dsrg<Integer, dwwj> q;
    public boolean A;
    public boolean B;
    public boolean C;
    private int E;
    private int F;
    private int G;
    public int c;
    public int f;
    public boolean g;
    public float k;
    public int l;
    public dwwg m;
    public boolean n;
    public boolean o;
    public dsrf p;
    public boolean r;
    public boolean t;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    private dssd<Integer, Integer> H = dssd.b;
    public dssd<String, Boolean> s = dssd.b;
    public dssd<String, Boolean> u = dssd.b;
    public int a = 10080;
    public int b = 43200;
    public boolean d = true;
    public int e = 10080;
    public String h = "https://www.google.com/maps/vt/";
    public boolean i = true;
    public float j = 15.0f;

    static {
        int i = dwwo.a;
        q = new dwwe();
        dwwr dwwrVar = new dwwr();
        D = dwwrVar;
        dsqw.cc(dwwr.class, dwwrVar);
    }

    private dwwr() {
        dsqz dsqzVar = dsqz.b;
        this.k = 1.0f;
        this.l = 30;
        this.p = dsqz.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(D, "\u0001\u001d\u0000\u0003\u0004j\u001d\u0003\u0001\u0000\u0004င\u0003\u0007င\u0007\bဇ\b\fင\f\rဌ\r\u000fဇ\u000f\u0010ဈ\u0010\u0012ဇ\u0012\u0019ခ\u0016*ခ#4࠲8င+9ဉ,:ဇ-;ဇ.G\u001eOဇARင\u0004VဇDXဇFZဇG[ဇ=\\2]ဇ>^2bဇKcဇLfဇOjဇS", new Object[]{"E", "F", "G", "a", "c", "d", "e", "f", dwwl.a, "g", "h", "i", "j", "k", "H", dwwp.a, dwwo.a(), "l", "m", "n", "o", "p", dwwj.c(), "v", "b", "w", "x", "y", "r", "s", dwwq.a, "t", "u", dwwk.a, "z", "A", "B", "C"});
            }
            if (i2 == 3) {
                return new dwwr();
            }
            if (i2 == 4) {
                return new dwwh();
            }
            if (i2 == 5) {
                return D;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwwr> dssrVar = I;
            if (dssrVar == null) {
                synchronized (dwwr.class) {
                    dssrVar = I;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(D);
                        I = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
