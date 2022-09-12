package defpackage;
/* compiled from: PG */
/* renamed from: dodj  reason: default package */
/* loaded from: classes6.dex */
public final class dodj extends dsqw<dodj, dodi> implements dssk {
    public static final dodj b;
    private static volatile dssr<dodj> d;
    public String a = "";
    private int c;

    static {
        dodj dodjVar = new dodj();
        b = dodjVar;
        dsqw.cc(dodj.class, dodjVar);
    }

    private dodj() {
        dssu<Object> dssuVar = dssu.b;
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "a"});
            }
            if (i2 == 3) {
                return new dodj();
            }
            if (i2 == 4) {
                return new dodi();
            }
            if (i2 == 5) {
                return b;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dodj> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dodj.class) {
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
