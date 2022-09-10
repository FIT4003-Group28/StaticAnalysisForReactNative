package defpackage;
/* compiled from: PG */
/* renamed from: dnke  reason: default package */
/* loaded from: classes6.dex */
public final class dnke extends dsqw<dnke, dnkd> implements dssk {
    public static final dnke a;
    private static volatile dssr<dnke> b;

    static {
        dnke dnkeVar = new dnke();
        a = dnkeVar;
        dsqw.cc(dnke.class, dnkeVar);
    }

    private dnke() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dnke();
            }
            if (i2 == 4) {
                return new dnkd();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnke> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dnke.class) {
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
