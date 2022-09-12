package defpackage;
/* compiled from: PG */
/* renamed from: dwlr  reason: default package */
/* loaded from: classes6.dex */
public final class dwlr extends dsqw<dwlr, dwlq> implements dssk {
    public static final dwlr b;
    private static volatile dssr<dwlr> d;
    public djai a;
    private int c;

    static {
        dwlr dwlrVar = new dwlr();
        b = dwlrVar;
        dsqw.cc(dwlr.class, dwlrVar);
    }

    private dwlr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwlr();
            }
            if (i2 == 4) {
                return new dwlq();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwlr> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwlr.class) {
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
