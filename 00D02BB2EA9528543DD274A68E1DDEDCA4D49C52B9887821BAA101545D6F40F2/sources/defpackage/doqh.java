package defpackage;
/* compiled from: PG */
/* renamed from: doqh  reason: default package */
/* loaded from: classes6.dex */
public final class doqh extends dsqw<doqh, doqg> implements dssk {
    public static final doqh a;
    private static volatile dssr<doqh> b;

    static {
        doqh doqhVar = new doqh();
        a = doqhVar;
        dsqw.cc(doqh.class, doqhVar);
    }

    private doqh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new doqh();
            }
            if (i2 == 4) {
                return new doqg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<doqh> dssrVar = b;
            if (dssrVar == null) {
                synchronized (doqh.class) {
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
