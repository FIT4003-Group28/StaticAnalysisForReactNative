package defpackage;
/* compiled from: PG */
/* renamed from: cyit  reason: default package */
/* loaded from: classes5.dex */
public final class cyit extends dsqw<cyit, cyiq> implements dssk {
    public static final cyit d;
    private static volatile dssr<cyit> e;
    public dsrj<cymg> a = dssu.b;
    public cyis b;
    public cylg c;

    static {
        cyit cyitVar = new cyit();
        d = cyitVar;
        dsqw.cc(cyit.class, cyitVar);
    }

    private cyit() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t", new Object[]{"a", cymg.class, "b", "c"});
            }
            if (i2 == 3) {
                return new cyit();
            }
            if (i2 == 4) {
                return new cyiq();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cyit> dssrVar = e;
            if (dssrVar == null) {
                synchronized (cyit.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(d);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
