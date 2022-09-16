package defpackage;
/* compiled from: PG */
/* renamed from: dpfa  reason: default package */
/* loaded from: classes6.dex */
public final class dpfa extends dsqw<dpfa, dpez> implements dssk {
    public static final dpfa e;
    private static volatile dssr<dpfa> f;
    public int a;
    public dpfg b;
    public dpfg c;
    public boolean d;

    static {
        dpfa dpfaVar = new dpfa();
        e = dpfaVar;
        dsqw.cc(dpfa.class, dpfaVar);
    }

    private dpfa() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            }
            if (i2 == 3) {
                return new dpfa();
            }
            if (i2 == 4) {
                return new dpez();
            }
            if (i2 == 5) {
                return e;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpfa> dssrVar = f;
            if (dssrVar == null) {
                synchronized (dpfa.class) {
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
