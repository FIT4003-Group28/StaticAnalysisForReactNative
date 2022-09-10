package defpackage;
/* compiled from: PG */
/* renamed from: dwsm  reason: default package */
/* loaded from: classes6.dex */
public final class dwsm extends dsqw<dwsm, dwsl> implements dssk {
    public static final dwsm a;
    private static volatile dssr<dwsm> b;

    static {
        dwsm dwsmVar = new dwsm();
        a = dwsmVar;
        dsqw.cc(dwsm.class, dwsmVar);
    }

    private dwsm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwsm();
            }
            if (i2 == 4) {
                return new dwsl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwsm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwsm.class) {
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
