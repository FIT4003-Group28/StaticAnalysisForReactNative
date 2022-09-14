package defpackage;
/* compiled from: PG */
/* renamed from: dkpa  reason: default package */
/* loaded from: classes.dex */
public final class dkpa extends dsqw<dkpa, dkox> implements dssk {
    public static final dkpa w;
    private static volatile dssr<dkpa> x;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean o;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int n = 24;
    public int p = 56;
    public float q = 1.0f;

    static {
        dkpa dkpaVar = new dkpa();
        w = dkpaVar;
        dsqw.cc(dkpa.class, dkpaVar);
    }

    private dkpa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(w, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0002\u0003ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\tဇ\u000b\nဇ\f\u000bဇ\r\rင\u000f\u000eဇ\u0007\u000fဇ\b\u0010ဇ\u0010\u0012ဇ\u0015\u0013ဇ\u0016\u0014င\u0011\u0015ခ\u0012\u0016ဌ\t\u0017ဇ\u0017\u0018ဇ\u0018\u0019ဇ\u0019", new Object[]{"a", "b", "c", "d", "e", "f", "g", "k", "l", "m", "n", "h", "i", "o", "r", "s", "p", "q", "j", dkoy.a, "t", "u", "v"});
            }
            if (i2 == 3) {
                return new dkpa();
            }
            if (i2 == 4) {
                return new dkox();
            }
            if (i2 == 5) {
                return w;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkpa> dssrVar = x;
            if (dssrVar == null) {
                synchronized (dkpa.class) {
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
