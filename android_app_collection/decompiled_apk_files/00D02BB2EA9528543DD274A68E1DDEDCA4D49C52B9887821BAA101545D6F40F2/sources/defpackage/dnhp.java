package defpackage;
/* compiled from: PG */
/* renamed from: dnhp  reason: default package */
/* loaded from: classes6.dex */
public final class dnhp extends dsqw<dnhp, dnho> implements dssk {
    public static final dnhp a;
    private static volatile dssr<dnhp> e;
    private int b;
    private dnhs c;
    private byte d = 2;

    static {
        dnhp dnhpVar = new dnhp();
        a = dnhpVar;
        dsqw.cc(dnhp.class, dnhpVar);
    }

    private dnhp() {
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
                return new dnhp();
            }
            if (i2 == 4) {
                return new dnho();
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
            dssr<dnhp> dssrVar = e;
            if (dssrVar == null) {
                synchronized (dnhp.class) {
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
