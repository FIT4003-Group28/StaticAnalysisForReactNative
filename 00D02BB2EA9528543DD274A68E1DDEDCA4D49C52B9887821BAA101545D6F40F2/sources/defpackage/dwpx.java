package defpackage;
/* compiled from: PG */
/* renamed from: dwpx  reason: default package */
/* loaded from: classes6.dex */
public final class dwpx extends dsqw<dwpx, dwpw> implements dssk {
    public static final dwpx a;
    private static volatile dssr<dwpx> b;

    static {
        dwpx dwpxVar = new dwpx();
        a = dwpxVar;
        dsqw.cc(dwpx.class, dwpxVar);
    }

    private dwpx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwpx();
            }
            if (i2 == 4) {
                return new dwpw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwpx.class) {
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
