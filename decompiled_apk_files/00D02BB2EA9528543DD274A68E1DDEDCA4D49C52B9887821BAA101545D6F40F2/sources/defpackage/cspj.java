package defpackage;
/* compiled from: PG */
/* renamed from: cspj  reason: default package */
/* loaded from: classes5.dex */
public final class cspj extends dsqw<cspj, cspi> implements dssk {
    public static final cspj a;
    private static volatile dssr<cspj> b;

    static {
        cspj cspjVar = new cspj();
        a = cspjVar;
        dsqw.cc(cspj.class, cspjVar);
    }

    private cspj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cspj();
            }
            if (i2 == 4) {
                return new cspi();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cspj> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cspj.class) {
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
