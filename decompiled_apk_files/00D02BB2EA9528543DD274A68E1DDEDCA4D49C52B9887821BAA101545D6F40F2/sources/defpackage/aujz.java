package defpackage;
/* compiled from: PG */
/* renamed from: aujz  reason: default package */
/* loaded from: classes2.dex */
public final class aujz extends dsqw<aujz, aujy> implements dssk {
    public static final aujz b;
    private static volatile dssr<aujz> c;
    public dsrj<aukd> a = dssu.b;

    static {
        aujz aujzVar = new aujz();
        b = aujzVar;
        dsqw.cc(aujz.class, aujzVar);
    }

    private aujz() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aukd.class});
            }
            if (i2 == 3) {
                return new aujz();
            }
            if (i2 == 4) {
                return new aujy();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<aujz> dssrVar = c;
            if (dssrVar == null) {
                synchronized (aujz.class) {
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
