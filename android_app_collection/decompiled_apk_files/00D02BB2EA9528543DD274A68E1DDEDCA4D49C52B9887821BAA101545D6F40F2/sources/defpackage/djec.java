package defpackage;
/* compiled from: PG */
/* renamed from: djec  reason: default package */
/* loaded from: classes6.dex */
public final class djec extends dsqw<djec, djeb> implements dssk {
    public static final djec a;
    private static volatile dssr<djec> b;

    static {
        djec djecVar = new djec();
        a = djecVar;
        dsqw.cc(djec.class, djecVar);
    }

    private djec() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djec();
            }
            if (i2 == 4) {
                return new djeb();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djec> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djec.class) {
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
