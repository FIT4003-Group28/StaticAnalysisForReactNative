package defpackage;
/* compiled from: PG */
/* renamed from: ckzm  reason: default package */
/* loaded from: classes5.dex */
public final class ckzm extends dsqw<ckzm, ckzl> implements dssk {
    public static final ckzm a;
    private static volatile dssr<ckzm> b;

    static {
        ckzm ckzmVar = new ckzm();
        a = ckzmVar;
        dsqw.cc(ckzm.class, ckzmVar);
    }

    private ckzm() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ckzm();
            }
            if (i2 == 4) {
                return new ckzl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ckzm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (ckzm.class) {
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
