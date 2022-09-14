package defpackage;
/* compiled from: PG */
/* renamed from: dqya  reason: default package */
/* loaded from: classes6.dex */
public final class dqya extends dsqw<dqya, dqxz> implements dssk {
    public static final dqya e;
    private static volatile dssr<dqya> f;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";

    static {
        dqya dqyaVar = new dqya();
        e = dqyaVar;
        dsqw.cc(dqya.class, dqyaVar);
    }

    private dqya() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dqya();
            }
            if (i2 == 4) {
                return new dqxz();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqya> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dqya.class) {
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
