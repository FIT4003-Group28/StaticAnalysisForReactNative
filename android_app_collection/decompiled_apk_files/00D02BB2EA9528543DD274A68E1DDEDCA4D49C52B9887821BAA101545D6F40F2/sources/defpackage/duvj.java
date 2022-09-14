package defpackage;
/* compiled from: PG */
/* renamed from: duvj  reason: default package */
/* loaded from: classes6.dex */
public final class duvj extends dsqw<duvj, duvi> implements dssk {
    public static final duvj a;
    private static volatile dssr<duvj> e;
    private int b;
    private dwge c;
    private byte d = 2;

    static {
        duvj duvjVar = new duvj();
        a = duvjVar;
        dsqw.cc(duvj.class, duvjVar);
    }

    private duvj() {
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
                return new duvj();
            }
            if (i2 == 4) {
                return new duvi();
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
            dssr<duvj> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duvj.class) {
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
