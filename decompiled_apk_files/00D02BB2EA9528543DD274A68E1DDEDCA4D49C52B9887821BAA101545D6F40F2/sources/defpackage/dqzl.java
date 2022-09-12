package defpackage;
/* compiled from: PG */
/* renamed from: dqzl  reason: default package */
/* loaded from: classes6.dex */
public final class dqzl extends dsqw<dqzl, dqyo> implements dssk {
    public static final dqzl j;
    private static volatile dssr<dqzl> k;
    public int a;
    public long b;
    public boolean c;
    public boolean d = true;
    public boolean e;
    public int f;
    public boolean g;
    public boolean h;
    public dqyw i;

    static {
        dqzl dqzlVar = new dqzl();
        j = dqzlVar;
        dsqw.cc(dqzl.class, dqzlVar);
    }

    private dqzl() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\t\u0011\b\u0000\u0000\u0000\tဇ\u0001\nင\u0004\u000bဇ\u0005\fဇ\u0006\u000eဂ\u0000\u000fဉ\u0007\u0010ဇ\u0002\u0011ဇ\u0003", new Object[]{"a", "c", "f", "g", "h", "b", "i", "d", "e"});
            }
            if (i2 == 3) {
                return new dqzl();
            }
            if (i2 == 4) {
                return new dqyo();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqzl> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dqzl.class) {
                    dssrVar = k;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(j);
                        k = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
