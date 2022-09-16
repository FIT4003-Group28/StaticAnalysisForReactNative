package defpackage;
/* compiled from: PG */
/* renamed from: dte  reason: default package */
/* loaded from: classes6.dex */
public final class dte extends dsqw<dte, dtd> implements dssk {
    public static final dte w;
    private static volatile dssr<dte> x;
    public int a;
    public long b;
    public boolean c;
    public boolean d;
    public dfkv e;
    public boolean g;
    public boolean j;
    public boolean k;
    public boolean l;
    public dknu m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean t;
    public boolean u;
    public boolean v;
    public String f = "";
    public boolean h = true;
    public boolean i = true;
    public String s = "";

    static {
        dte dteVar = new dte();
        w = dteVar;
        dsqw.cc(dte.class, dteVar);
    }

    private dte() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(w, "\u0001\u0015\u0000\u0001\u0001\"\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0004ဇ\u0001\tဉ\u0003\nဈ\u0004\u000bဇ\u0005\fဇ\u0006\rဇ\u0002\u0013ဇ\u0007\u0015ဇ\b\u0016ဇ\t\u0017ဇ\n\u0018ဉ\u000b\u0019ဇ\f\u001aဇ\r\u001bဇ\u000e\u001cဇ\u000f\u001dဇ\u0010\u001eဈ\u0011 ဇ\u0013!ဇ\u0014\"ဇ\u0015", new Object[]{"a", "b", "c", "e", "f", "g", "h", "d", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v"});
            }
            if (i2 == 3) {
                return new dte();
            }
            if (i2 == 4) {
                return new dtd();
            }
            if (i2 == 5) {
                return w;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dte> dssrVar = x;
            if (dssrVar == null) {
                synchronized (dte.class) {
                    dssrVar = x;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(w);
                        x = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
