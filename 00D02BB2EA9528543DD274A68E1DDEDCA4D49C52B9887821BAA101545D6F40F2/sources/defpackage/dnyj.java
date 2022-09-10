package defpackage;
/* compiled from: PG */
/* renamed from: dnyj  reason: default package */
/* loaded from: classes6.dex */
public final class dnyj extends dsqw<dnyj, dnyi> implements dssk {
    public static final dnyj c;
    private static volatile dssr<dnyj> d;
    public int a;
    public boolean b;

    static {
        dnyj dnyjVar = new dnyj();
        c = dnyjVar;
        dsqw.cc(dnyj.class, dnyjVar);
    }

    private dnyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dnyj();
            }
            if (i2 == 4) {
                return new dnyi();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dnyj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dnyj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(c);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
