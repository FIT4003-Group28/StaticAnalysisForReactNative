package defpackage;
/* compiled from: PG */
/* renamed from: dolc  reason: default package */
/* loaded from: classes6.dex */
public final class dolc extends dsqw<dolc, dolb> implements dssk {
    public static final dolc a;
    private static volatile dssr<dolc> b;

    static {
        dolc dolcVar = new dolc();
        a = dolcVar;
        dsqw.cc(dolc.class, dolcVar);
    }

    private dolc() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dolc();
            }
            if (i2 == 4) {
                return new dolb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dolc> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dolc.class) {
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
