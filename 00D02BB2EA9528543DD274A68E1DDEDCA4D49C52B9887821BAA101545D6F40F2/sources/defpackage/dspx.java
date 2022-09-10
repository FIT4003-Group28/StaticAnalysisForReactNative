package defpackage;
/* compiled from: PG */
/* renamed from: dspx  reason: default package */
/* loaded from: classes6.dex */
public final class dspx extends dsqw<dspx, dspw> implements dssk {
    public static final dspx a;
    private static volatile dssr<dspx> b;

    static {
        dspx dspxVar = new dspx();
        a = dspxVar;
        dsqw.cc(dspx.class, dspxVar);
    }

    private dspx() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dspx();
            }
            if (i2 == 4) {
                return new dspw();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dspx> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dspx.class) {
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
