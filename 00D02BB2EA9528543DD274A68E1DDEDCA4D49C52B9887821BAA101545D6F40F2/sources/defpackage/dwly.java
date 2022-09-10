package defpackage;
/* compiled from: PG */
/* renamed from: dwly  reason: default package */
/* loaded from: classes6.dex */
public final class dwly extends dsqw<dwly, dwlx> implements dssk {
    public static final dwly b;
    private static volatile dssr<dwly> d;
    public dpvc a;
    private int c;

    static {
        dwly dwlyVar = new dwly();
        b = dwlyVar;
        dsqw.cc(dwly.class, dwlyVar);
    }

    private dwly() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwly();
            }
            if (i2 == 4) {
                return new dwlx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwly> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwly.class) {
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
