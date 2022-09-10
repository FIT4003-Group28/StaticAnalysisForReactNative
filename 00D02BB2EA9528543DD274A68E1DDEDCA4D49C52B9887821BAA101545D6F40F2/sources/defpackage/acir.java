package defpackage;
/* compiled from: PG */
/* renamed from: acir  reason: default package */
/* loaded from: classes2.dex */
public final class acir extends dsqw<acir, aciq> implements dssk {
    public static final acir c;
    private static volatile dssr<acir> d;
    public int a;
    public dspd b;

    static {
        acir acirVar = new acir();
        c = acirVar;
        dsqw.cc(acir.class, acirVar);
    }

    private acir() {
        dspd dspdVar = dspd.b;
        this.b = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0001", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new acir();
            }
            if (i2 == 4) {
                return new aciq();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<acir> dssrVar = d;
            if (dssrVar == null) {
                synchronized (acir.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
