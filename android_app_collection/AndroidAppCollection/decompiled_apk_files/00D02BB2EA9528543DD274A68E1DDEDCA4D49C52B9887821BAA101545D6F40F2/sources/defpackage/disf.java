package defpackage;
/* compiled from: PG */
/* renamed from: disf  reason: default package */
/* loaded from: classes6.dex */
public final class disf extends dsqw<disf, dise> implements dssk {
    public static final disf a;
    private static volatile dssr<disf> b;

    static {
        disf disfVar = new disf();
        a = disfVar;
        dsqw.cc(disf.class, disfVar);
    }

    private disf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new disf();
            }
            if (i2 == 4) {
                return new dise();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<disf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (disf.class) {
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
