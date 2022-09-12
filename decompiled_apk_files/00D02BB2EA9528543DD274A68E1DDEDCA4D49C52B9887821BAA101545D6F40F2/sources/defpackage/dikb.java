package defpackage;
/* compiled from: PG */
/* renamed from: dikb  reason: default package */
/* loaded from: classes6.dex */
public final class dikb extends dsqw<dikb, dika> implements dssk {
    public static final dikb a;
    private static volatile dssr<dikb> b;

    static {
        dikb dikbVar = new dikb();
        a = dikbVar;
        dsqw.cc(dikb.class, dikbVar);
    }

    private dikb() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dikb();
            }
            if (i2 == 4) {
                return new dika();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dikb> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dikb.class) {
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
