package defpackage;
/* compiled from: PG */
/* renamed from: duwy  reason: default package */
/* loaded from: classes.dex */
public final class duwy extends dsqw<duwy, duwp> implements dssk {
    public static final duwy r;
    private static volatile dssr<duwy> s;
    public int a;
    public duwr b;
    public boolean c;
    public boolean d;
    public boolean e;
    public duwx f;
    public duwv g;
    public duwo h;
    public int i = 12;
    public int j = 15;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;

    static {
        duwy duwyVar = new duwy();
        r = duwyVar;
        dsqw.cc(duwy.class, duwyVar);
    }

    private duwy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(r, "\u0001\u0010\u0000\u0001\u0003\u0019\u0010\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဇ\u0001\u0006ဉ\b\u0007ဇ\u0005\bဉ\t\tင\n\nင\f\u000bဇ\r\rဇ\u000e\u000eဉ\u0007\u0011ဇ\u000f\u0012ဇ\u0010\u0014င\u000b\u0015ဇ\u0002\u0018ဇ\u0014\u0019ဇ\u0015", new Object[]{"a", "b", "c", "g", "e", "h", "i", "k", "l", "m", "f", "n", "o", "j", "d", "p", "q"});
            }
            if (i2 == 3) {
                return new duwy();
            }
            if (i2 == 4) {
                return new duwp();
            }
            if (i2 == 5) {
                return r;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<duwy> dssrVar = s;
            if (dssrVar == null) {
                synchronized (duwy.class) {
                    dssrVar = s;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(r);
                        s = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
