package defpackage;
/* compiled from: PG */
/* renamed from: dwhy  reason: default package */
/* loaded from: classes6.dex */
public final class dwhy extends dsqw<dwhy, dwhx> implements dssk {
    public static final dwhy b;
    private static volatile dssr<dwhy> d;
    public String a = "";
    private int c;

    static {
        dwhy dwhyVar = new dwhy();
        b = dwhyVar;
        dsqw.cc(dwhy.class, dwhyVar);
    }

    private dwhy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dwhy();
            }
            if (i2 == 4) {
                return new dwhx();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dwhy> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dwhy.class) {
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
