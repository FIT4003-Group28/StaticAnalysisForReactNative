package defpackage;
/* compiled from: PG */
/* renamed from: dqkn  reason: default package */
/* loaded from: classes6.dex */
public final class dqkn extends dsqw<dqkn, dqkm> implements dssk {
    public static final dqkn e;
    private static volatile dssr<dqkn> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dqkn dqknVar = new dqkn();
        e = dqknVar;
        dsqw.cc(dqkn.class, dqknVar);
    }

    private dqkn() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqkn();
            }
            if (i2 == 4) {
                return new dqkm();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqkn> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqkn.class) {
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
