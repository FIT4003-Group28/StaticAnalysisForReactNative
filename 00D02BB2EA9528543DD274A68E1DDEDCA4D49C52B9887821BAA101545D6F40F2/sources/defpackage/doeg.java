package defpackage;
/* compiled from: PG */
/* renamed from: doeg  reason: default package */
/* loaded from: classes6.dex */
public final class doeg extends dsqw<doeg, doef> implements dssk {
    public static final doeg c;
    private static volatile dssr<doeg> d;
    public int a;
    public int b;

    static {
        doeg doegVar = new doeg();
        c = doegVar;
        dsqw.cc(doeg.class, doegVar);
    }

    private doeg() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", dody.a});
            }
            if (i2 == 3) {
                return new doeg();
            }
            if (i2 == 4) {
                return new doef();
            }
            if (i2 == 5) {
                return c;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doeg> dssrVar = d;
            if (dssrVar == null) {
                synchronized (doeg.class) {
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
