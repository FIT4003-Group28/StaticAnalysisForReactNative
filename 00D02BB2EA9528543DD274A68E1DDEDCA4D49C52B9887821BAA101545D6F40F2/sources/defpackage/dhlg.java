package defpackage;
/* compiled from: PG */
/* renamed from: dhlg  reason: default package */
/* loaded from: classes6.dex */
public final class dhlg extends dsqw<dhlg, dhlf> implements dssk {
    public static final dhlg a;
    private static volatile dssr<dhlg> b;

    static {
        dhlg dhlgVar = new dhlg();
        a = dhlgVar;
        dsqw.cc(dhlg.class, dhlgVar);
    }

    private dhlg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dhlg();
            }
            if (i2 == 4) {
                return new dhlf();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dhlg> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dhlg.class) {
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
