package defpackage;
/* compiled from: PG */
/* renamed from: dqrv  reason: default package */
/* loaded from: classes6.dex */
public final class dqrv extends dsqw<dqrv, dqru> implements dssk {
    public static final dqrv a;
    private static volatile dssr<dqrv> b;

    static {
        dqrv dqrvVar = new dqrv();
        a = dqrvVar;
        dsqw.cc(dqrv.class, dqrvVar);
    }

    private dqrv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dqrv();
            }
            if (i2 == 4) {
                return new dqru();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dqrv> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dqrv.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
