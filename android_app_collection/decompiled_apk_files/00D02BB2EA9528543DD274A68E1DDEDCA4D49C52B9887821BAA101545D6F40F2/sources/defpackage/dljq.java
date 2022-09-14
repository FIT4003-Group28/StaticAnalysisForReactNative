package defpackage;
/* compiled from: PG */
/* renamed from: dljq  reason: default package */
/* loaded from: classes6.dex */
public final class dljq extends dsqw<dljq, dljp> implements dssk {
    public static final dljq e;
    private static volatile dssr<dljq> f;
    public int a;
    public String b = "";
    public int c;
    public boolean d;

    static {
        dljq dljqVar = new dljq();
        e = dljqVar;
        dsqw.cc(dljq.class, dljqVar);
    }

    private dljq() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dljq();
            }
            if (i2 == 4) {
                return new dljp();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dljq> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dljq.class) {
                    dssrVar = f;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(e);
                        f = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
