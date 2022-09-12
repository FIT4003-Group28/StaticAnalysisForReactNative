package defpackage;
/* compiled from: PG */
/* renamed from: dtry  reason: default package */
/* loaded from: classes6.dex */
public final class dtry extends dsqs<dtry, dtrx> implements dsqt {
    public static final dtry a;
    public static final dsqv<dtry, dtsc> b;
    private static volatile dssr<dtry> d;
    private byte c = 2;

    static {
        dtry dtryVar = new dtry();
        a = dtryVar;
        dsqw.cc(dtry.class, dtryVar);
        b = dsqw.newSingularGeneratedExtension(dtryVar, dtsc.a, dtsc.a, null, 307006559, dsur.MESSAGE, dtsc.class);
    }

    private dtry() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new dtry();
            }
            if (i2 == 4) {
                return new dtrx();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            }
            dssr<dtry> dssrVar = d;
            if (dssrVar == null) {
                synchronized (dtry.class) {
                    dssrVar = d;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        d = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return Byte.valueOf(this.c);
    }
}
