package defpackage;
/* compiled from: PG */
/* renamed from: dmsb  reason: default package */
/* loaded from: classes.dex */
public final class dmsb extends dsqw<dmsb, dmsa> implements dssk {
    public static final dmsb a;
    private static volatile dssr<dmsb> b;

    static {
        dmsb dmsbVar = new dmsb();
        a = dmsbVar;
        dsqw.cc(dmsb.class, dmsbVar);
    }

    private dmsb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dmsb();
            }
            if (i2 == 4) {
                return new dmsa();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dmsb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dmsb.class) {
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
