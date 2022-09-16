package defpackage;
/* compiled from: PG */
/* renamed from: ddfh  reason: default package */
/* loaded from: classes5.dex */
public final class ddfh extends dsqw<ddfh, ddfg> implements dssk {
    public static final ddfh a;
    public static final dsqv<ddhk, ddfh> b;
    private static volatile dssr<ddfh> c;

    static {
        ddfh ddfhVar = new ddfh();
        a = ddfhVar;
        dsqw.cc(ddfh.class, ddfhVar);
        b = dsqw.newSingularGeneratedExtension(ddhk.k, ddfhVar, ddfhVar, null, 571, dsur.MESSAGE, ddfh.class);
    }

    private ddfh() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(a, "\u0001\u0000", null);
            }
            if (i2 == 3) {
                return new ddfh();
            }
            if (i2 == 4) {
                return new ddfg();
            }
            if (i2 == 5) {
                return a;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<ddfh> dssrVar = c;
            if (dssrVar == null) {
                synchronized (ddfh.class) {
                    dssrVar = c;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(a);
                        c = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
