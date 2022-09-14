package defpackage;
/* compiled from: PG */
/* renamed from: dohm  reason: default package */
/* loaded from: classes6.dex */
public final class dohm extends dsqw<dohm, dohl> implements dssk {
    public static final dohm a;
    private static volatile dssr<dohm> b;

    static {
        dohm dohmVar = new dohm();
        a = dohmVar;
        dsqw.cc(dohm.class, dohmVar);
    }

    private dohm() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dohm();
            }
            if (i2 == 4) {
                return new dohl();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dohm> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dohm.class) {
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
