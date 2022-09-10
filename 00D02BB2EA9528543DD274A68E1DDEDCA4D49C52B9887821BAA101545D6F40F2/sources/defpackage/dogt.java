package defpackage;
/* compiled from: PG */
/* renamed from: dogt  reason: default package */
/* loaded from: classes6.dex */
public final class dogt extends dsqw<dogt, dogs> implements dssk {
    public static final dogt a;
    private static volatile dssr<dogt> b;

    static {
        dogt dogtVar = new dogt();
        a = dogtVar;
        dsqw.cc(dogt.class, dogtVar);
    }

    private dogt() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dogt();
            }
            if (i2 == 4) {
                return new dogs();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<dogt> dssrVar = b;
            if (dssrVar == null) {
                synchronized (dogt.class) {
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
