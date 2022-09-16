package defpackage;
/* compiled from: PG */
/* renamed from: durv  reason: default package */
/* loaded from: classes6.dex */
public final class durv extends dsqw<durv, duru> implements dssk {
    public static final durv b;
    private static volatile dssr<durv> e;
    public dopk a;
    private int c;
    private byte d = 2;

    static {
        durv durvVar = new durv();
        b = durvVar;
        dsqw.cc(durv.class, durvVar);
    }

    private durv() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new durv();
            }
            if (i2 == 4) {
                return new duru();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                if (obj == null) {
                    b2 = 0;
                }
                this.d = b2;
                return null;
            }
            dssr<durv> dssrVar = e;
            if (dssrVar == null) {
                synchronized (durv.class) {
                    dssrVar = e;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        e = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.d);
    }
}
