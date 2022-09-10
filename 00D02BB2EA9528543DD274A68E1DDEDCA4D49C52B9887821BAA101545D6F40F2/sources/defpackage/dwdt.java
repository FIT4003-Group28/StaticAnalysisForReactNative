package defpackage;
/* compiled from: PG */
/* renamed from: dwdt  reason: default package */
/* loaded from: classes6.dex */
public final class dwdt extends dsqw<dwdt, dwdq> implements dssk {
    public static final dwdt b;
    private static volatile dssr<dwdt> d;
    public int a;
    private int c;

    static {
        dwdt dwdtVar = new dwdt();
        b = dwdtVar;
        dsqw.cc(dwdt.class, dwdtVar);
    }

    private dwdt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", dwdr.a});
            }
            if (i2 == 3) {
                return new dwdt();
            }
            if (i2 == 4) {
                return new dwdq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwdt> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwdt.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
