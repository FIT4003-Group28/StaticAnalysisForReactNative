package defpackage;
/* compiled from: PG */
/* renamed from: diqp  reason: default package */
/* loaded from: classes6.dex */
public final class diqp extends dsqw<diqp, diqo> implements dssk {
    public static final diqp a;
    private static volatile dssr<diqp> b;

    static {
        diqp diqpVar = new diqp();
        a = diqpVar;
        dsqw.cc(diqp.class, diqpVar);
    }

    private diqp() {
        dspd dspdVar = dspd.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new diqp();
            }
            if (i2 == 4) {
                return new diqo();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<diqp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (diqp.class) {
                    dssrVar = b;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        b = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
