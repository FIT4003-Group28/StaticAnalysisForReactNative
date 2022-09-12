package defpackage;
/* compiled from: PG */
/* renamed from: dwur  reason: default package */
/* loaded from: classes.dex */
public final class dwur extends dsqw<dwur, dwuq> implements dssk {
    public static final dwur a;
    private static volatile dssr<dwur> b;

    static {
        dwur dwurVar = new dwur();
        a = dwurVar;
        dsqw.cc(dwur.class, dwurVar);
    }

    private dwur() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwur();
            }
            if (i2 == 4) {
                return new dwuq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwur> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwur.class) {
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
