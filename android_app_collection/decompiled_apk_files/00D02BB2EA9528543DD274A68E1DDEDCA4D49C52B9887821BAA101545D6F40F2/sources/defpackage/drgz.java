package defpackage;
/* compiled from: PG */
/* renamed from: drgz  reason: default package */
/* loaded from: classes6.dex */
public final class drgz extends dsqw<drgz, drgw> implements dssk {
    public static final drgz b;
    private static volatile dssr<drgz> c;
    public dsrj<drgy> a = dssu.b;

    static {
        drgz drgzVar = new drgz();
        b = drgzVar;
        dsqw.cc(drgz.class, drgzVar);
    }

    private drgz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", drgy.class});
            }
            if (i2 == 3) {
                return new drgz();
            }
            if (i2 == 4) {
                return new drgw();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<drgz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (drgz.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
