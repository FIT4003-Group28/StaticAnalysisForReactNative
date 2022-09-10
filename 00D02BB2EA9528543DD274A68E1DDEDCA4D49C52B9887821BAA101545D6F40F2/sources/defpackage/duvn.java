package defpackage;
/* compiled from: PG */
/* renamed from: duvn  reason: default package */
/* loaded from: classes6.dex */
public final class duvn extends dsqw<duvn, duvm> implements dssk {
    public static final duvn b;
    private static volatile dssr<duvn> e;
    public dkcs a;
    private int c;
    private byte d = 2;

    static {
        duvn duvnVar = new duvn();
        b = duvnVar;
        dsqw.cc(duvn.class, duvnVar);
    }

    private duvn() {
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
                return new duvn();
            }
            if (i2 == 4) {
                return new duvm();
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
            dssr<duvn> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duvn.class) {
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
