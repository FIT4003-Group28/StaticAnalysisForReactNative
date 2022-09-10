package defpackage;
/* compiled from: PG */
/* renamed from: cspf  reason: default package */
/* loaded from: classes5.dex */
public final class cspf extends dsqw<cspf, cspe> implements dssk {
    public static final cspf a;
    private static volatile dssr<cspf> b;

    static {
        cspf cspfVar = new cspf();
        a = cspfVar;
        dsqw.cc(cspf.class, cspfVar);
    }

    private cspf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cspf();
            }
            if (i2 == 4) {
                return new cspe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cspf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cspf.class) {
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
