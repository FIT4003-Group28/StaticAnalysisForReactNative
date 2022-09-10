package defpackage;
/* compiled from: PG */
/* renamed from: djln  reason: default package */
/* loaded from: classes6.dex */
public final class djln extends dsqw<djln, djlm> implements dssk {
    public static final djln a;
    private static volatile dssr<djln> b;

    static {
        djln djlnVar = new djln();
        a = djlnVar;
        dsqw.cc(djln.class, djlnVar);
    }

    private djln() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new djln();
            }
            if (i2 == 4) {
                return new djlm();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<djln> dssrVar = b;
            if (dssrVar == null) {
                synchronized (djln.class) {
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
