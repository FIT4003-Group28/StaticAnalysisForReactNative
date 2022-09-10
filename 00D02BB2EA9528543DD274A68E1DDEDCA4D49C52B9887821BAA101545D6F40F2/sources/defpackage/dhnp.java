package defpackage;
/* compiled from: PG */
/* renamed from: dhnp  reason: default package */
/* loaded from: classes6.dex */
public final class dhnp extends dsqw<dhnp, dhno> implements dssk {
    public static final dhnp a;
    private static volatile dssr<dhnp> b;

    static {
        dhnp dhnpVar = new dhnp();
        a = dhnpVar;
        dsqw.cc(dhnp.class, dhnpVar);
    }

    private dhnp() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhnp();
            }
            if (i2 == 4) {
                return new dhno();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhnp> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhnp.class) {
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
