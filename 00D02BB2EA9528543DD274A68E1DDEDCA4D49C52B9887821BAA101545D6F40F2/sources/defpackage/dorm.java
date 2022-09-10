package defpackage;
/* compiled from: PG */
/* renamed from: dorm  reason: default package */
/* loaded from: classes6.dex */
public final class dorm extends dsqw<dorm, dorl> implements dssk {
    public static final dorm n;
    private static volatile dssr<dorm> o;
    public int a;
    public boolean b;
    public boolean c;
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

    static {
        dorm dormVar = new dorm();
        n = dormVar;
        dsqw.cc(dorm.class, dormVar);
    }

    private dorm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(n, "\u0001\f\u0000\u0001\u0001\u0015\f\u0000\u0000\u0000\u0001ဇ\u0000\u0005ဇ\u0005\u0006ဇ\t\u0007ဇ\u000b\u000bဇ\u0011\fဇ\u0013\u000fဇ\u0001\u0010ဇ\u0006\u0011ဇ\n\u0012ဇ\f\u0014ဇ\u0012\u0015ဇ\u0014", new Object[]{"a", "b", "d", "f", "h", "j", "l", "c", "e", "g", "i", "k", "m"});
            }
            if (i2 == 3) {
                return new dorm();
            }
            if (i2 == 4) {
                return new dorl();
            }
            if (i2 == 5) {
                return n;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dorm> dssrVar = o;
            if (dssrVar == null) {
                synchronized (dorm.class) {
                    dssrVar = o;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(n);
                        o = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
