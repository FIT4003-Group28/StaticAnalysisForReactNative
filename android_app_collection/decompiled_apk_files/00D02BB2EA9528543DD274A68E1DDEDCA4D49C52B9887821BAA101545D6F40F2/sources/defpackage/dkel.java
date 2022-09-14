package defpackage;
/* compiled from: PG */
/* renamed from: dkel  reason: default package */
/* loaded from: classes6.dex */
public final class dkel extends dsqw<dkel, dkek> implements dssk {
    public static final dkel c;
    private static volatile dssr<dkel> d;
    public int a;
    public dhjx b;

    static {
        dkel dkelVar = new dkel();
        c = dkelVar;
        dsqw.cc(dkel.class, dkelVar);
    }

    private dkel() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            }
            if (i2 == 3) {
                return new dkel();
            }
            if (i2 == 4) {
                return new dkek();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dkel> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dkel.class) {
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
