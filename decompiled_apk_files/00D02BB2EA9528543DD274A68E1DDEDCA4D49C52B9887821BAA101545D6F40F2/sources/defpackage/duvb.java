package defpackage;
/* compiled from: PG */
/* renamed from: duvb  reason: default package */
/* loaded from: classes6.dex */
public final class duvb extends dsqw<duvb, duva> implements dssk {
    public static final duvb a;
    private static volatile dssr<duvb> e;
    private int b;
    private duyo c;
    private byte d = 2;

    static {
        duvb duvbVar = new duvb();
        a = duvbVar;
        dsqw.cc(duvb.class, duvbVar);
    }

    private duvb() {
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
                return new duvb();
            }
            if (i2 == 4) {
                return new duva();
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
            dssr<duvb> dssrVar = e;
            if (dssrVar == null) {
                synchronized (duvb.class) {
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
