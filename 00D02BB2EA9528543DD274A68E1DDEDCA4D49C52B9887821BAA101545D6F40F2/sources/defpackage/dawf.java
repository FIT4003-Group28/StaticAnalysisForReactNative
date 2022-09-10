package defpackage;
/* compiled from: PG */
/* renamed from: dawf  reason: default package */
/* loaded from: classes5.dex */
public final class dawf extends dsqw<dawf, dawe> implements dssk {
    public static final dawf a;
    private static volatile dssr<dawf> b;

    static {
        dawf dawfVar = new dawf();
        a = dawfVar;
        dsqw.cc(dawf.class, dawfVar);
    }

    private dawf() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dawf();
            }
            if (i2 == 4) {
                return new dawe();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dawf> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dawf.class) {
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
