package defpackage;
/* compiled from: PG */
/* renamed from: dwst  reason: default package */
/* loaded from: classes6.dex */
public final class dwst extends dsqw<dwst, dwss> implements dssk {
    public static final dwst b;
    private static volatile dssr<dwst> d;
    public boolean a;
    private int c;

    static {
        dwst dwstVar = new dwst();
        b = dwstVar;
        dsqw.cc(dwst.class, dwstVar);
    }

    private dwst() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwst();
            }
            if (i2 == 4) {
                return new dwss();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwst> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwst.class) {
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
