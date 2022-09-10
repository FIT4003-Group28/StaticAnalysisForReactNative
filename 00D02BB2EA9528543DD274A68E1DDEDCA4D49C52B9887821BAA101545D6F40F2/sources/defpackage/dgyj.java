package defpackage;
/* compiled from: PG */
/* renamed from: dgyj  reason: default package */
/* loaded from: classes6.dex */
public final class dgyj extends dsqw<dgyj, dgyi> implements dssk {
    public static final dgyj g;
    private static volatile dssr<dgyj> i;
    public dczt a;
    public dsrj<dczt> b = dssu.b;
    public dsrj<dczt> c = dssu.b;
    public dsrj<dczt> d = dssu.b;
    public String e = "";
    public String f = "";
    private int h;

    static {
        dgyj dgyjVar = new dgyj();
        g = dgyjVar;
        dsqw.cc(dgyj.class, dgyjVar);
    }

    private dgyj() {
    }

    @Override // defpackage.dsqw
    protected final Object OK(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 != 0) {
            if (i3 == 2) {
                return cd(g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b\u0005ဈ\u0001\u0006ဈ\u0002", new Object[]{"h", "a", "b", dczt.class, "c", dczt.class, "d", dczt.class, "e", "f"});
            }
            if (i3 == 3) {
                return new dgyj();
            }
            if (i3 == 4) {
                return new dgyi();
            }
            if (i3 == 5) {
                return g;
            }
            if (i3 != 6) {
                return null;
            }
            dssr<dgyj> dssrVar = i;
            if (dssrVar == null) {
                synchronized (dgyj.class) {
                    dssrVar = i;
                    if (dssrVar == null) {
                        dssrVar = new dsqq<>(g);
                        i = dssrVar;
                    }
                }
            }
            return dssrVar;
        }
        return (byte) 1;
    }
}
