package defpackage;
/* compiled from: PG */
/* renamed from: dkof  reason: default package */
/* loaded from: classes.dex */
public final class dkof extends dsqw<dkof, dkoe> implements dssk {
    public static final dkof s;
    private static volatile dssr<dkof> t;
    public int a;
    public boolean d;
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
    public String b = "";
    public String c = "";
    public boolean r = true;

    static {
        dkof dkofVar = new dkof();
        s = dkofVar;
        dsqw.cc(dkof.class, dkofVar);
    }

    private dkof() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(s, "\u0001\u0011\u0000\u0001\u0001\u001a\u0011\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0006ဇ\u0004\u0007ဇ\u0005\nဇ\t\fဇ\n\rဇ\u000b\u000eဇ\r\u000fဇ\u000e\u0010ဇ\u0010\u0014ဇ\u0011\u0015ဇ\u0014\u0017ဇ\u0015\u0018ဇ\f\u0019ဇ\u000f\u001aဇ\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "k", "l", "n", "o", "p", "q", "j", "m", "r"});
            }
            if (i2 == 3) {
                return new dkof();
            }
            if (i2 == 4) {
                return new dkoe();
            }
            if (i2 == 5) {
                return s;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkof> dssrVar = t;
            if (dssrVar == null) {
                synchronized (dkof.class) {
                    dssrVar = t;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(s);
                        t = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
