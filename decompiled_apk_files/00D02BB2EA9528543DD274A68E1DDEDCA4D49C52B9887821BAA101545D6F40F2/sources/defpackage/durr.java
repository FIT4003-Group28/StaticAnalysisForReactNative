package defpackage;
/* compiled from: PG */
/* renamed from: durr  reason: default package */
/* loaded from: classes6.dex */
public final class durr extends dsqw<durr, durq> implements dssk {
    public static final durr a;
    private static volatile dssr<durr> e;
    private int b;
    private dibo c;
    private byte d = 2;

    static {
        durr durrVar = new durr();
        a = durrVar;
        dsqw.cc(durr.class, durrVar);
    }

    private durr() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b = 1;
            if (i2 == 2) {
                return cd(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            }
            if (i2 == 3) {
                return new durr();
            }
            if (i2 == 4) {
                return new durq();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b = 0;
                }
                this.d = b;
                return null;
            }
            dssr<durr> dssrVar = e;
            if (dssrVar == null) {
                synchronized (durr.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
