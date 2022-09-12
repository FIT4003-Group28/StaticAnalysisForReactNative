package defpackage;
/* compiled from: PG */
/* renamed from: dwcu  reason: default package */
/* loaded from: classes6.dex */
public final class dwcu extends dsqw<dwcu, dwct> implements dssk {
    public static final dwcu a;
    private static volatile dssr<dwcu> b;

    static {
        dwcu dwcuVar = new dwcu();
        a = dwcuVar;
        dsqw.cc(dwcu.class, dwcuVar);
    }

    private dwcu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dwcu();
            }
            if (i2 == 4) {
                return new dwct();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwcu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dwcu.class) {
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
