package defpackage;
/* compiled from: PG */
/* renamed from: duvd  reason: default package */
/* loaded from: classes6.dex */
public final class duvd extends dsqw<duvd, duvc> implements dssk {
    public static final duvd a;
    private static volatile dssr<duvd> e;
    private int b;
    private dvzj c;
    private byte d = 2;

    static {
        duvd duvdVar = new duvd();
        a = duvdVar;
        dsqw.cc(duvd.class, duvdVar);
    }

    private duvd() {
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
                return new duvd();
            }
            if (i2 == 4) {
                return new duvc();
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
            dssr<duvd> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duvd.class) {
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