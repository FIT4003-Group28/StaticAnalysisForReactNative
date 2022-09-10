package defpackage;
/* compiled from: PG */
/* renamed from: dwpe  reason: default package */
/* loaded from: classes6.dex */
public final class dwpe extends dsqw<dwpe, dwpd> implements dssk {
    public static final dwpe a;
    private static volatile dssr<dwpe> b;

    static {
        dwpe dwpeVar = new dwpe();
        a = dwpeVar;
        dsqw.cc(dwpe.class, dwpeVar);
    }

    private dwpe() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwpe();
            }
            if (i2 == 4) {
                return new dwpd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwpe> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwpe.class) {
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
