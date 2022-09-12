package defpackage;
/* compiled from: PG */
/* renamed from: dime  reason: default package */
/* loaded from: classes6.dex */
public final class dime extends dsqw<dime, dimd> implements dssk {
    public static final dime b;
    private static volatile dssr<dime> c;
    public dsrj<dged> a = dssu.b;

    static {
        dime dimeVar = new dime();
        b = dimeVar;
        dsqw.cc(dime.class, dimeVar);
    }

    private dime() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", dged.class});
            }
            if (i2 == 3) {
                return new dime();
            }
            if (i2 == 4) {
                return new dimd();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dime> dssrVar = c;
            if (dssrVar == null) {
                synchronized (dime.class) {
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
