package defpackage;
/* compiled from: PG */
/* renamed from: doaf  reason: default package */
/* loaded from: classes6.dex */
public final class doaf extends dsqw<doaf, doae> implements dssk {
    public static final doaf a;
    private static volatile dssr<doaf> b;

    static {
        doaf doafVar = new doaf();
        a = doafVar;
        dsqw.cc(doaf.class, doafVar);
    }

    private doaf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new doaf();
            }
            if (i2 == 4) {
                return new doae();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doaf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (doaf.class) {
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
