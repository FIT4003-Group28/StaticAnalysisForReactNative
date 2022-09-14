package defpackage;
/* compiled from: PG */
/* renamed from: dlkn  reason: default package */
/* loaded from: classes6.dex */
public final class dlkn extends dsqw<dlkn, dlkg> implements dssk {
    public static final dlkn l;
    private static volatile dssr<dlkn> m;
    public int a;
    public long b;
    public long c;
    public long d;
    public dsri e = dsrx.b;
    public String f = "";
    public String g = "";
    public dlki h;
    public int i;
    public int j;
    public int k;

    static {
        dlkn dlknVar = new dlkn();
        l = dlknVar;
        dsqw.cc(dlkn.class, dlknVar);
    }

    private dlkn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u0017\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\bဌ\u0006\tင\u0007\nဌ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", dlkl.a, "j", "k", dlkj.a});
            }
            if (i2 == 3) {
                return new dlkn();
            }
            if (i2 == 4) {
                return new dlkg();
            }
            if (i2 == 5) {
                return l;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dlkn> dssrVar = m;
            if (dssrVar == null) {
                synchronized (dlkn.class) {
                    dssrVar = m;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(l);
                        m = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
