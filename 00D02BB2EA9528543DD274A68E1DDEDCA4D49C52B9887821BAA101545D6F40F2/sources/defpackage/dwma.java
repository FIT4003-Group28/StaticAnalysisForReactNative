package defpackage;
/* compiled from: PG */
/* renamed from: dwma  reason: default package */
/* loaded from: classes6.dex */
public final class dwma extends dsqw<dwma, dwlz> implements dssk {
    public static final dwma a;
    private static volatile dssr<dwma> b;

    static {
        dwma dwmaVar = new dwma();
        a = dwmaVar;
        dsqw.cc(dwma.class, dwmaVar);
    }

    private dwma() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwma();
            }
            if (i2 == 4) {
                return new dwlz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwma> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwma.class) {
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
