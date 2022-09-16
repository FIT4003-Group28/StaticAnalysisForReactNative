package defpackage;
/* compiled from: PG */
/* renamed from: dpzm  reason: default package */
/* loaded from: classes6.dex */
public final class dpzm extends dsqw<dpzm, dpzj> implements dssk {
    public static final dpzm j;
    private static volatile dssr<dpzm> k;
    public int a;
    public dpum b;
    public long c;
    public long d;
    public long e;
    public long f;
    public String g = "";
    public String h = "";
    public int i;

    static {
        dpzm dpzmVar = new dpzm();
        j = dpzmVar;
        dsqw.cc(dpzm.class, dpzmVar);
    }

    private dpzm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဈ\u0005\u0004ဂ\u0003\u0005ဈ\u0006\u0006ဂ\u0004\u0007ဌ\u0007\bဂ\u0002", new Object[]{"a", "b", "c", "g", "e", "h", "f", "i", dpzk.a, "d"});
            }
            if (i2 == 3) {
                return new dpzm();
            }
            if (i2 == 4) {
                return new dpzj();
            }
            if (i2 == 5) {
                return j;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpzm> dssrVar = k;
            if (dssrVar == null) {
                synchronized (dpzm.class) {
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
