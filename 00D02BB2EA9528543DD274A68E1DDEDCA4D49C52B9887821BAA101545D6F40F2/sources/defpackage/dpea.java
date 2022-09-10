package defpackage;
/* compiled from: PG */
/* renamed from: dpea  reason: default package */
/* loaded from: classes6.dex */
public final class dpea extends dsqw<dpea, dpdz> implements dssk {
    public static final dpea a;
    private static volatile dssr<dpea> b;

    static {
        dpea dpeaVar = new dpea();
        a = dpeaVar;
        dsqw.cc(dpea.class, dpeaVar);
    }

    private dpea() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dpea();
            }
            if (i2 == 4) {
                return new dpdz();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dpea> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dpea.class) {
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
