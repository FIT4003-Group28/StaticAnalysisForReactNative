package defpackage;
/* compiled from: PG */
/* renamed from: cspd  reason: default package */
/* loaded from: classes5.dex */
public final class cspd extends dsqw<cspd, cspc> implements dssk {
    public static final cspd a;
    private static volatile dssr<cspd> b;

    static {
        cspd cspdVar = new cspd();
        a = cspdVar;
        dsqw.cc(cspd.class, cspdVar);
    }

    private cspd() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new cspd();
            }
            if (i2 == 4) {
                return new cspc();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cspd> dssrVar = b;
            if (dssrVar == null) {
                synchronized (cspd.class) {
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
