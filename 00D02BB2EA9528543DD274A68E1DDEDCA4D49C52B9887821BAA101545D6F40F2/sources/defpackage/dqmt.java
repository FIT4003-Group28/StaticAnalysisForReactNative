package defpackage;
/* compiled from: PG */
/* renamed from: dqmt  reason: default package */
/* loaded from: classes6.dex */
public final class dqmt extends dsqw<dqmt, dqms> implements dssk {
    public static final dqmt d;
    private static volatile dssr<dqmt> e;
    public int a;
    public long b;
    public int c;

    static {
        dqmt dqmtVar = new dqmt();
        d = dqmtVar;
        dsqw.cc(dqmt.class, dqmtVar);
    }

    private dqmt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            }
            if (i2 == 3) {
                return new dqmt();
            }
            if (i2 == 4) {
                return new dqms();
            }
            if (i2 == 5) {
                return d;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqmt> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dqmt.class) {
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
