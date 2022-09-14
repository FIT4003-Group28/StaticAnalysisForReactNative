package defpackage;
/* compiled from: PG */
/* renamed from: dnti  reason: default package */
/* loaded from: classes6.dex */
public final class dnti extends dsqw<dnti, dnth> implements dssk {
    public static final dnti k;
    private static volatile dssr<dnti> l;
    public int a;
    public long c;
    public long d;
    public boolean g;
    public dnpq j;
    public String b = "";
    public String e = "";
    public String f = "";
    public String h = "";
    public String i = "";

    static {
        dnti dntiVar = new dnti();
        k = dntiVar;
        dsqw.cc(dnti.class, dntiVar);
    }

    private dnti() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဉ\b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဈ\u0004\u0007ဇ\u0005\bဈ\u0006\tဈ\u0007", new Object[]{"a", "b", "e", "j", "c", "d", "f", "g", "h", "i"});
            }
            if (i2 == 3) {
                return new dnti();
            }
            if (i2 == 4) {
                return new dnth();
            }
            if (i2 == 5) {
                return k;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnti> dssrVar = l;
            if (dssrVar == null) {
                synchronized (dnti.class) {
                    dssrVar = l;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(k);
                        l = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
