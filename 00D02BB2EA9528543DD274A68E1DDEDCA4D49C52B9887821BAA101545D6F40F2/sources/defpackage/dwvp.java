package defpackage;
/* compiled from: PG */
/* renamed from: dwvp  reason: default package */
/* loaded from: classes6.dex */
public final class dwvp extends dsqw<dwvp, dwvo> implements dssk {
    public static final dwvp b;
    private static volatile dssr<dwvp> d;
    public doro a;
    private int c;

    static {
        dwvp dwvpVar = new dwvp();
        b = dwvpVar;
        dsqw.cc(dwvp.class, dwvpVar);
    }

    private dwvp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwvp();
            }
            if (i2 == 4) {
                return new dwvo();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwvp> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwvp.class) {
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
