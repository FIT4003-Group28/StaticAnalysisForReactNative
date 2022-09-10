package defpackage;
/* compiled from: PG */
/* renamed from: docu  reason: default package */
/* loaded from: classes6.dex */
public final class docu extends dsqw<docu, doct> implements dssk {
    public static final docu a;
    private static volatile dssr<docu> b;

    static {
        docu docuVar = new docu();
        a = docuVar;
        dsqw.cc(docu.class, docuVar);
    }

    private docu() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new docu();
            }
            if (i2 == 4) {
                return new doct();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<docu> dssrVar = b;
            if (dssrVar == null) {
                synchronized (docu.class) {
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
