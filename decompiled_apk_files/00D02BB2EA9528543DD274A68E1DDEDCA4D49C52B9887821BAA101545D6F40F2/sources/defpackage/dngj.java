package defpackage;
/* compiled from: PG */
/* renamed from: dngj  reason: default package */
/* loaded from: classes6.dex */
public final class dngj extends dsqw<dngj, dngi> implements dssk {
    public static final dngj b;
    private static volatile dssr<dngj> d;
    public String a = "";
    private int c;

    static {
        dngj dngjVar = new dngj();
        b = dngjVar;
        dsqw.cc(dngj.class, dngjVar);
    }

    private dngj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dngj();
            }
            if (i2 == 4) {
                return new dngi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dngj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dngj.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(b);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
