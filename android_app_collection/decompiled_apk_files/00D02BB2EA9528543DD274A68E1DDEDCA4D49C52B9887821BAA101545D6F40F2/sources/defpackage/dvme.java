package defpackage;
/* compiled from: PG */
/* renamed from: dvme  reason: default package */
/* loaded from: classes.dex */
public final class dvme extends dsqw<dvme, dvmd> implements dssk {
    public static final dvme q;
    private static volatile dssr<dvme> t;
    public boolean a;
    public boolean b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean l;
    public boolean o;
    public boolean p;
    private int r;
    private int s;
    public String c = "";
    public int k = 180;
    public long m = 5000;
    public boolean n = true;

    static {
        dvme dvmeVar = new dvme();
        q = dvmeVar;
        dsqw.cc(dvme.class, dvmeVar);
    }

    private dvme() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(q, "\u0001\u0010\u0000\u0002\u0004'\u0010\u0000\u0000\u0000\u0004ဇ\u0001\u000eဇ\n\u000fဈ\u000b\u0015ဇ\f\u0016ဇ\u0012\u001bဇ\u0010\u001cဇ\u0016\u001eဇ\u0018\u001fဇ\u0019 ဇ\u001a!ဇ\u001c\"ဂ\u001d#င\u001b%ဇ\u001f&ဇ 'ဇ!", new Object[]{"r", "s", "a", "b", "c", "d", "f", "e", "g", "h", "i", "j", "l", "m", "k", "n", "o", "p"});
            }
            if (i2 == 3) {
                return new dvme();
            }
            if (i2 == 4) {
                return new dvmd();
            }
            if (i2 == 5) {
                return q;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dvme> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dvme.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(q);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
