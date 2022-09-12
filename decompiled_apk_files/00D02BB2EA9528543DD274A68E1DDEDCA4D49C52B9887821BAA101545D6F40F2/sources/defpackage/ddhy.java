package defpackage;
/* compiled from: PG */
/* renamed from: ddhy  reason: default package */
/* loaded from: classes5.dex */
public final class ddhy extends dsqw<ddhy, ddhx> implements dssk {
    public static final ddhy a;
    private static volatile dssr<ddhy> h;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private byte g = 2;

    static {
        ddhy ddhyVar = new ddhy();
        a = ddhyVar;
        dsqw.cc(ddhy.class, ddhyVar);
    }

    private ddhy() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            }
            if (i2 == 3) {
                return new ddhy();
            }
            if (i2 == 4) {
                return new ddhx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.g = b;
                return null;
            }
            dssr<ddhy> dssrVar = h;
            if (dssrVar == null) {
                synchronized (ddhy.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.g);
    }
}
