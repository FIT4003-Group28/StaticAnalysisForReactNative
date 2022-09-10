package defpackage;
/* compiled from: PG */
/* renamed from: cykl  reason: default package */
/* loaded from: classes5.dex */
public final class cykl extends dsqw<cykl, cykh> implements dssk {
    public static final dsrg<Integer, cykg> b = new cykf();
    public static final cykl g;
    private static volatile dssr<cykl> h;
    public int c;
    public cyjt f;
    public dsrf a = dsqz.b;
    public String d = "";
    public dsrj<cykj> e = dssu.b;

    static {
        cykl cyklVar = new cykl();
        g = cyklVar;
        dsqw.cc(cykl.class, cyklVar);
    }

    private cykl() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i, Object obj) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                return cd(g, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001,\u0002\f\u0003Ȉ\u0004\u001b\u0005\t", new Object[]{"a", "c", "d", "e", cykj.class, "f"});
            }
            if (i2 == 3) {
                return new cykl();
            }
            if (i2 == 4) {
                return new cykh();
            }
            if (i2 == 5) {
                return g;
            }
            if (i2 != 6) {
                return null;
            }
            dssr<cykl> dssrVar = h;
            if (dssrVar == null) {
                synchronized (cykl.class) {
                    dssrVar = h;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        h = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
