package defpackage;
/* compiled from: PG */
/* renamed from: dwxx  reason: default package */
/* loaded from: classes6.dex */
public final class dwxx extends dsqw<dwxx, dwxw> implements dssk {
    public static final dwxx b;
    private static volatile dssr<dwxx> d;
    public int a;
    private int c;

    static {
        dwxx dwxxVar = new dwxx();
        b = dwxxVar;
        dsqw.cc(dwxx.class, dwxxVar);
    }

    private dwxx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\bဌ\u0000", new Object[]{"c", "a", dqve.a});
            }
            if (i2 == 3) {
                return new dwxx();
            }
            if (i2 == 4) {
                return new dwxw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwxx> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwxx.class) {
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
